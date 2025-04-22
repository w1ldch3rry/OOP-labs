
public class Task2 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java for Beginners");
        book.setAuthor("John Doe");
        book.setPrice(299.99);
        book.displayInfo();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
