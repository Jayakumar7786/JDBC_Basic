package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_value_type_3 {
public static void main(String[] args) {
	Scanner objScanner=new Scanner(System.in);
	System.out.print("Enter the id:");
	int id=objScanner.nextInt(); 
	System.out.print("Enter the name:");
	String name=objScanner.next();
	System.out.print("Enter the dept:");
	String dept=objScanner.next();
	Link objLink=new Link();
	String query="insert into student values(?,?,?)";
	try {
		Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
		PreparedStatement objPreparedStatement=objConnection.prepareStatement(query);
		objPreparedStatement.setInt(1, id);
		objPreparedStatement.setString(2, name);
		objPreparedStatement.setString(3, dept);
		int row=objPreparedStatement.executeUpdate();
		
		System.out.println("no of row insert : " + row);
		
		objConnection.close();
	} catch (SQLException e) {
		System.out.println(e);
	}
	objScanner.close();
}
}
