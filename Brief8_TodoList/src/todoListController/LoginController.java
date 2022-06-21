package todoListController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
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
	
	
	private Parent fxml;
	
	Connection conncet;
	PreparedStatement preStat;
	ResultSet resultset;
	
	// Event Listener on Button[#login_btn].onAction
	@FXML
	public void login(ActionEvent event) throws SQLException {
		String username = username_txt.getText();
		String pwd = password_txt.getText();
		
		if(username.equals("") && pwd.equals("")) {
			JOptionPane.showMessageDialog(null, "Username or Password Incorrect");
		} else {
			Connection todoConnect = TodoConnection.todoConnect();
			
			try {
				preStat = todoConnect.prepareStatement("select * from users where username=? and password=?");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preStat.setString(1, username);
			preStat.setString(2, pwd);
			
			resultset = preStat.executeQuery();
			
			if (resultset.next()) {
				JOptionPane.showMessageDialog(null, "Login Success");
			} else {
				JOptionPane.showMessageDialog(null, "Login Failed");
			}
		}
		
	}
	
	
	
}
