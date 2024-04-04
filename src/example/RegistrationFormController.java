package example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegistrationFormController {
	@FXML
	private TextField nameField;
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button submitButton;
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event)
	{
		Window owner = submitButton.getScene().getWindow();
		if(nameField.getText().isEmpty())
		{
			Alert alert = new Alert(AlertType.ERROR);
			 alert.setTitle("Form Error!");
			 alert.setHeaderText(null);
			 alert.setContentText("Please enter your name");
			 alert.initOwner(owner);
			 alert.show();
			
		}else if(emailField.getText().isEmpty())
		{
			Alert alert2 = new Alert(AlertType.ERROR);
			 alert2.setTitle("Form Error!");
			 alert2.setHeaderText(null);
			 alert2.setContentText("Please enter your Email");
			 alert2.initOwner(owner);
			 alert2.show();
			
		}else if(passwordField.getText().isEmpty())
		{
			Alert alert3 = new Alert(AlertType.ERROR);
			alert3.setTitle("Form Error!");
			alert3.setHeaderText(null);
			alert3.setContentText("Please enter your password");
			alert3.initOwner(owner);
			alert3.show();
			
		}
		else
		{
			Alert alert = new Alert(AlertType.INFORMATION);
		 alert.setTitle("Registration succussuful!");
		 alert.setHeaderText(null);
		 alert.setContentText("Welcome " + nameField.getText());
		 alert.initOwner(owner);
		 alert.show();
		}
	}
	 @FXML
	    protected void handleExitButtonAction(ActionEvent event) {
		 nameField.setText("");
		    emailField.setText("");
		    passwordField.setText("");
	    }
	 
		   
		


}
