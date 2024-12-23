package jdbc_Basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callable_statement {
public static void main(String[] args) throws SQLException {
	Link objLink=new Link();
	String query="{call display()}";
	Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
	CallableStatement objCallableStatement=objConnection.prepareCall(query);
	ResultSet objResultSet=objCallableStatement.executeQuery();
	while(objResultSet.next())
	{
	System.out.println(objResultSet.getInt(1));
	System.out.println(objResultSet.getString(2));
	System.out.println(objResultSet.getFloat(3));
	}
	
	objConnection.close();
}
}
