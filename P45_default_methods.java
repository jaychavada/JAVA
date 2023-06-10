interface camera {
    void takepic();

    void takevideo();
    private void greet(){
        System.out.println("Namaste");
    }
    // DEFAULT METHODS.........
    default void take4kvideo(){
        greet();
        System.out.println("Taking 4k video.....");
    }
}

interface wifi {
    String[] connections();

    void connectedtoNetwork(String network);
}

class dialerPhone {
    void callnumber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class smartMob extends dialerPhone implements wifi, camera {
    public void takepic() {
        System.out.println("Taking Picture");
    }

    public void takevideo() {
        System.out.println("Shooting video");
    }

    @Override
    public String[] connections() {
        System.out.println("Getting list of Networks....");
        String[] networkList = { "Ithernet", "Gothrough", "Lannternet" };
        return networkList;
    }

    public void connectedtoNetwork(String network) {
        System.out.println("Connecting to.... " + network);
    }
}

public class P45_default_methods {
    public static void main(String[] args) {
        smartMob m1 = new smartMob();
        m1.take4kvideo();
        String[] a = m1.connections();
        for (String item : a) {
            System.out.println(item);
        }
        m1.connectedtoNetwork("Ithernet");
    }
}