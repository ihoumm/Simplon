package todoListController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import todoConnection.TodoConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

public class LoginController {
	@FXML
	private TextField username_txt;
	@FXML
	private TextField password_txt;
	@FXML
	private Button login_btn;
	
	Connection conncet;
	PreparedStatement preStat;
	ResultSet resultset;
	
	private Stage stage;
	private Scene scene;
	
	// Event Listener on Button[#login_btn].onAction
	@FXML
	public void login(ActionEvent event) throws IOException {
		
		String username = username_txt.getText();
		String pwd = password_txt.getText();
		
		if(username.equals("") && pwd.equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a Username or Password");
			
			} else {
				
			Connection todoConnect = TodoConnection.todoConnect();
			
				try {
					preStat = todoConnect.prepareStatement("select * from users where username=? and password=?");
					preStat.setString(1, username);
					preStat.setString(2, pwd);
					
					resultset = preStat.executeQuery();
					
						if (resultset.next()) {
						
								Parent root = FXMLLoader.load(getClass().getResource("/todoListView/TaskManager.fxml"));
								
//								stage.initStyle(StageStyle.TRANSPARENT);
								stage = (Stage)((Node)event.getSource()).getScene().getWindow();
					            scene= new Scene(root);
					            scene.setFill(Color.TRANSPARENT);
					            stage.setScene(scene);
					            stage.show();
							
							stage.setScene(scene);
							stage.show();
						
						} else {
						JOptionPane.showMessageDialog(null, "Username or Password Incorrect");
							}
			} catch (SQLException e) {
				e.printStackTrace();}}
		}
}
