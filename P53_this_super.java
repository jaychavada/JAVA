class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); // Invoking superclass constructor
        this.model = model;
    }

    public void display() {
        super.display(); // Accessing superclass method
        System.out.println("Model: " + model);
    }
}
public class P53_this_super {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.display(); 
    }
}