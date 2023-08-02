class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now :");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    // this extends command derives all data from the class base
   
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Setting of Y is:");
        this.y = y;
    }

}

public class P34_inheritance {
    public static void main(String[] args) {
        Base h = new Base();
        h.setX(5);
        System.out.println(h.getX());

        // creating an object from derived class
        Derived d = new Derived();
        d.setY(10);
        System.out.println(d.getY());
    }
}