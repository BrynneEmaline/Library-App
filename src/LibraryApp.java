import java.util.Scanner;
public class LibraryApp {

    private final BookRepository bookRepo = new BookRepository();


    public void searchByIsbn(Scanner scanner) {
        System.out.println("Enter the ISBN: ");
        String isbn = scanner.nextLine();
       Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
          System.out.println("Book Found - ");
          System.out.println(" title: " + book.getTitle() + "\n" + " author: " + book.getAuthor() + "\n" + " genre: " + book.getGenre() + "\n" +
                  " description: " + book.getDescription());
        }
        else {
            System.out.println("Book not found");
        }
    }
    public void searchByTitle(Scanner scanner) {
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        Book book = bookRepo.findByTitle(title);
        if (book != null) {
            System.out.println("Book Found - ");
            System.out.println(" title: " + book.getTitle() + "\n" + " author: " + book.getAuthor() + "\n" + " genre: " + book.getGenre() + "\n" +
                    " description: " + book.getDescription() + "\n" + " stock: " + book.getStock());
            if (bookRepo.searchStock(title) != 0) {
                System.out.println("Would you like to check this book out? (Y or N) ");
                String choice = scanner.nextLine();
                if (choice.equals("Y") || choice.equals("y")) {
                    rentBook(title);
                } else if (choice.equals("N") || choice.equals("n")) {
                    System.out.println("Returning to main menu. ");
                } else {
                    System.out.println("Invalid choice, returning to main menu. ");
                }
            }
        }
        else {
            System.out.println("Book not found");
        }
    }
    public void searchByAuthor(Scanner scanner) {
        System.out.println("Enter the author: ");
        String author = scanner.nextLine();
        if (bookRepo.findByAuthor(author) != null) {
            System.out.println("Results - ");
            for (int i = 0; i < bookRepo.findByAuthor(author).size(); i++) {
                System.out.println((i + 1) + ". ");
            System.out.println(bookRepo.findByAuthor(author).get(i));
            }
        } else {
            System.out.println("No results found for that author.");
        }
    }

    public void searchByGenre(Scanner scanner) {
        System.out.println("Enter the genre: ");
        String genre = scanner.nextLine();
        if (bookRepo.findByGenre(genre) != null) {
            System.out.println("Results - ");
            for (int i = 0; i < bookRepo.findByGenre(genre).size(); i++) {
                System.out.println((i + 1) + ". ");
                System.out.println(bookRepo.findByGenre(genre).get(i));
            }
        } else {
            System.out.println("No results found for that genre.");
        }
    }

    public void searchByKeyword(Scanner scanner) {
        System.out.println("Enter the keyword: ");
        String keyword = scanner.nextLine();
        if (bookRepo.findByKeyword(keyword) == null) {
            System.out.println("Found no descriptions matching that keyword. ");
        } else {
            System.out.println("Results - ");
            for (int i = 0; i < bookRepo.findByKeyword(keyword).size(); i++) {
                System.out.println((i + 1) + ". " + ((bookRepo.findByKeyword(keyword).get(i))));
            }
        }
    }

    public void rentBook (String title) {
        if (bookRepo.searchStock(title) != 0) {
            System.out.println("Checking out book.");
            bookRepo.lowerStock(title);
        } else {
            System.out.println("Book is currently out of stock.");
        }
    }

    public void displayCheckedOut () {
        System.out.println("Books you've checked out ~~~~~~~~~~~~~~~~~");
        System.out.println();
        if (bookRepo.getCheckedOut().isEmpty()) {
            System.out.println("No books currently checked out.");
        } else {
            for (int i = 0; i < bookRepo.getCheckedOut().size(); i++) {
                if (bookRepo.getCheckedOut().get(i) != null) {
                    System.out.println((i + 1) + ". " + (bookRepo.getCheckedOut().get(i)));
                }
            }
        }
    }
}
