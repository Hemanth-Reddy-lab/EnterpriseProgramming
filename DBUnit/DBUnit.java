package DBUnit;
import java.sql.*;
public class DBUnit 
{
	final static String forNameUrl="com.mysql.cj.jdbc.Driver";
	final static String dbURL="jdbc:mysql://localhost:3306/stuBean";
	final static String user="root";
	final static String password="root";
	public  Connection DBConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName(forNameUrl);
		Connection con=DriverManager.getConnection(dbURL,user,password);
		return con;
	}

}
