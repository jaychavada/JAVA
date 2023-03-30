public class P17_loops {
    public static void main(String[] args) {
        System.out.println("Using of WHILE loop; ");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Using of DO-WHILE loop: ");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);

        System.out.println("Using of FOR loop");
        int k;
        for(k = 0;k<5;k++){
            System.out.println(k);
        }
        int l;
        for(l=5;l!=0;l--){
            System.out.println(l);
        }
    }
}
