package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {
public static void main(String[] args)  throws SQLException{
	Link l=new Link();
	 String url="jdbc:mysql://localhost:3306/student";
	 String query="create table student "
	 		+ "(id int,"
	 	    + "name varchar(200),"
	 		+ "dept varchar(100))";
	 
	
		Connection objc=DriverManager.getConnection(url,l.getUsername(),l.getPassword());
			Statement objs=objc.createStatement();
			objs.executeUpdate(query);
			
			System.out.println("👍");
			
			objc.close();
	
}
}
