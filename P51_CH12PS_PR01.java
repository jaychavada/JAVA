// package calc;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is:"+ a+b);
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is:"+ sin(a+b));
    }
    
    private String sin(int i) {
        return null;
    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is:"+ a+b);
        System.out.println("Your result is:"+ sin(a+b));
    }

    private String sin(int i) {
        return null;
    }
}

public class P51_CH12PS_PR01 {
    public static void main(String[] args) {
        System.out.println("i am main mathod!");
    }
}