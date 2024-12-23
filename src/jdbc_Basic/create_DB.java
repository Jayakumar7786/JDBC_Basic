package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_DB {

	public static void main(String[] args) throws SQLException{
		String url="jdbc:mysql://localhost:3306/";
		String username="root";
		String password="sql@123"; 
		String query="create database student";
		
		Connection objc=DriverManager.getConnection(url, username, password);
		Statement objs=objc.createStatement();
		 objs.executeUpdate(query);
		 
		 System.out.println("👍");
		
		objc.close();

	}

}
