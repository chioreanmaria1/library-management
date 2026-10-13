public class Book {
    String title;
    String author;
    Integer price;
    Integer nrPages;

    Book(String title, String author, Integer price, Integer nrPages){
        this.title = title;
        this.author = author;
        this.price = price;
        this.nrPages = nrPages;
    }
    Book(){};

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNrPages() {
        return nrPages;
    }

    @Override
    public String toString() {
        return title;
    }
}
