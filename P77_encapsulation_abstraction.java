// Abstraction: Creating an abstract class
abstract class Shape {
    abstract void draw(); // Abstract method representing a common behavior for all shapes
}

// Encapsulation: Creating a class with private data and public methods to access them
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Encapsulation: Providing getter and setter methods to access and modify the private field
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Abstraction: Implementing the abstract method for drawing the circle
    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class P77_encapsulation_abstraction {
    public static void main(String[] args) {
        // Encapsulation: Creating an instance of Circle
        Circle circle = new Circle(5.0);

        // Abstraction: Using the abstract method to draw the circle
        circle.draw();

        // Encapsulation: Accessing the private field using a getter method
        System.out.println("Circle radius: " + circle.getRadius());

        // Encapsulation: Modifying the private field using a setter method
        circle.setRadius(7.5);

        // Encapsulation: Accessing the modified private field using a getter method
        System.out.println("Updated circle radius: " + circle.getRadius());
    }
}