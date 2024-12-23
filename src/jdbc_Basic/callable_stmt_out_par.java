package jdbc_Basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class callable_stmt_out_par {
public static void main(String[] args) throws SQLException {
	Link objLink=new Link();
	Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
	CallableStatement objCallableStatement=objConnection.prepareCall("{call getname(?,?,?)}");
	objCallableStatement.setInt(1, 20);
	objCallableStatement.registerOutParameter(2,Types.VARCHAR);
	objCallableStatement.registerOutParameter(3, Types.VARCHAR);
	objCallableStatement.executeUpdate();
	
	System.out.println(objCallableStatement.getString(2));
	System.out.println(objCallableStatement.getString(3));
	objConnection.close();
}
}
