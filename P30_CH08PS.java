class Employee01 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}
class cellPhone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("vibrating.....");
    }
    public void callfriend(){
        System.out.println("Calling DK.....");
    }

}
class Square01 {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int length,width;
    public int area1(){
        return width * length;
    }
    public int perimeter1(){
        return (2 * (length + width));
    }
}
class Tommy{
    public void hitting(){
        System.out.println("Hitting...");
    }
    public void running(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing...");
    }
    public void player(){
        System.out.println("The Player is...");
    }
}
class Circle{
    float redius;
    float pie = 3.14f;
    public float area2(){
        return (pie * redius *redius);
    }
    public float perimeter2(){
        return (2*pie*redius);
    }
}
public class P30_CH08PS {
    public static void main(String[] args) {
        /* 
        // que 01....

        Employee01 raj = new Employee01();

        raj.setName("good Employee01");
        raj.salary = 233;
        System.out.println(raj.getSalary());
        System.out.println(raj.getName());

        // que 02...
        cellPhone samsung = new cellPhone();
        samsung.callfriend();
        samsung.ringing();
        samsung.vibrating(); 
        */
        
        /* *
        // que 03...
        Square01 sq = new Square01();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // que 04...
        rectangle rc = new rectangle();
        rc.length = 10;
        rc.width = 5;
        System.out.println(rc.area1());
        System.out.println(rc.perimeter1());
         */

         // que 05...
         Tommy rockstargames = new Tommy();
         rockstargames.player();
         rockstargames.hitting();
         rockstargames.running();
         rockstargames.firing();

         //que 06.. 
         Circle cr = new Circle();
         cr.redius = 4;
         System.out.println(cr.area2());
         System.out.println(cr.perimeter2());

    }
}