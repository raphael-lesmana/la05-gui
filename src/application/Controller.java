package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable{
	
	@FXML
	private Spinner<Integer> mySpinner;
	
	@FXML
	private Spinner<Integer> mySpinner1;
	
	@FXML
	private Spinner<Integer> mySpinner2;
	
	@FXML
	private Spinner<Integer> mySpinner3;
	
	@FXML
	private Label myLabel;
	
	int currentValue;
	int currentValue1;
	int currentValue2;
	int currentValue3;
	
	int win;
	
	@Override
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9);
		valueFactory.setValue(0);
		mySpinner.setValueFactory(valueFactory);
		
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9);
		valueFactory1.setValue(0);
		mySpinner1.setValueFactory(valueFactory1);
		
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9);
		valueFactory2.setValue(0);
		mySpinner2.setValueFactory(valueFactory2);
		
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9);
		valueFactory3.setValue(0);
		mySpinner3.setValueFactory(valueFactory3);
		
//		currentValue = mySpinner.getValue();
//		myLabel.setText(Integer.toString(currentValue));
//		
//		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
//			
//			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
//				
//				currentValue = mySpinner.getValue();
//				myLabel.setText(Integer.toString(currentValue));
//				
//			}
//			
//		});
				
	}
	
	public void myButton(ActionEvent e) {
//		x = (int)(Math.random()*100);
//		y = Integer.toString(x);
//		
//		label.setText(y);
//		
//		x = ThreadLocalRandom.current().nextInt(1000, 10000);
//		y = Integer.toString(x);
//		
//		label.setText(y);
//		
//		System.out.println(y);
		
		win = 0;
		
		currentValue = mySpinner.getValue();
		
		if(currentValue == ThreadLocalRandom.current().nextInt(0, 9)) {
			win++;
		}
		
		currentValue1 = mySpinner1.getValue();
		
		if(currentValue1 == ThreadLocalRandom.current().nextInt(0, 9)) {
			win++;
		}
		
		currentValue2 = mySpinner2.getValue();
		
		if(currentValue2 == ThreadLocalRandom.current().nextInt(0, 9)) {
			win++;
		}
		
		currentValue3 = mySpinner3.getValue();
		
		if(currentValue3 == ThreadLocalRandom.current().nextInt(0, 9)) {
			win++;
		}
		
		if(win > 0) {
			myLabel.setText("You got lucky with " + win + " number(s)!");
		}else {
			myLabel.setText("Unfortunately, you didn't win anything");
		}
		
		
	}
	
}
