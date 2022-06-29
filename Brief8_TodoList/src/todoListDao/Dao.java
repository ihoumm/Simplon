package todoListDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javafx.collections.ObservableList;
import todoConnection.TodoConnection;
import todoListEntity.TodoList;

public interface Dao<T> {
	
	Connection todoConnect = TodoConnection.todoConnect();
	
	List<T> getAll();

	
    public void create(T obj);
    		   
	boolean update(T obj) throws SQLException;

	boolean delete(T obj);
}
