package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import mysqlconnect.DBConnection;
public class StudentDaoImpl implements StudentDao {

	public List<Student> getAllStudent()
	{
		List<Student> list=new ArrayList<>();
		try
		{
			Connection conn=DBConnection.getConnection();
			PreparedStatement st=conn.prepareStatement("select * from student");
			ResultSet resultSet=st.executeQuery();
			while(resultSet.next())
			{
				int roll=resultSet.getInt("roll");
				String name=resultSet.getString("name");
				Student s=new Student(name, roll);
				list.add(s);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		return list;
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
	}

	@Override
	public Student getStudent(int roll) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
