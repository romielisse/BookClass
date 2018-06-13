import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("James and the Giant Peach",
                "Roald Dahl",
                "When poor James Henry Trotter loses his parents in a horrible\n rhinoceros accident, he is forced to live with his two wicked\n aunts. Then one day, a wizened old man gives James a bag of\n " +
                        "magic crystals.",
                6.39,
                true,
                5);

        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");
        double price;
        int numBooks;

        // Print book info: author, title, book description
        book1.getDisplayText();

        System.out.printf("\nEnter number of books for price request: ");
        numBooks = sc.nextInt();

        // Return price of books if in stock
        price = book1.getPrice(numBooks);

        // getPrice() returns 0 if the book is not in stock or the number
        // of books available is less than what the user asked for
        if(price > 0) {
            // Print price if number of copies in stock can meet user's demand
            System.out.println("The price of " + numBooks +  " book(s) is: $" + formatter.format(price));
        }
        else{
            // Print num of copies available if in stock
            if(book1.numInStock > 0){
                System.out.println("Number of copies in stock: " + book1.numInStock);
            }
            // Else, notify user book is out of stock
            else {
                System.out.println("Unfortunately, this book is out of stock.");
            }
        }

    }
}
