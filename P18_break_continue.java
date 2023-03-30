public class P18_break_continue {
    public static void main(String[] args) {
        // ----------------Break using loops!------------

        for(int i = 1;i<10;i++)
        {
        System.out.println(i);
        System.out.println("Java is great");
        if(i == 3)
        {
        System.out.println("Ending the loop");
        break;
        }
        }
/* 
        int i = 0;
        while(i<5){
        System.out.println(i);
        System.out.println("Java is great");
        if(i == 2)
        {
        System.out.println("Ending the loop");
        break;
        }
        i++;
        }

        int i=0;
        do{
        System.out.println(i);
        System.out.println("Java is great");
        if(i == 2)
        {
        System.out.println("Ending the loop");
        break;
        }
        i++;
        }while(i<5);

        // ------------------------------------------------continue-------------------------------------
   /*      for (int i = 1; i < 10; i++) {
            if (i == 3) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        } while (i < 5);
        int i = 1;
        while (i < 5) {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }*/
    }
}