interface Bicycle {
    // int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Horncycle {
    void blowHorn();
}

class AvonCycle implements Bicycle {

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHorn() {
        System.out.println("Horn will blow");
    }
}

public class P44_interfaces_ex {
    public static void main(String[] args) {

        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        cycle.speedUp(1);
        cycle.blowHorn();

        // You can create properties in Interfaces
        // System.out.println(cycle.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycle.a = 454;
        // System.out.println(cycle.a);
    }
}