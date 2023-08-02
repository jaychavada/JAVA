public class P25_varargs {
    static int sum(int x, int... arr) {
        // available as int [] arr;
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void printNum(int... numbers) {
        System.out.println("Numbers of Arguments: " + numbers.length);
        System.out.println("Arguments:");

        for(int i:numbers){
            System.out.println(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 & 5 is: " + sum(4, 5));
        System.out.println("The sum of 4 5 & 6 is: " + sum(4, 5, 6));
        System.out.println("The sum of 4 5 6 & 7 is: " + sum(4, 5, 6, 7));

        printNum();
        printNum(1, 2, 3);
        printNum(10, 20, 30, 40, 50);
    }
}