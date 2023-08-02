import java.util.Scanner;

public class P14_CH04PS {
    public static void main(String[] args) {
        // que 01....
        // int a = 10;
        // if (a == 11) {
        // System.out.println("I am 11");
        // }
        // System.out.println("I am not 11");

        // que 02...
        // byte m1, m2, m3;
        // try (Scanner sc = new Scanner(System.in)) {
        // System.out.println("enter marks in physics");
        // m1 = sc.nextByte();
        // System.out.println("enter marks in chemistry");
        // m2 = sc.nextByte();
        // System.out.println("enter marks in maths");
        // m3 = sc.nextByte();

        // float avg = (m1 + m2 + m3) / 3.0f;
        // System.out.println("Your overall percentage is: "+ avg);
        // if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("You are Pass");
        // } else
        // System.out.println("You are Fail");
        // }

        // que 03....
        // try (Scanner sc = new Scanner(System.in)) {
        // System.out.println("enter your income");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if (income < 2.5) {
        // tax = tax + 0;
        // } else if (income > 2.5f && income <= 5f) {
        // tax = tax + 0.05f * (income - 2.5f);
        // } else if (income > 5f && income <= 10f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (income - 5f);
        // } else if (income > 10f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (10.0f - 5f);
        // tax = tax + 0.3f * (income - 10.0f);
        // }
        // System.out.println("Total tax paid by employee is" + tax);
        // }

        // que 04........
        // int day;
        // System.out.println("enter your no of day");
        // try(Scanner sc = new Scanner(System.in))
        // {
        // day = sc.nextInt();
        // switch(day){
        // case 1-> System.out.println("Monday");
        // case 2-> System.out.println("Tuesday");
        // case 3-> System.out.println("Wednesday");
        // case 4-> System.out.println("Thrusday");
        // case 5-> System.out.println("Friday");
        // case 6-> System.out.println("Saturday");
        // case 7-> System.out.println("Sunday");
        // default-> System.out.println("invalid");
        // }
        // }

        // que 05....
        int year;
        System.out.println("Enter an Year::");
        try (Scanner sc = new Scanner(System.in)) {
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || ( year % 4 == 0 &&year % 400 == 0)) {
        System.out.println("Year is leap year");
        } else
        System.out.println("Year is not leap year");
        }

        // que 06...
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.println("Enter website:");
        //     String website = sc.next();
        //     if (website.endsWith(".com")) {
        //         System.out.println("This is commercial website");
        //     } else if (website.endsWith(".org")) {
        //         System.out.println(("This is organizational website"));
        //     } else if (website.endsWith(".in")) {
        //         System.out.println("This is Indian website");
        //     }
        }
    }
