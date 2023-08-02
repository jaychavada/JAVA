class runnablethread1 implements Runnable {
    public void run(){
        System.out.println("thread1 is running");
    }
}
class runnablethread2 implements Runnable{
    public void run(){
        System.out.println("thread2 is running");
    }
}

public class P55_thread_using_interface {
    public static void main(String[] args) {
        runnablethread1 bullet1 = new runnablethread1();
        Thread gun1 = new Thread(bullet1);

        runnablethread2 bullet2 = new runnablethread2();
        Thread gun2 = new Thread(bullet2);
       
        gun1.start();
        gun2.start();
    }
}
