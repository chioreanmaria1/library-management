import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.sum;

public class Library {
    private ArrayList<Book> books;
    Library(ArrayList<Book> books){
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
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

    public void printBooksFromAList(ArrayList<Book> bookList){
        for (Book book: bookList){
            System.out.println(book.getTitle());
        }
    }

    public void updateBook(Book book, String newTitle, String newAuthor, Integer newPrice, Integer newNrPages){
        if (newTitle != null){
            book.setTitle(newTitle);
        }
        if(newAuthor != null){
            book.setAuthor(newAuthor);
        }
        if (newNrPages != null){
            book.setNrPages(newNrPages);
        }
        if (newPrice != null){
            book.setPrice(newPrice);
        }
    }

    public void removeBook(Book book){
        books.remove(book);
    }
//    public Book getBooksByAuthor(String author) {
//        for (Book book: books){
//            if (author.equals(book.getAuthor())){
//                System.out.println(book.getTitle());
//            }
//        }
//    }
    public ArrayList<Book> getBooksByTitle(ArrayList<String> bookTitles){
        ArrayList<Book> booksByTitle = new ArrayList<>();
        for (Book book: this.books){
            for (String title: bookTitles){
                if (title.equals(book.getTitle())){
                    booksByTitle.add(book);
                }
            }
        }
        return booksByTitle;
    }

    public double getAveragePageNumber(ArrayList<Book> books){
        double sum = 0;
        for (Book book: books){
            sum += book.getNrPages();
        }
        return sum/books.size();
    }

    public void filterBooksByPrice(double maxPrice){
        for (Book book: this.books){
            if (book.getPrice() <= maxPrice){
               System.out.println(book.getTitle());
            }
        }
    }

    public Book getMostExpensiveBook(ArrayList<Book> bookList){
        if (books.isEmpty()){
            return null;
        }
        Book maxBook = new Book();
        int maxPrice = 0;
        for (Book b: bookList){
            if (b.getPrice() > maxPrice){
                maxPrice = b.getPrice();
                maxBook = b;
            }
        }
        return maxBook;
    }

    public ArrayList<Book> getBooksWithMinimumNumberOfPages(int minimumPageNumber){
        ArrayList<Book> booksMinimum = new ArrayList<>();
        for (Book book: books){
            if (book.getNrPages() >= minimumPageNumber){
                booksMinimum.add(book);
            }
        }
        return booksMinimum;
    }

    public ArrayList<BookPair> getTwoBooksWithingTheBudget(int budget){
        ArrayList<BookPair> booksWithinBudget = new ArrayList<>();
        int maxNrPages = 0;
        int maxPrice = 0;
        for (Book book: books){
            for (Book b: books){
                if (book.getTitle().equals(b.getTitle())){
                    continue;
                }
                else{ //cautam cel mai bun pret
                    int bookPriceSum = sum(book.getPrice(), b.getPrice());
                    int nrPages = sum(book.getNrPages(), b.getNrPages());
                    if (bookPriceSum <= budget){
                        if (maxPrice < bookPriceSum){
                            maxPrice = sum(book.getPrice(),b.getPrice());
                            BookPair bookPair = new BookPair(book, b);
                            if (!booksWithinBudget.isEmpty()){
                                booksWithinBudget.removeLast();
                            }
                            booksWithinBudget.add(bookPair);
                        } else if (maxPrice == bookPriceSum) {
                            if (maxNrPages <= nrPages){
                                maxNrPages = nrPages;
                                booksWithinBudget.removeLast();
                                booksWithinBudget.add(new BookPair(book,b));
                            }

                        }

                    }

                }

            }
        }
        return booksWithinBudget;
    }
}
