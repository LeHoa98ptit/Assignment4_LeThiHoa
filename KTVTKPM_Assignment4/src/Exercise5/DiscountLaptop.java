
package Exercise5;

/**
 *
 * @author LeHoa
 */
public class DiscountLaptop extends LaptopDecorator{

    public DiscountLaptop(LaptopComponent laps) {
        super(laps);
    }
    
    public void Voucher(){
        for(Laptop b: laps.getAllLaptop()){
            int price = b.getPrice();
            float discountt = (float)(15000/price)*100;
            System.out.println("\tName\tPrice\tDesc\tDiscount");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t" 
            + b.getDesc() +"\t"+ discountt + "%");
        }
    }
    
    @Override
    public void discount(){
        laps.discount();
        Voucher();
    }
}
