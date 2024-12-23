package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batch_process {
public static void main(String[] args) throws SQLException {
	Link objLink=new Link();
	String query_1="insert into student values(10,'kiss','IT')";
	String query_2="insert into student values(10,'kiss','IT')";
	
	Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
	Statement objStatement=objConnection.createStatement();
	objStatement.addBatch(query_1);
	objStatement.addBatch(query_2);
	objStatement.executeBatch();
	System.out.println("👍👍");
	objConnection.close();
	}
}
