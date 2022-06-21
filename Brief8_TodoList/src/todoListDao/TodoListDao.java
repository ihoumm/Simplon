package todoListDao;

import java.sql.Connection;

import javafx.collections.ObservableList;
import todoConnection.TodoConnection;
import todoListEntity.TodoList;

public interface TodoListDao {
	Connection todoConnect = TodoConnection.todoConnect();
		
		public ObservableList<TodoList> ShowTodList();
		
		public void createTodoList(Integer todoId, String title, String description, String status, String deadline, Integer categoryId);
		
		public void readTodoList(Integer todoId, String title, String description, String status, String deadline, Integer categoryId);
		
		public void updateTodoList(Integer todoId, String title, String description, String status, String deadline, Integer categoryId);
		
		public void deleteTodoList(String todoId);

}
