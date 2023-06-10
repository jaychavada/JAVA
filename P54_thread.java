class mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("thread1 is running");
            System.out.println("happy");
            i++;
        }
    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("thread2 is running");
            System.out.println("sad");
            i++;
        }
    }
}
public class P54_thread {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
