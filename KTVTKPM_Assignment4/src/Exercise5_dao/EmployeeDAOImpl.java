package Exercise5_dao;
//@author LeHoa
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAOImpl implements EmployeeDAO{
    List<Employee> employees;
    public EmployeeDAOImpl() {
        employees = new ArrayList<Employee>();
        Employee emp1 = new Employee(1, "Le Thi Hoa");
        Employee emp2 = new Employee(2, "Vu Thi Hong Nhat");
        employees.add(emp1);
        employees.add(emp2);
    }
    @Override
    public List<Employee> getAllEmployee(){
        return employees;
    }
    @Override
    public Employee getEmployee(int rollNo){
        return employees.get(rollNo);
    }
    @Override
    public void updateEmployee(Employee emp){
        employees.get(emp.getRollNo()).setName(emp.getName());
        System.out.println("Update successful employee - Roll No: " + emp.getRollNo());
    }
    @Override
    public void deleteEmployee(Employee emp){
        employees.remove(emp.getRollNo());
        System.out.println("Delete successfull employee- roll No: " + emp.getRollNo());
    }
    
}
