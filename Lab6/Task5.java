
public class Task5 {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        Book(String title) {
            this(title, "Невідомий");
        }

        void printInfo() {
            System.out.println("Назва: " + title + ", Автор: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "Джордж Орвелл");
        Book b2 = new Book("Без автора");
        b1.printInfo();
        b2.printInfo();
    }
}
