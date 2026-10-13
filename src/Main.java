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
        Library library = new Library(books);
//        library.printAllBooks();

//        System.out.println("Author: ");
//        String author = scanner.nextLine();
//        library.getBooksByAuthor(author);

        String[] BOOKS_TITLES = {
                "Clean Code",
                "1984",
                "Animal Farm",
                "Harry Potter"
        };

//        System.out.printf("%.2f\n",library.getAveragePageNumber(library.getBooksByTitle(BOOKS_TITLES)));
        library.filterBooksByPrice(library.getBooksByTitle(BOOKS_TITLES),30);
    }
}
