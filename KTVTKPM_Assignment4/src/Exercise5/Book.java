package Exercise5;
/**
 *
 * @author LeHoa
 */
public class Book {
    private String name;
    private long price;
    private String publisher;
    private int year;

    public Book(String name, long price, String publisher, int year) {
        this.name = name;
        this.price = price;
        this.publisher = publisher;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
