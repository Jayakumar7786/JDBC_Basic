package jdbc_Basic;

public class Link {

 private String username="root";
 private String password="sql@123";
 private String url="jdbc:mysql://localhost:3306/student";
 
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getUrl() {
	return url;
}
}
