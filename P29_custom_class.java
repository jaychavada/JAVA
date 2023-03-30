class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and My name is " + name);
    }
}

public class P29_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        // INSTANTIATING A NEW EMPLOYEE OBJECT
        Employee jack = new Employee();

        // SETTING ATTRIBUTES
        jack.id = 420;
        jack.name = "Jack sparrow";

        // PRINTING ATTRIBUTES
        jack.printDetails();
        // System.out.println(jack.id);
        // System.out.println(jack.name);
    }
}
