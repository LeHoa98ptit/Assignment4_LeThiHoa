package Exercise5;
/**
 *
 * @author LeHoa
 */
public class BookView {

    public void display(){
        BookComponent books = new BookConcreteComponent();
        System.out.println("Sach normal:");
        for(Book b: books.getAllBook()){
            System.out.println("\tName\tPrice\tPublisher\tYear");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t"
            + b.getPublisher() + "\t" + b.getYear());
        }
        System.out.println("Sach discount:");
        BookComponent book_voucher = new Discount(books);
        book_voucher.discount();
    }

}
