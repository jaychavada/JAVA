// if we try to change value of grand class then we cant change it will throw compilation error

final class grand {
    int i=10;
    void view(){
        System.out.println("This is FINAL class we cant change any value of this");
    }
}
class Parent{
    // final method
    final void Display(){
        System.out.println("This is final block.");
    }
}
class child extends Parent{
    // void Display(){}; 
    // In this we tried to override display but we couldn't reason is that it is FINAL method will throw a compilation error
}
public class P74_final_keyword {
    public static void main(String[] args) {
        final int constantvalue = 10;
        // constantvalue = 20; this cant be changed cause its already declared as final varible

        System.out.println("constantvalue=" + constantvalue);

        Parent p = new Parent();
        p.Display();
    }
}