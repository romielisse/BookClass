public class BookDB extends Book {

    Book book;

    public BookDB(){

    }

    public Book getBook(String sku) {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
