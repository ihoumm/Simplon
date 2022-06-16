package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import std.Student;

import java.net.URL;
import java.util.ResourceBundle;

import impl.StudentDaoImpl;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class MainStdManageController implements Initializable {
	@FXML
	private TextField id_txt;
	@FXML
	private TextField firstName_txt;
	@FXML
	private TextField lastName_txt;
	@FXML
	private TextField email_txt;
	@FXML
	private TextField address_txt;
	@FXML
	private TextField city_txt;
	@FXML
	private TextField country_txt;
	@FXML
	private Button add_btn;
	@FXML
	private Button update_btn;
	@FXML
	private Button delete_btn;
	@FXML
	private TableView<Student> table;
	@FXML
	private TableColumn<Student, Integer> id_col;
	@FXML
	private TableColumn<Student, String> firstName_col;
	@FXML
	private TableColumn<Student, String> lastName_col;
	@FXML
	private TableColumn<Student, String> email_col;
	@FXML
	private TableColumn<Student, String> address_col;
	@FXML
	private TableColumn<Student, String> city_col;
	@FXML
	private TableColumn<Student, String> country_col;
	
	StudentDaoImpl list = new StudentDaoImpl();

	// Event Listener on Button[#add_btn].onAction
	@FXML
	public void add(ActionEvent event) {
		list.Create (
				id_txt.getText(),
				firstName_txt.getText(),
				lastName_txt.getText(),
				email_txt.getText(),
				address_txt.getText(),
				city_txt.getText(),
				country_txt.getText());
		
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Student Registration");
		
		alert.setHeaderText("Student Registration");
		alert.setContentText("Student Added Successfully");
		
		alert.showAndWait();
		
		showStudents();
	}
	// Event Listener on Button[#update_btn].onAction
	@FXML
	public void update(ActionEvent event) {
		list.Update (
			   	id_txt.getText(),
			   	firstName_txt.getText(),
				lastName_txt.getText(),
				email_txt.getText(),
				address_txt.getText(),
				city_txt.getText(),
				country_txt.getText());
	   
	   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Student Registration");
		
		alert.setHeaderText("Student Registration");
		alert.setContentText("Student Updatedd Successfully");
		
		alert.showAndWait();
	   
		showStudents();
	}
	// Event Listener on Button[#delete_btn].onAction
	@FXML
	public void delete(ActionEvent event) {
		
		list.Delete (id_txt.getText());
		showStudents();
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Student Registration");
		
		alert.setHeaderText("Student Registration");
		alert.setContentText("Student Deleted Successfully");
		
		alert.showAndWait();
    	
		showStudents();
	}
	
	 @Override
	   	public void initialize(URL arg0, ResourceBundle arg1) {
	       	
	       	showStudents();	
	   	}
	    
	    public void showStudents() {
			ObservableList<Student> listStudents =  list.StudentList();
			
			id_col.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
			firstName_col.setCellValueFactory(new PropertyValueFactory<Student,String>("first_name"));
			lastName_col.setCellValueFactory(new PropertyValueFactory<Student,String>("last_name"));
			email_col.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
			address_col.setCellValueFactory(new PropertyValueFactory<Student,String>("address"));
			city_col.setCellValueFactory(new PropertyValueFactory<Student,String>("city"));
			country_col.setCellValueFactory(new PropertyValueFactory<Student,String>("country"));
			
			table.setItems(listStudents);
		}
}
