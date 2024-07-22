import java.util.ArrayList;

public class BookRepository {

    /**
     * to add:
     * find by keyword
     *
     */
    private final ArrayList<Book> books = new ArrayList<>();


    public BookRepository() {
        books.add(new Book("87324", "The Dead of Night", "Horror", null, "S.K. Eleton"));
        books.add(new Book("19354", "Last Man Standing", "Mystery", null, "bob jones"));
        books.add(new Book("08912", "Dramatic Plot Point", "Adventure", null, "tim man"));
    }
    public Book findByIsbn(String isbn){
        for(Book book : books) {
           if(book.getIsbn().equals(isbn)){
               return book;
           }
        }
        return null;
    }

    public Book findByTitle(String title){
        for(Book book : books) {
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public Book findByAuthor(String author){
        for(Book book : books) {
            if(book.getAuthor().equals(author)){
                return book;
            }
        }
        return null;
    }
    public Book findByGenre(String genre){
        for(Book book : books) {
            if(book.getGenre().equals(genre)){
                return book;
            }
        }
        return null;
    }
    public Book findByDescription(String description){
        for(Book book : books) {
            if(book.getDescription().equals(description)){
                return book;
            }
        }
        return null;
    }
}
