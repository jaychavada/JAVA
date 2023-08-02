class threadnew1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("This is thread ");
            i++;
            try {
                Thread.sleep(455);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class threadnew2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Thank you");
            i++;
        }
    }
}

public class P58_thread_methods {
    public static void main(String[] args) {
        threadnew1 t1 = new threadnew1();
        threadnew2 t2 = new threadnew2();
        t1.start();
        // use of JOIN for first RUN T1 and then it will RUN T2
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
} 