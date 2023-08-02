public class P24_methods_overloading {
    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(String name){
        System.out.println("Good Morning" + " " +name);
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a +" ");
        System.out.println("Good morning " + b +" ");
    }
    static void change(int a) {
        a = 100;
    }

    static void change2(int[] arr) {
        arr[0] = 80;
    }

    static void telljoke() {
        System.out.println("I invented World!\n" + "game_world");
    }

    public static void main(String[] args) {
        // telljoke();

        // CASE 1 : FOR CHANGING THE INTEGER

        int x =90;
        change(x);
        // this simply copy the value of x in CHANGE not updating the value of a
        System.out.println("The value of X after running change is: " +x);

        // CASE 2 : FOR CHANGING THE ARRAY

        int[] marks = { 12, 23, 34, 43, 56, 98 };
        change2(marks);

        System.out.println("The value of X after running change2 is: " + marks[0]);

        for (int array : marks) {
            System.out.print(array + " ");
        }
        System.out.printf("\n");

        // ---------------- Method Overloading ------------
        /*
         * Means same function name but different parameters
         */
        foo();
        foo("jack");
        foo(100, 200);
    }
}