package todoListDao;

import java.sql.Connection;
import java.sql.SQLException;

import javafx.collections.ObservableList;
import todoConnection.TodoConnection;
import todoListEntity.TodoList;

public interface TodoListDao<T> {
	Connection todoConnect = TodoConnection.todoConnect();
		
		public ObservableList<TodoList> ShowTodList();
		
		boolean createTodoList(T obj) throws SQLException;
		
//		public void readTodoList(String title, String description, Integer categoryId ,String status, String deadline);
		
		public void updateTodoList(String title, String description,Integer categoryId ,String status, String deadline);
		
		public void deleteTodoList(String todoId);

}
