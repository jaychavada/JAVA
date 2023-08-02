import java.util.*;

public class P65_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(7);

        l1.add(5);
        l1.add(9);
        l1.add(4);

        // l1.add(0, 8);
        // l1.add(0, 6);

        l2.add(10);
        l2.add(25);

        l1.addAll(0, l2);
        // l1.clear(); simply clear all the input data
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(9));
        // System.out.println(l1.remove(2));

        for(int i = 0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}