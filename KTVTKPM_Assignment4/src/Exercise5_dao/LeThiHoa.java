package Exercise5_dao;

//@author LeHoa
public class LeThiHoa {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        System.out.println("1. List Employee: \n");
        System.out.println("\tRollNo\tName");
        for(Employee employee: employeeDAO.getAllEmployee()){
            System.out.println("\t" + employee.getRollNo() + "\t" + employee.getName());
        }
        
        System.out.println("\n-------------");
        System.out.println("2. Update Employee");
        Employee employee = employeeDAO.getEmployee(0);
        employee.setName("Tran Hai Linh");
        employeeDAO.updateEmployee(employee);
        System.out.println("\tRollNo\tName");
        System.out.println("\t" + employee.getRollNo() + "\t" + employee.getName());
        
        
    }
}
