package todoListDaoImpl;

import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import todoListDao.TodoListDao;
import todoListEntity.TodoList;

public class TodoListDaoImpl implements TodoListDao{
	
	Statement statement;

	@Override
	public ObservableList<TodoList> ShowTodList() {
		ObservableList<TodoList> todoL = FXCollections.observableArrayList();
		 
        String readTodoList = "SELECT * FROM todoList";
        
		ResultSet result;
	        
	        try{
	        	statement = todoConnect.createStatement();
	            result = statement.executeQuery(readTodoList);
	            TodoList todoList;
	            while(result.next()){
	            	todoList = new TodoList(
		                		result.getInt("todoId"),
		                		result.getString("title"),
		                		result.getString("description"),
		                		result.getString("status"),
		                		result.getString("deadline"),
		                		result.getInt("categoryId"));
	                
	            	todoL.add(todoList);
	            }
	                
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        return todoL;
	}

	@Override
	public void createTodoList(Integer todoId, String title, String description, String status, String deadline,
			Integer categoryId) {
		String insertTask = "INSERT INTO stdmanagement VALUES (" 
				+ todoId + ",'" 
				+ title + "','" 
				+ description + "','" 
				+ status + "','" 
				+ deadline + "','" 
				+ categoryId + "','";
		       
			try{
				statement = todoConnect.createStatement();
				statement.executeUpdate(insertTask);
				
			}catch(Exception ex){
	            ex.printStackTrace();
	        }
	}

	@Override
	public void readTodoList(Integer todoId, String title, String description, String status, String deadline,
			Integer categoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTodoList(Integer todoId, String title, String description, String status, String deadline,
			Integer categoryId) {
		String updateTask = "UPDATE stdmanagement SET id = '" + todoId + "', "
		 		+ "title = '" + title + "',"
		 		+ "description = '" + description +"',"
		 		+ "status = '" + status + "', "
		 		+ "deadline = '" + deadline + "', "
		 		+ "categoryId = '" + categoryId + "', "
		 		+ "WHERE id =  "+ todoId;
		try{
			statement = todoConnect.createStatement();
			statement.executeUpdate(updateTask);
			
		}catch(Exception ex){
            ex.printStackTrace();

        }
		
	}

	@Override
	public void deleteTodoList(String todoId) {
String deleteTask = "DELETE FROM stdmanagement WHERE id =" + todoId ;
        
		try{
			statement = todoConnect.createStatement();
			statement.executeUpdate(deleteTask);
			
			
		}catch(Exception ex){
            ex.printStackTrace();
		}
		
	}
	
	
}
