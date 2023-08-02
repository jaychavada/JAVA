abstract class base001{
    public base001(){
        System.out.println("I am a constructor of base001 class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class next extends base001{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class next2 extends base001{
    public void th(){
        System.out.println("I am fine thanks!");
    }
}
public class P42_abstract {
    public static void main(String[] args) {
        next n = new next();
        n.greet();
        n.greet2();
    }
}