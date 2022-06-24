package todoListDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import todoListDao.TodoListDao;
import todoListEntity.TodoList;

public class TodoListDaoImpl implements TodoListDao<Object>{
	
	Connection connect;
	Statement statement;

	

	

	@Override
	public void updateTodoList(String title, String description, Integer categoryId, String status, String deadline) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTodoList(String todoId) {
		// TODO Auto-generated method stub
		
	}




	
	@Override
	public ObservableList ShowTodList() {
		ObservableList<TodoList> todoL = FXCollections.observableArrayList();
	        
	        try{
	   		 
	            String readTodoList = "SELECT * FROM todolist";
	            
	    		ResultSet result;
	        	
	        	statement = todoConnect.createStatement();
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
	public boolean createTodoList(Object obj) throws SQLException {
		
		return false;
	}

	
	
}
