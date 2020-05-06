package Exercise5;

import java.util.List;

/**
 *
 * @author LeHoa
 */
public interface BookComponent {
    public List<Book> getAllBook();
    public Book getBook(String name);
    public void discount();
}
