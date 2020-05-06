package Exercise5;

// @author LeHoa

import java.util.List;


public class BookDecorator implements BookComponent{
    protected BookComponent books;

    protected BookDecorator(BookComponent books) {
        this.books = books;
    }

    @Override
    public List<Book> getAllBook() {
        return books.getAllBook();
    }

    @Override
    public Book getBook(String name) {
        return books.getBook(name);
    }

    @Override
    public void discount() {
        //discount;
    }

}
