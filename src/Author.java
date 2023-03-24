/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class Author extends Person {

    private final List books;

    @SuppressWarnings({"all", "unchecked"})
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */


    @Deprecated
    @SuppressWarnings({ "all", "deprecated", "unchecked"})
    public List<String> getBooks() {
        return books;
    }


    @SuppressWarnings({"all", "unchecked"})
    public List<String> publishedBooks() {
        return books;
    }

    @SuppressWarnings({"all", "unchecked"})
    public void addBook(String book) {
        books.add(book);
    }


    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
