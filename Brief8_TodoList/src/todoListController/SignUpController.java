package todoListController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import todoListDaoImpl.UserDaoImp;
import todoListEntity.User;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class SignUpController implements Initializable {

	@FXML
	    private TextField first_name_txt;


	    @FXML
	    private TextField last_name_txt;
	    

	    @FXML
	    private TextField username_txt;

	    @FXML
	    private TextField pwd_txt;
	    

	    @FXML
	    private Button inscrir_btn;
	    
	    UserDaoImp userImp = new UserDaoImp();
	    
	

	    @FXML
	    void SignUp(ActionEvent event) {
	    	
	        User user = new User(first_name_txt.getText(), last_name_txt.getText(), username_txt.getText(), pwd_txt.getText());
	    	userImp.create(user);
	    	
	    	
	    	
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}
