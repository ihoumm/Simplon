package view;

import java.sql.SQLException;
import java.util.Scanner;

import domain.Categories;
import domain.Product;
import domain.User;
import impl.CategoryDAOImpl;
import impl.ProductDAOImpl;
import impl.UserDAOImpl;




public class Main {

	public static void main(String[] args) throws SQLException {
		
		  UserDAOImpl userDao = new UserDAOImpl();
		  ProductDAOImpl productDao = new ProductDAOImpl();
		  CategoryDAOImpl categoryDao = new CategoryDAOImpl();

            
			
			
			
			//	================	User   	================
		
			
			

			
			//creat
			
//			User user = new User(3,"User 3","User 3","user3@gmail.com","Guelmim","Maroc");
//	
//			try {
//				System.out.println(userDao.create(user));
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
				
			
			//Read
			
			int userId=0;
			//Scanner reader = new Scanner(System.in);
			
//			
//			System.out.println("Enter User Id: ");
//            userId= reader.nextInt();
//            System.out.println("User Doesnt Exist!");
//            if(userDao.getById(userId)) {
//            System.out.println("User Found SuccessFuly!");
//            System.out.println(userDao.getById(userId));
//            
//	
//            while(!userDao.getById(userId));
	 

            
//			  
//			  System.out.println("----");
			  
			  
			/*
			 * System.out.println(userDao.getAll());
			 */
			
			//Update
			
//	User update = new User(3,"someone","someone","someone@unkown2.com","Agadir","Maroc");
//    System.out.println(userDao.update(3, update)); 
//   
//    System.out.println(userDao.read(3));
//		
//}
	
	
//	Delete

	  
//	  System.out.println(userDao.delete(3));
            
            
            
            
            
            	//	================ Product 	================
            
    			//creat
    			
//    			Product product = new Product(3, "Suits","man clothes",50, 3);
//    	
//    			try {
//					System.out.println(productDao.create(product));
//				} catch (SQLException e) {
//
//					e.printStackTrace();
//				}
    			
    				
    			
    			//Read
    			
//	int productId=0;
//	Scanner reader = new Scanner(System.in);
//	
//	
//	System.out.println("Enter Product Id: ");
//	productId= reader.nextInt();
//    System.out.println("Product Doesn't Exist!");
//    if(productDao.getById(productId)) {
//    System.out.println("Product Found SuccessFuly!");
//    System.out.println(productDao.getById(productId));
//    
//
//    while(!productDao.getById(productId));

                
//    			  
//    			  System.out.println("----");
    			  
    			  
    			/*
    			 * System.out.println(productDao.getAll());
    			 */
    			
    			//Update
    			
//    	Product product = new Product(1,"CelebrationDjellaba","woman clothes",100,1);{
//        try {
//			System.out.println(productDao.update(1, product));
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		} 
//       
//        System.out.println(productDao.read(1));
//    		
//    }
    	
    	
//    	Delete

    	  
//    	  System.out.println(productDao.delete(1));
                
            
            
            
            
	  

//				================  Categories  	================
            
			//create
			
//			Categories category = new Categories(3,"man clothes");
//	
//			try {
//				System.out.println(categoryDao.create(category));
//			} catch (SQLException e) {
//			
//				e.printStackTrace();
//			}
			
				
			
			//Read
			
//int categoryId=0;
//Scanner reader = new Scanner(System.in);
//
//
//System.out.println("Enter Category Id: ");
//categoryId= reader.nextInt();
//System.out.println("Category Doesnt Exist!");
//if(categoryDao.getById(categoryId)) {
//System.out.println("Category Found SuccessFuly!");
//System.out.println(categoryDao.getById(categoryId));
//
//
//while(!categoryDao.getById(categoryId));

            
//			  
//			  System.out.println("----");
			  
			  
			/*
			 * System.out.println(categoryDao.getAll());
			 */
			
			//Update
			
//	Categories update = new Product(1, "Clothes");
//    System.out.println(categoryDao.update(1, update)); 
//   
//    System.out.println(categoryDao.read(1));
////		
//}
	
	
//	Delete

	  
//	  System.out.println(categoryDao.delete(1));
            
        
        
}


}

