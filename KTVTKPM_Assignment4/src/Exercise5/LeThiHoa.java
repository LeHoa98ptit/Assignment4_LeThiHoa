package Exercise5;
import java.util.Scanner;
public class LeThiHoa {
    public static void main(String[] args) throws Exception {
        ViewItemFacade view = new ViewItemFacade();
        Scanner scanner = new Scanner(System.in);
        int choose=0;
        do {
            System.out.println("Bạn muốn xem sản phẩm nào");
            System.out.println("1. Book");
            System.out.println("2. Laptop");
            System.out.println("3. Mobile");
            System.out.println("4. Exit");
            System.out.println("Hãy nhập lựa chọn");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    view.bookV();
                case 2:
                    view.laptopV();
                case 3:
                    view.mobileV();
                default:
                    System.out.println("Mời quý khách xem thêm các mẫu trong cửa hàng.");
            }
        } while (choose != 4);
    }
}
