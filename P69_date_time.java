public class P69_date_time {
    public static void main(String[] args) {
        // time from 1970
        System.out.print("In miliseconds: ");
        System.out.println(System.currentTimeMillis());//in milliseconds
        System.out.print("In seconds: ");
        System.out.println(System.currentTimeMillis()/1000);//in seconds
        System.out.print("In minutes: ");
        System.out.println(System.currentTimeMillis()/1000/3600);//in minutes
        System.out.print("In days: ");
        System.out.println(System.currentTimeMillis()/1000/3600/24);//in days
        System.out.print("In years: ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);//in years
    }
}