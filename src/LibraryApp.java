public class LibraryApp {

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
