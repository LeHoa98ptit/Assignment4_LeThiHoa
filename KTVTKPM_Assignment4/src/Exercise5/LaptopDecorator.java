package Exercise5;

import java.util.List;

// @author LeHoa

public class LaptopDecorator implements LaptopComponent{
    protected LaptopComponent laps;

    protected LaptopDecorator(LaptopComponent laps){
        this.laps = laps;
    }

    @Override
    public List<Laptop> getAllLaptop() {
        return laps.getAllLaptop();
    }

    @Override
    public void discount() {
        //discount;
    }
}
