class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Deep copy constructor
    public Employee(Employee original) {
        this.name = new String(original.name);
        this.age = original.age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
public class P79_deep_copy {
    public static void main(String[] args) {
         Employee emp1 = new Employee("John", 30);

        // Creating a deep copy of emp1
        Employee emp2 = new Employee(emp1);

        // Modifying emp1 will NOT affect emp2 as they have their own copy of data
        emp1.name = "Alice";
        emp1.age = 25;

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
    }
}
