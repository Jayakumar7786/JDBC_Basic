package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_value_type_4 {
public static void main(String[] args) {
	Link objLink=new Link();
	Scanner objScanner=new Scanner(System.in);
	System.out.println("Enter the how many details you can insert: ");
	int count=objScanner.nextInt();
	
	String query="insert into student values(?,?,?)";
	try {
		Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
		PreparedStatement objPreparedStatement=objConnection.prepareStatement(query);
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter the Id: ");
			int id=objScanner.nextInt();
			System.out.print("Enter the Name: ");
//			System.out.print("one rule of the name do not give space in between name");
			String name=objScanner.nextLine();
			System.out.print("Enter the dept: ");
			String dept=objScanner.nextLine();
			
		objPreparedStatement.setInt(1,id);
		objPreparedStatement.setString(2, name);
		objPreparedStatement.setString(3, dept);
		
		objPreparedStatement.addBatch();
		}
		objPreparedStatement.executeBatch();
		System.out.println("record successfully insert");
		objConnection.close();
		
	} catch (SQLException e) {
		System.out.println(e);
	}
	objScanner.close();
}
}
