
public class Task2a {
    public static void main(String[] args) {
        String brand = "Toyota";
        String model = "Corolla";
        int speed = 60;

        speed = accelerate(speed, 20);
        printInfo(brand, model, speed);
    }

    static int accelerate(int currentSpeed, int increment) {
        return currentSpeed + increment;
    }

    static void printInfo(String brand, String model, int speed) {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Швидкість: " + speed);
    }
}
