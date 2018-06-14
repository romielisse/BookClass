import java.util.ArrayList;

public class BookDB extends Book{

    ArrayList<Book> books;

    public BookDB() {

    }

    public BookDB(String sku){
        this.sku = sku;
        this.title = book.title;
        this.author = book.author;
        this.description = book.description;
        this.price = book.price;
        this.isInStock = book.isInStock;
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
