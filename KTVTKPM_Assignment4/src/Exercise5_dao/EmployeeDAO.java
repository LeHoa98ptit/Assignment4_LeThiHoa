package Exercise5_dao;
//@author LeHoa

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();
    public Employee getEmployee(int rollNo);
    public void updateEmployee(Employee emp);
    public void deleteEmployee(Employee emp);
}
