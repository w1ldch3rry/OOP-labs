
public class Task3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Барсик");
        dog.walk();
        dog.makeSound();
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
