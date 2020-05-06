package Exercise1.b;
//@author LeHoa

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
