class Ekclass{
    int a;
    public int getA() {
        return a;
    }
    Ekclass(int h){
        this.a = h;
    }
    public int returnOne(){
        return 1;
    }
}

class doclass extends Ekclass{
    doclass(int c){
        super(c);
        System.out.println("i am a constructor"); // this will call Ekclass constructor
    }
}
public class P36_this_super {
    public static void main(String[] args) {
        Ekclass d = new Ekclass(50);
        doclass e = new doclass(5);
        System.out.println(d.getA());
        System.out.println(e.getA());
    }
}