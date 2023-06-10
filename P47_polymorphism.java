interface camera1{
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
interface wifi1 {
    String[] connections();

    void connectedtoNetwork(String network);
}
class dialerphone1 {
    void callnumber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}
class smartMob1 extends dialerphone1 implements wifi1, camera1 {
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
public class P47_polymorphism {
    public static void main(String[] args) {
        camera1 cam1 = new smartMob1(); // this is smartphone but use it as a camera not for other usage....at this time we can use camera1 methods..
        // cam1.getNetworks();  --> not allowed
        cam1.take4kvideo();

        smartMob1 s1 = new smartMob1();
        s1.callnumber(5145);
        s1.pickCall();
        s1.take4kvideo();
        s1.takepic();
        s1.connections();
        s1.connectedtoNetwork("Gothrough");
    }
}