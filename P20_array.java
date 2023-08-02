public class P20_array {
    public static void main(String[] args) {
        // int [] marks = new int [5];
        // marks[0] = 100;
        // marks[1] = 80;
        // marks[2] = 86;
        // marks[3] = 90;
        // marks[4] = 80;
        int [] marks = {98,89,78,56,36,75};
        System.out.println(marks[4]);

        // finding length of array
        System.out.print("length:");
        System.out.println(marks.length);

        // also use of string
        String [] students = {"jay", "dhami", "ayush", "leo"};
        System.out.println(students.length);
        System.out.println(students[3]);

        // display array
        System.out.println("Array is:");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Array in reverse order is:");
        for(int i=marks.length -1; i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Displaying Array in For-Each loop is:");
        for (int element : marks) {
            System.out.println(element);
        }
        for (String str : students) {
            System.out.println(str);
        }
    }
}
