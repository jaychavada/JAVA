interface Drawable {
    void draw();
}

class rectangle implements Drawable {
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class circle implements Drawable {
    public void draw() {
        System.out.println("Draw Circle");
    }
}

public class P43_interFaces {
    public static void main(String[] args) {
        Drawable d = new circle();
        Drawable d1 = new rectangle();
        d.draw();
        d1.draw();
    }
}