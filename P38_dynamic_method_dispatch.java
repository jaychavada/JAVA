class Phone {
    public void greetFromPhone() {
        System.out.println("Welcome to Nokia");
    }

    public void modelName() {
        System.out.println("This is NOKIA-5233");
    }
}

class SmartPhone extends Phone {
    public void welcome() {
        System.out.println("ALL IS SET");
    }

    @Override
    public void modelName() {
        System.out.println("This is NOKIA-5130");
    }
}

public class P38_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // allowed
        // SmartPhone smob = new SmartPhone(); // allowed
        // obj.modelName();

        // object of super class can be subject of sub class
        Phone mob = new SmartPhone();
        mob.greetFromPhone();
        mob.modelName();
        SmartPhone smob = new SmartPhone();
        smob.welcome();
        smob.modelName();
    }
}