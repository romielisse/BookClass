public class Book {

    String sku;
    String title;
    String author;
    String description;
    double price;
    Boolean isInStock;

    public Book(){

    }

    public Book(String sku, String title, String author, String description, double price, Boolean isInStock) {
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Book(String title, String author, String description, double price, Boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean isInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    // getDisplayText()
    // Created: June 13, 2018
    // Modified: June 14, 2018 to remove System.out.println
    //           and to only return a string containing the
    //           author, title, and description
    /*
    public void getDisplayText(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
    }
    */

    public String getDisplayText(){
        String s = this.title + "\n" + this.author + "\n" + this.description;
        return s;
    }

    public double getPrice(int numBooks){
        if(this.isInStock()) {
            return numBooks * price;
        }
        return 0;
    }
}
