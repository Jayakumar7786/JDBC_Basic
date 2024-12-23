package jdbc_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_value_type_2 {
public static void main(String[] args) throws SQLException{
	 Link objLink=new Link();
		String query="insert into student values(?,?,?)";
		Connection objConnection=DriverManager.getConnection(objLink.getUrl(),objLink.getUsername(),objLink.getPassword());
		PreparedStatement objPreparedStatement=objConnection.prepareStatement(query);
		
		objPreparedStatement.setInt(1,1);
		objPreparedStatement.setString(2, "balaji");
		objPreparedStatement.setString(3,"IT");
		
		int row = objPreparedStatement.executeUpdate();
		
		System.out.println("no of row insert " + row);
		
		objConnection.close();
}
}
