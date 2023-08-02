class Table{
    synchronized void PrinntTable(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i+" ");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }
}
class Mythread1 extends Thread{
    Table t;
    Mythread1(Table t){
        this.t =t;
    }
    public void run(){
        synchronized(t){
            t.PrinntTable(5);
        }
    }
}
class Mythread2 extends Thread{
    Table t;

    Mythread2(Table t){
        this.t =t;
    }
    public void run(){
        synchronized(t){
            t.PrinntTable(2);
        }
    }
}
public class P81_Synchronization {
    public static void main(String[] args) {
        Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);
        t1.start();
        t2.start();
    }
}
