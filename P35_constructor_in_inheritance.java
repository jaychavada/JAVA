class base1 {
    base1() {
        System.out.println("I am a constructor");
    }

    base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as :" + x);
    }
}

class Derived1 extends base1 {
    Derived1() {
        super(10); // this is used for run a constructor with argument from base1
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor with value of y as :" + y);
    }
}

class ChildofDerived extends Derived1 {
    ChildofDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildofDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor with value of z as :" + z);
    }
}

public class P35_constructor_in_inheritance {
    public static void main(String[] args) {
        // base1 b = new base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(4, 7);
        // ChildofDerived cd = new ChildofDerived();
        // ChildofDerived cs = new ChildofDerived(10, 20, 30);
    }
}

/*
 * NOTE: CONSTRUCTOR OF BASE CLASS WILL BE EXECUTED FIRST AND THEN DERIVED CLASS
 * CONTRUCTOR WILL BE EXECUTED.
 */