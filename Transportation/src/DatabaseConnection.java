import java.sql.*;

public class DatabaseConnection 
{
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
