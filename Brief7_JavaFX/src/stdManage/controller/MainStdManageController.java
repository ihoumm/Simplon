package stdManage.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import stdManage.entity.Student;

public class MainStdManageController implements Initializable {
	
	 @FXML
	    private TextField txtid;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtFName;

	    @FXML
	    private TextField txtLName;

	    @FXML
	    private TextField txtAddress;

	    @FXML
	    private TextField txtCity;

	    @FXML
	    private TextField txtCountry;

	    @FXML
	    private Button btnAdd;

	    @FXML
	    private Button btnUpdate;

	    @FXML
	    private Button btnDelete;

	    @FXML
	    private TableView<Student> table;

	    @FXML
	    private TableColumn<Student, Integer> id_col;

	    @FXML
	    private TableColumn<Student, String> email_col;

	    @FXML
	    private TableColumn<Student, String> fname_col;

	    @FXML
	    private TableColumn<Student, String> lname_col;

	    @FXML
	    private TableColumn<Student, String> address_col;

	    @FXML
	    private TableColumn<Student, String> city_col;

	    @FXML
	    private TableColumn<Student, String> country_col;
	    
	    @FXML
	    void btnAction(ActionEvent event) {
	    	
	    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ObservableList<Student> list = FXCollections.observableArrayList(
				
				new Student(8, "user8@user8.ma", "user8", "user8", "somewhere", "MA", "MA"),
				new Student(9, "ihoum@hotmail.com", "ihoum", "mustapha", "Rue 655 N 14 inezgane", "Agadir", "MA"),
				new Student(10, "ihoum@hotmail.com", "ihoum", "abdo", "Rue 655 N 14 inezgane", "Agadir", "MA"));
		
		id_col.setCellValueFactory(new PropertyValueFactory<Student, Integer> ("id"));
		email_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("Email"));
		fname_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("fisrt_name"));
		lname_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("last_name"));
		address_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("address"));
		city_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("city"));
		country_col.setCellValueFactory(new PropertyValueFactory<Student, String> ("country"));
		
		table.setItems(list);		
		
	}
}
