public class Book {
    private String title;
    private String author;
    private Integer price;
    private Integer nrPages;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setNrPages(Integer nrPages) {
        this.nrPages = nrPages;
    }

    @Override
    public String toString() {
        return title;
    }
}
