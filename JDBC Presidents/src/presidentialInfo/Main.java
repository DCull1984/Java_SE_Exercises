package presidentialInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) 
	{
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/U_S_Presidents";
		final String USER = "root";
		final String PASS = "root";
		 
		try 
		{
			Class.forName(JDBC_DRIVER);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try
		(
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		)
		{
			LOAD DATA
			
		
			
		
		ResultSet rset = stmt.executeQuery();
		
		conn.close();
		
      }catch(SQLException ex)
		{
    	  ex.printStackTrace();
		}

	}
}
