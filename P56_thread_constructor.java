class thr extends Thread{
    public thr(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("this is thread");
            i++;
        }
    }
}
public class P56_thread_constructor {
    public static void main(String[] args) {
       thr t = new thr("jay");
       t.start();
       System.out.println("the id of the thread t is "+t.getId());
       System.out.println("the name of the thread t is "+t.getName());
    }
}