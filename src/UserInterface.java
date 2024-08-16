
import java.util.Scanner;
public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    LibraryApp libApp = new LibraryApp();
    public void Startup () {
        String choice;
        do {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("What can we help you find?");
            System.out.println("1. Search for book by title");
            System.out.println("2. Search for book by author");
            System.out.println("3. Search for book by genre");
            System.out.println("4. Search for book by ISBN");
            System.out.println("5. Search for book by keyword");
            System.out.println("6. Display your currently checked out books");
            System.out.println("7. Exit app");
            System.out.println("Type the corresponding number to begin your search");
            choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    libApp.searchByTitle(scanner);
                    break;
                case "2":
                    libApp.searchByAuthor(scanner);
                    break;
                case "3":
                    libApp.searchByGenre(scanner);
                    break;
                case "4":
                    libApp.searchByIsbn(scanner);
                   break;
                case "5":
                    libApp.searchByKeyword(scanner);
                    break;
                case "6":
                    libApp.displayCheckedOut();
                    break;
                case "7":
                    System.out.println("Closing Library App! Thank you!");
                    break;

                default:
                    System.out.println("Invalid option, choose again. ");

            }
        } while (!choice.equals("7"));
    }






























    /**
     * this will house the menus the user can navigate through

     *  - initial menu upon boot up:
     *      - welcome to library app - what can we help you find?
     *          - search for a book
     *              - search by title
     *              - search by author
     *              - search by description
     *              - search by keyword
     *              - search by ISBN
     *              - search by genre
     *              - exit app
     *  - menu for list of books after search:
     *      - 1. book a
     *      - 2. book b
     *      - 3. book c
     *      - choose a book to further inspect
     *      - run another search
     *      - exit app
     *  - menu on individual book:
     *      - Book A, Written by Author A, short description, ISBN
     *          - get similar recommendations
     *          - check how many are in stock
     *          - if available, check out book online
     *          - return to list of books
     *          - exit app
     *
     *- have a list of your currently checked out books
     *
     *
     *
     *
     *
     *
     */


}
