package todoListDao;

import javafx.collections.ObservableList;
import todoListEntity.TodoList;

public interface TodoListDao {
		
		public ObservableList<TodoList> ShowTodList();
		
		public void createTodoList(Integer todoId, Integer categoryId, String title, String description, String status, String deadline);
		
		public void readTodoList(Integer todoId, Integer categoryId, String title, String description, String status, String deadline);
		
		public void updateTodoList(Integer todoId, Integer categoryId, String title, String description, String status, String deadline);
		
		public void deleteTodoList(String todoId);

}
