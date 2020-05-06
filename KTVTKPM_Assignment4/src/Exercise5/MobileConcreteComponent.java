package Exercise5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LeHoa
 */
public class MobileConcreteComponent implements MobileComponent{
    List<Mobile> bms;

    public MobileConcreteComponent() {
        bms = new ArrayList<Mobile>();
        Mobile mb1 = new Mobile("Samsung", 5000000);
        Mobile mb2 = new Mobile("Oppo", 4000000);
        bms.add(mb1);
        bms.add(mb2);
    }

    @Override
    public List<Mobile> getAllMobile() {
        return bms;
    }

    @Override
    public void discount() {
        //discount
    }
}
