package com.sousskills.dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoManagement <T>{
	
	public void create(T obj);
	
	public List<T> getAll();
    
	public T getById(int id);
    		   
    public void update(T obj);

	public void delete(int id);

}
