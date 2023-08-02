class c1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void method1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class P50_AccessModifiers {
    public static void main(String[] args) {
        c1 v = new c1();
        v.method1();
    }
}


/*
 * 1. we can use modifiers in same class.
 * 2. we can not use private modifier in same packages
 * 3. we can not use default and private modifier in subclass
 * 4. in world we can only use public modifier
 */