public class LibraryApp {

    /**
     * functionality to add:
     *  - search by genre
     *  - search by keyword (can be in title or description)
     *  - search by author
     *  - recommendations based on genre + keywords
     *  - rent out book online
     *  - inquire how many of book are in stock
     *  - when seeing list of books, can choose to further inspect book
     *          - will give menu to select different info on book
     *
     *
     */

    private final BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
       Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
          System.out.println("title: " + book.getTitle() + " genre: " + book.getGenre() +
                  " description: " + book.getDescription() +  " author: " + book.getAuthor());
        }
        else {
            System.out.println("Book not found");

        }
    }
    public void searchByTitle(String title) {
        Book book = bookRepo.findByTitle(title);
        if (book != null) {
            System.out.println("title: " + book.getTitle() + " genre: " + book.getGenre() +
                    " description: " + book.getDescription() +  " author: " + book.getAuthor());
        }
        else {
            System.out.println("Book not found");

        }
    }









}
