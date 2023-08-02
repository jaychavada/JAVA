import java.util.HashSet;

public class P68_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet1 = new HashSet<>(); // in this constructor hashmap has initial capacity 16 and load
                                                       // factor 0.75
        HashSet<Integer> myHashSet2 = new HashSet<>(6, 0.5f);

        myHashSet1.add(10);
        myHashSet1.add(9);
        myHashSet1.add(8);
        myHashSet1.add(7);
        myHashSet1.add(6);
        myHashSet1.clone();
        System.out.println(myHashSet1);
        System.out.println(myHashSet1.clone());

        myHashSet2.add(11);
        myHashSet2.add(12);
        myHashSet2.add(13);
        myHashSet2.add(14);
        System.out.println(myHashSet2);
    }
}