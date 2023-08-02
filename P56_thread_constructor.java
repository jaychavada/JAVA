class thr extends Thread{
    // this constructor will give name to the thread
    public thr(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("This is thread");
            i++;
        }
    }
}
public class P56_thread_constructor {
    public static void main(String[] args) {
       thr t = new thr("jay");
       t.start();

       System.out.println("The id of the thread t is "+t.getId());
       
       System.out.println("The name of the thread t is "+t.getName());
    }
}