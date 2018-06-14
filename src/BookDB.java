import java.util.ArrayList;

public class BookDB {

    ArrayList<Book> books;

    public BookDB(){

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book findBook(String sku) {
        for(Book book:books) {
            if(book.sku.equalsIgnoreCase((sku))){
                return book;
            }
        }
        return null;
    }
}
