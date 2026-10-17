import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    void main(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert Martin", 45, 464));
        books.add(new Book("1984", "George Orwell", 18, 328));
        books.add(new Book("Animal Farm", "George Orwell", 12, 112));
        books.add(new Book("Java Basics", "Max Müller", 35, 520));
        books.add( new Book("The Hobbit", "J. R. R. Tolkien", 28, 310));
        books.add(new Book("Harry Potter and the Chamber of Secrets", "J.K Rowling", 35, 523));
        Library library = new Library(books);
//        library.printAllBooks();

//        System.out.println("Author: ");
//        String author = scanner.nextLine();
//        library.getBooksByAuthor(author);

        String[] BOOKS_TITLES = {
                "Clean Code",
                "1984",
                "Animal Farm",
                "Harry Potter",
                "The Hobbit",

        };

//        System.out.printf("%.2f\n",library.getAveragePageNumber(library.getBooksByTitle(BOOKS_TITLES)));
//           library.filterBooksByPrice(30);
//
//        System.out.print(library.getMostExpensiveBook(library.getBooksByTitle(BOOKS_TITLES)));
//        library.getBooksWithMinimumNumberOfPages(300);
        System.out.println("Budget: ");
        int budget = scanner.nextInt();
        System.out.println(library.getTwoBooksWithingTheBudget(budget));

    }
}
