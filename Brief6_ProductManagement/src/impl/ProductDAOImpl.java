package impl;


	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import dao.DAO;
import domain.Product;
import pmanage.model.DB.DBConnect;

	public class ProductDAOImpl  implements DAO  <Product>{
		
		
		@Override
		public Product read(int id) {


			return null;
		}

	//Product
		
	//CREAT 
		@Override
		public boolean create(Product product) throws SQLException {
			String insertSql = "INSERT INTO Products (IdProduct, ProductName, CategoName, Stock , IdCategory) VALUES (?, ?, ?, ?,?)";
			
			PreparedStatement preStat = connect.prepareStatement(insertSql);
			
						preStat.setInt(1, product.getIdProduct());
						preStat.setString(2, product.getProductName());
						preStat.setString(3, product.getCategoName());
						preStat.setInt(4, product.getStock());
						preStat.setInt(5, product.getIdCategory());
						
					
						
				
			
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
		public List<Product> getAll() {
			List<Product> ListerProduct = new ArrayList<>();
		try {
			String selectSql = "SELECT *  FROM Products";
			Statement stat = connect.createStatement();
			ResultSet result = stat.executeQuery(selectSql);

			while (result.next()) {
				Product product = new Product();
				product.setIdProduct(result.getInt("IdProduct"));
				product.setProductName(result.getString("ProductName"));
				product.setCategoName(result.getString("CategoName"));
				product.setStock(result.getInt("Stock"));
				product.setIdCategory(result.getInt("IdCategory"));

				ListerProduct.add(product);
				
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerProduct;
		}



		public boolean getById(int id)  {
		 try {
			 Statement stmt = connect.createStatement();
			
			 System.out.println(id);
				ResultSet result = stmt.executeQuery("SELECT *FROM Products WHERE IdProduct ="+ id);
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
		public boolean update(int id, Product product) throws SQLException {
			
			String updateSql = "UPDATE Products set IdProduct = ?, ProductName = ?, CategoName = ?, Stock = ? , IdCategory = ? where IdProduct = ?";
//			
	
				PreparedStatement preStat = connect.prepareStatement(updateSql);
				
				preStat.setInt(1, product.getIdProduct());
				preStat.setString(2, product.getProductName());
				preStat.setString(3, product.getCategoName());
				preStat.setInt(4, product.getStock());
				preStat.setInt(5, product.getIdCategory());
				preStat.setInt(6, id);
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
		        int i = stat.executeUpdate("DELETE FROM Products WHERE IdProduct=" + id);

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



