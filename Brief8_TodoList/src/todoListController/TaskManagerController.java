package todoListController;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import todoListDaoImpl.TodoDaoImp;
import todoListEntity.TodoList;
import javafx.scene.control.TableColumn;


public class TaskManagerController implements Initializable{
		
		@FXML
	    private TableView<TodoList> table;
	    @FXML
	    private TableColumn<TodoList, String> title_col;
	    @FXML
	    private TableColumn<TodoList, String> desc_col;
	    @FXML
	    private TableColumn<TodoList, Integer> cat_col;
	    @FXML
	    private TableColumn<TodoList, String> Stat_col;
	    @FXML
	    private TableColumn<TodoList, String> deadline_col;
	    @FXML
	    private TableColumn<?, ?> action_col;
	    @FXML
	    private Button addTask_btn;
	    @FXML
	    private Button logOut_btn;
	    
	    TodoDaoImp todoDaoImp = new TodoDaoImp();
	    
	    Connection connect;
		Statement statement;
		
		 private Stage stage;
		private Scene scene;
	    
	    @FXML
	    void AddTask(ActionEvent event) {
	    	Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("/todoListView/AddNewTask.fxml"));
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	            scene= new Scene(root);
	            scene.setFill(Color.TRANSPARENT);
//	            stage.initStyle(StageStyle.TRANSPARENT);
	            stage.setScene(scene);
	            stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	   

	    @FXML
	    void LogOut(ActionEvent event) {
	    	Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("/todoListView/Main.fxml"));
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
	    
	  
	    public ObservableList ShowTodList() {
			ObservableList<TodoList> todoL = FXCollections.observableArrayList();
		        
		        try{
		   		 
		            String readTodoList = "SELECT * FROM todolist";
		            
		    		ResultSet result;

		        	statement = connect.createStatement();
		            result = statement.executeQuery(readTodoList);
		            TodoList todoList;
		            while(result.next()){
		            	todoList = new TodoList();
		                
		            	todoL.add(todoList);
		            }
		                
		        }catch(Exception ex){
		            ex.printStackTrace();
		        }
		        return todoL;
		}
	    
	   

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			ShowTodList();		
		}
}
