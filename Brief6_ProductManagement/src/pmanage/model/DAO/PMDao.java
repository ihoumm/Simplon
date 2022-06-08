package pmanage.model.DAO;

public interface PMDao<T> {
	
	  
	  
	  
	//CRUD	
	
	
		boolean create(T item) throws ClassNotFoundException;
		
		boolean read(int id) throws ClassNotFoundException;

		boolean update(int id, T item) throws ClassNotFoundException;

		boolean delete(int id) throws ClassNotFoundException;

}
