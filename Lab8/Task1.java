
public class Task1 {
    public static void main(String[] args) {
        Employee e = new Employee("Марія", 30, 1000);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getSalary());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
