package Exercise5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LeHoa
 */
public class LaptopConcreteComponent implements LaptopComponent{
    List<Laptop> laptops;

    public LaptopConcreteComponent() {
        laptops = new ArrayList<Laptop>();
        Laptop lap1 = new Laptop("Dell", 15000000, "Dell 7557 - RAM 8GB - HDD 1T");
        Laptop lap2 = new Laptop("HP", 14000000, "HP 1234 - RAM 8GB - HDD 1T");
        laptops.add(lap1);
        laptops.add(lap2);
    }

    @Override
    public List<Laptop> getAllLaptop() {
        return laptops;
    }

    @Override
    public void discount() {
        //discount
    }
}
