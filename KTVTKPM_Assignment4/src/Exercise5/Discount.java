package Exercise5;
/**
 *
 * @author LeHoa
 */
public class Discount extends BookDecorator{
    public Discount(BookComponent books) {
        super(books);
    }
    public void Voucher(){
        for(Book b: books.getAllBook()){
            long price = b.getPrice();
            float discountt = (float)(15000/price)*100;
            System.out.println("\tName\tPrice\tPublisher\tYear\tDicount");
            System.out.println("\t"+ b.getName() + "\t" + b.getPrice() + "\t"
            + b.getPublisher() + "\t" + b.getYear() +"\t"+ discountt + "%");
        }
    }
    
    @Override
    public void discount(){
        books.discount();
        Voucher();
    }

}
