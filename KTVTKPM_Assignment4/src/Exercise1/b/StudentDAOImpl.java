package Exercise1.b;
//@author LeHoa

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student(1, "Le Thi Hoa");
        Student student2 = new Student(2, "Vu Thi Hong Nhat");
        students.add(student1);
        students.add(student2);
    }
    
    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public Student getStudent(int rollNo){
        return students.get(rollNo);
    }
    
    @Override
    public void updateStudent(Student student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Update successful student - Roll No: " + student.getRollNo());
    }
    
    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
        System.out.println("Delete successfull student - roll No: " + student.getRollNo());
    }
    
}
