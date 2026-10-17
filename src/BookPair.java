public class BookPair {
    Book firstBook;
    Book seconBook;
    public BookPair(Book firstBook, Book secondBook) {
        this.firstBook  = firstBook;
        this.seconBook = secondBook;
    }

    @Override
    public String toString() {
        return "BookPair{" +
                "firstBook=" + firstBook +
                ", seconBook=" + seconBook +
                '}';
    }
}
