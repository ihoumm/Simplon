package todoListController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import todoConnection.TodoConnection;
import todoListEntity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.event.ActionEvent;

public class SignUpController {
	@FXML
	private TextField username_txt;
	@FXML
	private TextField pwd_txt;
	@FXML
	private Button inscrir_btn;
	
	
	Connection todoConnect = TodoConnection.todoConnect();
	// Event Listener on Button[#inscrir_btn].onAction
	@FXML
	public void SignUp(ActionEvent event) throws SQLException {
		
		
		
	}
	
	
}
