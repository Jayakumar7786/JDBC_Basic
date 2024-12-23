package jdbc_Basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class call_stmt_in_par {
public static void main(String[] args) throws SQLException {
	Link objLink=new Link();
	Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
	CallableStatement objCallableStatement=objConnection.prepareCall("{call put(?,?,?)}");
	objCallableStatement.setInt(1, 20);
	objCallableStatement.setString(2, "jarane");
	objCallableStatement.setString(3, "ECE");
	objCallableStatement.executeUpdate();
	System.out.println("👍");
}
}
