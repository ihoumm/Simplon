package todoListController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainController implements Initializable{
	@FXML
	private Button Login_btn;
	@FXML
	private Button signUp_btn;
	@FXML
	private VBox VBox;
	
	// Parent FXML
	private Parent fxml;
	
	// Event Listener on Button[#Login_btn].onAction
	@FXML
	public void login(ActionEvent event) {
		TranslateTransition translateT = new TranslateTransition();
		translateT.setDuration(Duration.millis(500));
		translateT.setNode(VBox);
		translateT.setToX(VBox.getLayoutX() * 19);
		translateT.play();
		
		translateT.setOnFinished(e ->{
			try {
				fxml = FXMLLoader.load(getClass().getResource("/todoListView/Login.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
	// Event Listener on Button[#signUp_btn].onAction
	@FXML
	public void signUp() {
		TranslateTransition translateT = new TranslateTransition();
		translateT.setDuration(Duration.millis(500));
		translateT.setNode(VBox);
		translateT.setToX(5);
		
		translateT.play();
		
		translateT.setOnFinished(e ->{
			try {
				fxml = FXMLLoader.load(getClass().getResource("/todoListView/SignUp.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		});
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TranslateTransition translateT = new TranslateTransition();
		translateT.setDuration(Duration.millis(500));
		translateT.setNode(VBox);
		translateT.setToX(VBox.getLayoutX() * 19);
		translateT.play();
		
		translateT.setOnFinished(e ->{
			try {
				fxml = FXMLLoader.load(getClass().getResource("/todoListView/Login.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	}
}
