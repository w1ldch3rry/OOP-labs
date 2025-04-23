
public class Task2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
