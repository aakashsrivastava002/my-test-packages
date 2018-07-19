package mysqlconnect;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import java.sql.CallableStatement;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;

import java.sql.Connection;

public class JDBCdemo {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash", "root", "");
//			//here aakash is db name,root is  username and password
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from student");
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1)+" "+rs.getString(2));
//			}
//
//			int roll=210;
//			String newName="MyName";
//			stmt=con.createStatement();
//			int numberupdate=stmt.executeUpdate("insert into student values ("+roll+","+newName+");");
//			System.out.println("update rows "+numberupdate); or it is easier when we use prepared statement
//			PreparedStatement pst=con.prepareStatement("insert into student values(?,?)");
//			pst.setInt(1,roll);
//			pst.setString(2, newName);
//			pst.executeUpdate();
//		
//			CallableStatement proCall=con.prepareCall("call insertuser(?,?)");
//			proCall.setInt(1, 217);
//			proCall.setString(2, "Rajan");
//			proCall.execute();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		try {
			StudentDao stDao =new StudentDaoImpl();
			List<Student> allStudents =stDao.getAllStudent();
			for(Student s: allStudents)
				System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		//DBConnection.close();

	}

}
