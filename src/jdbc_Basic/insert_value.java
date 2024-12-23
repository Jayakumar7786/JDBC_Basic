package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_value {
public static void main(String[] args) throws SQLException {
	 Link objLink=new Link();
	String query="insert into student values(4,'loki','IT')";
	Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
	Statement objStatement=objConnection.createStatement();
	int row = objStatement.executeUpdate(query);
	
	System.out.println("no of row insert " + row);
	
	objConnection.close();
}
}

