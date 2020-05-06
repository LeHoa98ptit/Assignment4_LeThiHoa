package Exercise5;

import java.util.ArrayList;
import java.util.List;
 // @author LeHoa
public class BookConcreteComponent implements BookComponent{
    
    List<Book> books;

    public BookConcreteComponent() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Design Pattern", 200000, "Tutorialpoint.com", 2020);
        Book book2 = new Book("PTTK", 150000, "Thay Tran Dinh Que", 2020);
        books.add(book1);
        books.add(book2);
    }

    @Override
    public List<Book> getAllBook() {
        return books;
    }
    

    @Override
    public Book getBook(String name) {
        for(Book  book: books){
            if(book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

    @Override
    public void discount() {
        //discount
    }
     
}
