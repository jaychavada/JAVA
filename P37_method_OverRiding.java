class A{
public int a;
    public int shadow(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class P37_method_OverRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}


/*
 * mathod overloading means same name but different parameters and method overriding means we can change the value for other class constructor....for ex here meth2 is overriding in class B.
 *  RETURN TYPE MUST BE SAME.
 */