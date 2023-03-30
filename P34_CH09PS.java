class cylinder {
    private int radius;
    private int height;

    // use of constructor for que 03
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    public double volume() {
        return (Math.PI * radius * radius * height);
    }
}

class Ractangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    // this is constructor
    public Ractangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Ractangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class P34_CH09PS {
    public static void main(String[] args) {
        // que 01....
        // cylinder mycylinder = new cylinder();
        // mycylinder.setHeight(50);
        // System.out.println("Height of cylinder is:" + " " + mycylinder.getHeight());

        // mycylinder.setRadius(20);
        // System.out.println("Radius of cylinder is:" + " " + mycylinder.getRadius());

        // // que 02...
        // System.out.println("Surface Area of cylinder is:" + " " +
        // mycylinder.surfaceArea());

        // System.out.println("The volume of cylinder is:" + " " + mycylinder.volume());

        // que 03...
        cylinder mycylinder1 = new cylinder(40, 60);
        System.out.println("Height of cylinder is:" + " " + mycylinder1.getHeight());
        System.out.println("Radius of cylinder is:" + " " + mycylinder1.getRadius());
        
        Ractangle rac = new Ractangle();
        System.out.println("Length of Ractangle A is :"+" "+ rac.getLength());
        System.out.println("breadth of Ractangle A is :"+" "+ rac.getBreadth());
        
        Ractangle rac1 = new Ractangle(12,56);
        System.out.println("Length of Ractangle B is :"+" "+ rac1.getLength());
        System.out.println("breadth of Ractangle B is :"+" "+ rac1.getBreadth());
    }
}
