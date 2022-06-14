package stdManage.dao;

import java.sql.SQLException;
import java.util.List;

import stdManage.entity.Student;

public interface StdDAO {
	
	//CRUD	
	boolean Create(Student student) throws ClassNotFoundException, SQLException;
	
	public List<Student> showStudents();

	boolean Update(int id, Student student) throws ClassNotFoundException;

	boolean Delete(int id) throws ClassNotFoundException;
	
	
}
