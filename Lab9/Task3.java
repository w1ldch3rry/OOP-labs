
public class Task3 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
}
