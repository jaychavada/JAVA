class cylinder01 {
    private int radius;
    private int height;

    // use of constructor for que 03
    public cylinder01(int radius, int height) {
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

class Ractangle01 {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    // this is constructor
    public Ractangle01() {
        this.length = 4;
        this.breadth = 5;
    }
    public Ractangle01(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class P34_CH09PS {
    public static void main(String[] args) {
        // que 01....
        // cylinder01 mycylinder01 = new cylinder01();
        // mycylinder01.setHeight(50);
        // System.out.println("Height of cylinder01 is:" + " " + mycylinder01.getHeight());

        // mycylinder01.setRadius(20);
        // System.out.println("Radius of cylinder01 is:" + " " + mycylinder01.getRadius());

        // // que 02...
        // System.out.println("Surface Area of cylinder01 is:" + " " +
        // mycylinder01.surfaceArea());

        // System.out.println("The volume of cylinder01 is:" + " " + mycylinder01.volume());

        // que 03...
        cylinder01 mycylinder011 = new cylinder01(40, 60);
        System.out.println("Height of cylinder01 is:" + " " + mycylinder011.getHeight());
        System.out.println("Radius of cylinder01 is:" + " " + mycylinder011.getRadius());
        
        Ractangle01 rac = new Ractangle01();
        System.out.println("Length of Ractangle01 A is :"+" "+ rac.getLength());
        System.out.println("breadth of Ractangle01 A is :"+" "+ rac.getBreadth());
        
        Ractangle01 rac1 = new Ractangle01(12,56);
        System.out.println("Length of Ractangle01 B is :"+" "+ rac1.getLength());
        System.out.println("breadth of Ractangle01 B is :"+" "+ rac1.getBreadth());
    }
}
