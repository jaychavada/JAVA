interface parentSample{
    void meth1();
    void meth2();
}
interface childSample extends parentSample{
    void meth3();
    void meth4();
}

class MySampleFamily implements childSample{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println( "meth4");
    }
}
public class P46_inheritance_in_interface {
    public static void main(String[] args) {
        MySampleFamily m = new MySampleFamily();
        System.out.println("Members of sampleFamily are ");
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();
    }
}
