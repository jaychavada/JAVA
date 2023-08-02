class MyEmployee {
    private int id;
    private String name;

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

public class P31_modifiers {
    public static void main(String[] args) {
        MyEmployee toretto = new MyEmployee();
        // toretto.id = 007;
        // toretto.name = "Dominic Toretto"; --> This lines will show errors due to Setting Up of Private Modifier

        toretto.setName("Dominic Toretto");
        System.out.println(toretto.getName());
        toretto.setId(1007);
        System.out.println(toretto.getId());
    }
}