// we can use the static keyword with varibles and methods

class MyClass {
    // Static variable
    static int staticVar = 0;

    // Constructor to increment the staticVar
    MyClass() {
        staticVar++;
    }
}
class Maths {
    // Static method
    static int findMax(int a, int b){
        return a>b ? a : b;
    }
}

public class P73_static_keyword {
    public static void main(String[] args) {
        // MyClass a = new MyClass();
        // MyClass b = new MyClass();

        // System.out.println(("static variable is:" +a.staticVar));
        // System.out.println(("static variable is:" +b.staticVar));

        int num1 = 10;
        int num2 = 20;
        
        int max = Maths.findMax(num1, num2);
        System.out.println("Max is:" +max);
    }
}