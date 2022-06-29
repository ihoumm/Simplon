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
import todoListDaoImpl.TodoDaoImp;
import todoListEntity.TodoList;
import java.io.IOException;

import javafx.event.ActionEvent;

public class AddNewTaskController {
	@FXML
	private TextField title_txt;
	@FXML
	private TextField desc_txt;
	@FXML
	private TextField cat_txt;
	@FXML
	private TextField status_txt;
	@FXML
	private TextField deadline_txt;
	@FXML
	private Button save_btn;
	
	private Stage stage;
	private Scene scene;
	
	TodoDaoImp todoDaoImp = new TodoDaoImp();
	
	// Event Listener on Button[#save_btn].onAction
	@FXML
	public void SaveTask(ActionEvent event) {
		
		TodoList todoL = new TodoList(
				
				title_txt.getText(),
				desc_txt.getText(),
				Integer.parseInt(cat_txt.getText()),
				status_txt.getText(),
				deadline_txt.getText());
		
		todoDaoImp.create(todoL);
		
	}
	
	@FXML
    void Home(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/todoListView/TaskManager.fxml"));
//			stage.initStyle(StageStyle.TRANSPARENT);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene= new Scene(root);
	        scene.setFill(Color.TRANSPARENT);
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

    }
}
