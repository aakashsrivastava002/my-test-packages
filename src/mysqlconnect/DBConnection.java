package mysqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection=null;
	//@SuppressWarnings("unused")
	private DBConnection()
	{
		System.out.println("Creating connection");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash", "root", "");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connection=" + connection);
	}
	public static Connection getConnection() {
		
		try {
			
			if(connection == null || connection.isClosed())
			{
				new DBConnection();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("returning " + connection);
		return connection;
	}
//	public static void close()
//	{
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
