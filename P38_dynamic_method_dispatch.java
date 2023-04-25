class Phone {
    public void greet() {
        System.out.println("Hello From Nokia");
    }

    public void name() {
        System.out.println("Model name is NOKIA-5233");
    }
}

class SmartPhone extends Phone {
    public void welcome() {
        System.out.println("ALL IS SET");
    }

    @Override
    public void name() {
        System.out.println("Model name is NOKIA-5130");
    }
}

public class P38_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // allowed
        // SmartPhone smob = new SmartPhone(); // allowed
        // obj.name();

        // object of super class can be subject of sub class
        Phone mob = new SmartPhone();
        mob.greet();
        mob.name();
        SmartPhone smob = new SmartPhone();
        smob.welcome();
        smob.name();
    }
}