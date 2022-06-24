package todoListController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import todoListDaoImpl.TodoListDaoImpl;
import todoListEntity.TodoList;

import java.io.IOException;

import javafx.collections.ObservableList;
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
	
	TodoListDaoImpl list = new TodoListDaoImpl();
	
	// Event Listener on Button[#save_btn].onAction
	@FXML
	public void SaveTask(ActionEvent event) {
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
