import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class BookApp {

    static Scanner sc = new Scanner(System.in);
    static NumberFormat formatter = new DecimalFormat("#0.00");
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        // Populate books
        populateBooksDB(books);

        // Print book info: author, title, book description
        //printBookInfo(books.get(0));

        // Get price for num of books requested
        //getPrice(books.get(0));

        // Get book based on SKU entered by the user
        getBook();





    }

    protected static void populateBooksDB(ArrayList<Book> books){
        books.add(new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates","Kathy Sierra and Bert Bates",47.50,true));
        books.add(new Book("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",20,true));
        books.add(new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place",45,true));
        books.add(new Book("Python1004","Automate the Boring Stuff with Python","Al Sweigart","Fun with Python",10.50,false));
        books.add(new Book("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50,true));
        books.add(new Book("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",14.75,false));
    }

    protected static void printBookInfo(Book book) {
        book.getDisplayText();
    }

    protected static void getPrice(Book book) {
        int numBooks;
        double price;

        System.out.printf("\nEnter number of books for price request: ");
        numBooks = sc.nextInt();

        // Return price of books if in stock
        price = book.getPrice(numBooks);

        // getPrice() returns 0 if the book is not in stock or the
        // Returns the total price if in stock
        if(price > 0) {
            // Print price if number of copies in stock can meet user's demand
            System.out.println("The price of " + numBooks +  " book(s) is: $" + formatter.format(price));
        }
        else{
            System.out.println("Unfortunately, this book is out of stock.");
        }
    }

    protected static void getBook(){
        String sku = "";
        Book book = new Book();

        System.out.printf("Enter SKU to get book: ");
        sku = sc.nextLine();

        for(Book b:books){
            if(b.sku.equalsIgnoreCase(sku)){
                book = b;
            }
        }

        book.getDisplayText();
    }
}
