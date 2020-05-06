package Exercise2.a;
import java.util.Date;
//@author LeHoa
public class EmployeeConcreteComponent implements EmployeeComponent{
    private String name;
     
    public EmployeeConcreteComponent (String name){
        this.name = name;
    }
 
    @Override
    public String getName() {
        return name;
    }
 
    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + formatDate(joinDate));
    }
 
    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));     
    }
 
    @Override
    public void doTask() {
        // Unassigned task
    }
}
