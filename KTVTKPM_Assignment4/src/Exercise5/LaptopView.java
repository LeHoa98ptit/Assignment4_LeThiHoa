package Exercise5;

/**
 *
 * @author LeHoa
 */
public class LaptopView {
    public void display(){
        LaptopComponent laptops = new LaptopConcreteComponent();
        System.out.println("Laptop normal:");
        for(Laptop b: laptops.getAllLaptop()){
            System.out.println("\tName\tPrice\tDesc");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t"
            + b.getDesc());
        }
        System.out.println("Laptop discount:");
        LaptopComponent laptop_voucher = new DiscountLaptop(laptops);
        laptop_voucher.discount();
    }
}
