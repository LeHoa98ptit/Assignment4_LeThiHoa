package Exercise5;

public class MobileView {
    public void display(){
        MobileComponent mbs = new MobileConcreteComponent();
        System.out.println("Mobile normal:");
        for(Mobile b: mbs.getAllMobile()){
            System.out.println("\tName\tPrice");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t");
        }
        System.out.println("Mobile discount:");
        MobileComponent mobile_voucher = new DiscountMobile(mbs);
        mobile_voucher.discount();
    }
}
