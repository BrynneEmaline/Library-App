import java.util.ArrayList;

public class BookRepository {

    /**
     * to add:
     * find by keyword
     *
     */
    private final ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> checkedOut = new ArrayList<>();


    public BookRepository() {
        books.add(new Book("87324", "The Dead of Night", "Horror", "Scary story told from the horrible narration of a skeleton.", "S.K. Eleton", 10));
        books.add(new Book("19354", "Last Man Standing", "Mystery", "Scandal and intrigue surround this detective.", "Bob Jones", 3));
        books.add(new Book("28912", "Dramatic Plot Point", "Adventure", "Drama and lots of action scenes.", "Tim Man",1));
        books.add(new Book("28916", "Dramatic Plot Point 2", "Adventure", "Even more dramatic somehow.", "Tim Man",1));
        books.add(new Book("28917", "Dramatic Plot Point 3", "Adventure", "The final drama.", "Tim Man",1));
        books.add(new Book("34579", "Ufo Bonanza", "Science Fiction", "Are aliens real?", "Tom Nook",1));
        books.add(new Book("33489", "Lizard People", "Science Fiction", "Who runs the government?", "John Jones",1));
        books.add(new Book("34852", "Bigfoot Up Close", "Science Fiction", "Is it a really hairy man or a cryptid?", "Bethany Willis",1));
        books.add(new Book("56788", "Big Strong Man", "Romance", "Steamy romance between Lady protagonist and big man.", "Steph Mayo",1));
        books.add(new Book("12365", "Swords and Stuff", "Fantasy", "Magic spells, sword fights, curses and hexes galore!", "Ron Weasley",1));
        books.add(new Book("77856", "Oops War Again!", "Non Fiction", "Will humanity destroy itself finally?", "Emily Bemily",1));
        books.add(new Book("02394", "Flowers", "Poetry", "Poems about nature", "Sylvia Pee",1));
        books.add(new Book("02334", "Dirt", "Poetry", "More poems about nature", "Sylvia Pee",1));
        books.add(new Book("02394", "Sky", "Poetry", "Even more poems about nature", "Sylvia Pee",1));
        books.add(new Book("02394", "Rhyming Simon", "Poetry", "Boy I hope you like rhyming poems.", "Simon Cowell",1));
        books.add(new Book("02394", "Sing Songs", "Poetry", "Poems you should sing from the rooftops.", "Singer Lady",1));
        books.add(new Book("93459", "Super Special Awesome Guy", "Manga", "He is the most unique man ever! He always wins!", "Yoshi Green",1));
        books.add(new Book("97862", "Very Realistic Dialog", "Manga", "Why show when you can tell?", "Wario Coins",1));


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
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<String> findByAuthor(String author) {
        ArrayList<String> booksByAuthor = new ArrayList<>();
        for(Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book.getTitle());
            }
        }
        if (booksByAuthor.isEmpty()) {
            return null;
        }
        return booksByAuthor;
    }
    public ArrayList<String> findByGenre(String genre) {
        ArrayList<String> booksInGenre = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                booksInGenre.add(book.getTitle());
            }
        }
        if (booksInGenre.isEmpty()) {
            return null;
        }
        return booksInGenre;
    }
    public ArrayList<String> findByKeyword(String keyword) {
        ArrayList<String> booksWithKeyword = new ArrayList<>();
        for (Book book : books) {
            if (book.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                booksWithKeyword.add(book.getTitle());
        }
        if (booksWithKeyword.isEmpty()) {
            return null;
        }
        return booksWithKeyword;
    }


    public int searchStock (String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                return book.getStock();
            }
        }
        return 0;
    }
    public void lowerStock(String title) {
        for(Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.lowerStock();
                checkedOut.add(title);
            }
        }
    }

    public ArrayList<String> getCheckedOut() {
        return checkedOut;
    }
}
