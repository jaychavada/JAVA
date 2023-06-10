class thr1 extends Thread{
    public thr1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("this is thread "+this.getName());
            i++;
        }
    }
}

public class P57_thread_priorities {
    public static void main(String[] args) {
        thr1 t1 = new thr1("jay1(min)");
        thr1 t2 = new thr1("jay2");
        thr1 t3 = new thr1("jay3(most imp part)");
        thr1 t4 = new thr1("jay4");
        thr1 t5 = new thr1("jay5");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}