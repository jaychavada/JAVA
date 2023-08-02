class Outerclass {
    private int outervar = 20;

    class innerclass {
        private int innervar = 30;

        public void displayOuter() {
            System.out.println("OuterVariable: " + outervar +" InnerVariable:"+innervar);
        }
    }
}

public class P75_inner_outerclass {
    public static void main(String[] args) {
        Outerclass out = new Outerclass();
        Outerclass.innerclass in = out.new innerclass();
        in.displayOuter();
    }
}
