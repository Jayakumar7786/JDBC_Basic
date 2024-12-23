package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select_value {
public static void main(String[] args) {
	Link l=new Link();
	 try {
		Connection objConnection=DriverManager.getConnection(l.getUrl(),l.getUsername(),l.getPassword());
		Statement objStatement=objConnection.createStatement();
		ResultSet objResultSet=objStatement.executeQuery("select * from student");
		while(objResultSet.next()) {
			
		System.out.println("id: " + objResultSet.getInt(1));
		System.out.println("name: " + objResultSet.getString(2));
		System.out.println("dept: " + objResultSet.getString(3)) ;
		System.out.println("----------------");
		}
		
		objConnection.close();
		
	} catch (SQLException e) {
	System.out.println(e);
	}
	 
}
}
