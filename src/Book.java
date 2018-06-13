public class Book {

    String title;
    String author;
    String description;
    double price;
    Boolean isInStock;

    public Book(){

    }

    public Book(String title, String author, String description, double price, Boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
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

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public void getDisplayText(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
    }
}
