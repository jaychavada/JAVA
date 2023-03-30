public class P23_methods {
    // FUNCTION CALL
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // IF WE REMOVE STATIC FROM FUNCTION THEN WE HAVE TO CREATE OBJECT IN MAIN.....TO CALL OBJ = NEW 
    // if we do not remove static then remove obj from main

    // int logic(int x, int y) {
    //     int z;
    //     if (x > y) {
    //         z = x + y;
    //     } else {
    //         z = (x + y) * 5;
    //     }
    //     return z;
    // }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        // P23_methods obj = new P23_methods();
        // c = obj.logic(a, b);
        c = logic(a, b);
        int a1 = 2;
        int b1 = 3;
        int c1;
        // c1 = obj.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
