package Exercise1.a;
 //@author LeHoa
public class LeThiHoa {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("lehoa98ptit@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("lehoa98ptiti@gmail.com", 
                "034.693.2044");
    }
}
