public class Book {
    /**
     * to add:
     * book stock
     * if book can be rented out
     */
    private final String isbn;
    private final String title;
    private final String genre;
    private final String description;
    private final String author;

    public Book (String isbn, String title, String genre, String description, String author) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
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
}
