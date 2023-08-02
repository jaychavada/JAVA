class MyMainEmployee {
    private int id;
    private String name;

    // constructors
    // we can also use mathod-overloading (same constructor but different
    // parameters)
    public MyMainEmployee() {
        id = 45;
        name = "Jarvis";
    }

    public MyMainEmployee(String myName, int id1) {
        id = id1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class P32_constructors {
    public static void main(String[] args) {

        // below lines will directly invoke the constructor's value
        MyMainEmployee paul = new MyMainEmployee();
        System.out.println(paul.getId());
        System.out.println(paul.getName());

        // below lines will expect some argument in constructor
        MyMainEmployee latty = new MyMainEmployee("Latty Menafoi", 45);
        System.out.println(latty.getId());
        System.out.println(latty.getName());

    }
}