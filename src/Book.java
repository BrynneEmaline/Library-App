public class Book {

    private final String isbn;
    private final String title;
    private final String genre;
    private final String description;
    private final String author;
    private int stock;



    public Book (String isbn, String title, String genre, String description, String author, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public void lowerStock() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("Stock is already zero.");
        }
    }
}
