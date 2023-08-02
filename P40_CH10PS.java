class circle {
    public int radius;

    circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return (Math.PI * this.radius * this.radius);
    }
}

class Cylinder1 extends circle {
    public int height;
    
    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return (Math.PI * this.radius * this.radius * this.height);
    }
}

public class P40_CH10PS {
    public static void main(String[] args) {
        // que 01....
        // circle obj = new circle(1);
        // obj.area();
        Cylinder1 objc = new Cylinder1(1, 1);
        System.out.println("volume"+objc.volume());
    }
}