package dao;
import java.util.List;
import model.Student;
public interface StudentDao
{
	List<Student> getAllStudent();
	void updateStudent(Student s);
	boolean deleteStudent(Student s);
	void addStudent(Student s);
	Student getStudent(int roll);
}

