import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

	public int cash = 1000;
	
    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        HBox spinner_layout = new HBox();
        ArrayList<Spinner<Integer>> spinners = new ArrayList<Spinner<Integer>>();
        for (int i = 0; i < 4; i++) {
        	spinners.add(new Spinner<Integer>(0, 9, 0));
        	spinners.get(i).setEditable(true);
        }
        
        Label l = new Label("Choose four lucky numbers!");
        Button btn = new Button("I'm Feeling Lucky!");
   
        spinner_layout.getChildren().addAll(spinners);
        box.getChildren().add(spinner_layout);
        box.getChildren().addAll(l, btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	public void handle(ActionEvent arg) {
        		int wins = 0;
            	for (int i = 0; i < 4; i++) {
            		if (spinners.get(i).getValue() == ThreadLocalRandom.current().nextInt(0, 10))
            			wins++;
            	}
            	if (wins > 0) 
            		l.setText("You got lucky with " + wins + " number(s)! You ");
            	else 
            		l.setText("Unfortunately, you didn't win anything");
        	}
        });
        
        Scene scene = new Scene(box, 320, 240);
        stage.setScene(scene);
        stage.setTitle("Tugas GUI dengan JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}