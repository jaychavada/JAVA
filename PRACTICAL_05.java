public class PRACTICAL_05 {

    static void pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        pattern(4);
    }
}
