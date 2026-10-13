import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    ArrayList<Book> books;
    Library(ArrayList<Book> books){
        this.books = books;
    }


    public void addBook(Book book){
        books.add(book);
    }

    //prints the title only
    public void printAllBooks(){
        for (Book book: this.books){
            System.out.println(book.getTitle());
        }
    }

    public void updateBook(Book book, String newTitle, String newAuthor, Integer newPrice, Integer newNrPages){
        if (newTitle != null){
            book.title = newTitle;
        }
        if(newAuthor != null){
            book.author = newAuthor;
        }
        if (newNrPages != null){
            book.nrPages = newNrPages;
        }
        if (newPrice != null){
            book.price = newPrice;
        }
    }

    public void removeBook(Book book){
        books.remove(book);
    }
    public void getBooksByAuthor(String author) {
        for (Book book: books){
            if (author.equals(book.author)){
                System.out.println(book.getTitle());
            }
        }
    }
    public ArrayList<Book> getBooksByTitle(String[] bookTitles){
        ArrayList<Book> booksByTitle = new ArrayList<>();
        for (Book book: this.books){
            for (String title: bookTitles){
                if (title.equals(book.title)){
                    booksByTitle.add(book);
                }
            }
        }
        return booksByTitle;
    }

    public double getAveragePageNumber(ArrayList<Book> books){
        double sum = 0;
        for (Book book: books){
            sum += book.nrPages;
        }
        return sum/books.size();
    }

}
