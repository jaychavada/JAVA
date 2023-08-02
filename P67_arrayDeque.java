import java.util.ArrayDeque;

public class P67_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(6);
        ad1.add(85);
        ad1.addFirst(100);
        ad1.addLast(25);

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}