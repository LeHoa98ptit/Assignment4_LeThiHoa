package Exercise5;

public class DiscountMobile extends MobileDecorator{
    
    public DiscountMobile(MobileComponent mbs) {
        super(mbs);
    }
    
    public void Voucher(){
        for(Mobile b: mbs.getAllMobile()){
            int price = b.getPrice();
            float discountt = (float)(155000/price)*100;
            System.out.println("\tName\tPrice\tDiscount");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t" 
            +"\t"+ discountt + "%");
        }
    }
    
    @Override
    public void discount(){
        mbs.discount();
        Voucher();
    }
}
