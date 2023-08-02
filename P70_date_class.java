import java.util.Date;

public class P70_date_class {
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);

        // date class methods
        System.out.println(d.getTime());
        // System.out.println(d.getDate());
        // System.out.println(d.getDay());
        // System.out.println(d.getHours());
        // System.out.println(d.getYear());
    }
}