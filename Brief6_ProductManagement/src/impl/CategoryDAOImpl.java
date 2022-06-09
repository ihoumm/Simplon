package impl;




	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import dao.DAO;
import domain.Categories;
import pmanage.model.DB.DBConnect;

	public class CategoryDAOImpl  implements DAO  <Categories>{
		
		
		@Override
		public Categories read(int id) {


			return null;
		}

	//category
		
	//CREAT 
		@Override
		public boolean create(Categories category) throws SQLException {
			String insertSql = "INSERT INTO Categories (IdCategory, CategoryName) VALUES (?, ?)";
			
			PreparedStatement preStat = connect.prepareStatement(insertSql);
			
				preStat.setInt(1, category.getIdCategory());
				preStat.setString(2, category.getCategoryName());
							;
						
					
						
				
			
		int result = preStat.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(preStat);
						DBConnect.closeConnection(connect);
						
			return false;
			
		}
		
	//Read

		@Override
		public List<Categories> getAll() {
			List<Categories> Listercategory = new ArrayList<>();
		try {
			String selectSql = "SELECT *  FROM Categories";
			Statement stat = connect.createStatement();
			ResultSet results = stat.executeQuery(selectSql);

			while (results.next()) {
				Categories category = new Categories();
				category.setIdCategory(results.getInt("Idcategory"));
				category.setCategoryName(results.getString("CategoryName"));
				

				Listercategory.add(category);
				
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return Listercategory;
		}



		public boolean getById(int id)  {
		 try {
			 Statement stat = connect.createStatement();
			
			 System.out.println(id);
				ResultSet result = stat.executeQuery("SELECT *FROM Categories WHERE IdCategory ="+ id);
					 if (result.next()) {
							

						return true;
					 }
					 
				}catch (Exception e) {
					e.printStackTrace();
				}

			

				return false;
			}
		
	
    //Update
		@Override
		public boolean update(int id, Categories category) throws SQLException {
			
			String updateSql = "UPDATE Categories set Idcategory = ?, CategoryName = ?  where IdCategory = ?";
//			
	
				PreparedStatement preStat = connect.prepareStatement(updateSql);
				
				preStat.setInt(1, category.getIdCategory());
				preStat.setString(2, category.getCategoryName());
			
				int result = preStat.executeUpdate();
				

				
				if(result == 1) {
					return  true;
				}
					
								DBConnect.closePreparedStatement(preStat);
								DBConnect.closeConnection(connect);
								
					return false;
					
				}
	

	//Delete
	
		@Override
		 public boolean delete(int id) {

		    try {
		        Statement stat = connect.createStatement();
		        int i = stat.executeUpdate("DELETE FROM Categories WHERE IdCategory=" + id);

		      if(i == 1) {
		        return true;
		      }
			    stat.close();
			    connect.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}
		
}


