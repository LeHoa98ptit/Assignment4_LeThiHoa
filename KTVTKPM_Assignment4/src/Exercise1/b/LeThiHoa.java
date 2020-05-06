package Exercise1.b;
//@author LeHoa
public class LeThiHoa {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();
        System.out.println("1. List Student: \n");
        System.out.println("\tRollNo\tName");
        for(Student student: studentDAO.getAllStudents()){
            System.out.println("\t" + student.getRollNo() + "\t" + student.getName());
        }
        
        System.out.println("\n-------------");
        System.out.println("2. Update Student");
        Student student = studentDAO.getStudent(0);
        student.setName("Tran Hai Linh");
        studentDAO.updateStudent(student);
        System.out.println("\tRollNo\tName");
        System.out.println("\t" + student.getRollNo() + "\t" + student.getName());
        
        System.out.println("\n-------------");
        System.out.println("3. Delete");
        studentDAO.deleteStudent(student);
        System.out.println("\tRollNo\tName");
        System.out.println("\t" +  studentDAO.getStudent(0).getRollNo()
                + "\t" + studentDAO.getStudent(0).getName());
    }
}
