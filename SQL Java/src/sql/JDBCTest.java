package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) 
	{
		
         final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 final String DB_URL = "jdbc:mysql://localhost:3306/ebookshop";
		 final String USER = "root";
		 final String PASS = "root";
		
		 try 
		 {
			Class.forName(JDBC_DRIVER);
		 } 
		 catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		 
		try
		(
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		)
		{
		String strSelect = "select title, price, qty from books";
		System.out.println("The SQL Query is: " + strSelect);
		System.out.println();
		
		ResultSet rset = stmt.executeQuery(strSelect);
		
		System.out.println("The records selected are: ");
        int rowCount = 0;
       
        while(rset.next()) 
        	{   
        		String title = rset.getString("title");
        		double price = rset.getDouble("price");
        		int    qty   = rset.getInt("qty");
        		System.out.println(title + ", " + price + ", " + qty);
        		++rowCount;
        	}
        System.out.println("Total number of records = " + rowCount);
        conn.close();
        
      }catch(SQLException ex)
		{
    	  ex.printStackTrace();
		}

	}

}
