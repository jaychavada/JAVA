public class P22_CH06PS {
    public static void main(String[] args) {
        // que 01...

        // float[] marks = { 45.7f, 67.8f, 96.5f, 78.7f, 100.0f };
        // float sum = 0;
        // for (float element : marks) {
        //     sum = sum + element;
        // }
        // System.out.println("The value of sum is :" + sum);

        // que 02...
        // float[] marks = { 45.7f, 67.8f, 96.5f, 78.7f, 100.0f };
        // float num = 96.5f;
        // boolean isInarray = false;
        // for (float element : marks) {
        //     if (num == element) {
        //         isInarray = true;
        //         break;
        //     }
        // }
        // if (isInarray) {
        //     System.out.println("The value is present in the array");
        // } else
        //     System.out.println("value is not in Array");

        // que 03...
        // float[] marks = { 45.7f, 67.8f, 96.5f, 78.7f, 100.0f };
        // float sum = 0;
        // for (float element : marks) {
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is :" + sum / marks.length);

        // que 04...
        // int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] mat2 = { { 7, 8, 9 }, { 0, 1, 2 } };
        // int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        // for (int i = 0; i < mat1.length; i++) { // row number of times
        //     for (int j = 0; j < mat1[i].length; j++) { // column number of times
        //         System.out.format("Setting value for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];

        //     }
        // }
        // for (int i = 0; i < mat1.length; i++) { // row number of times
        //     for (int j = 0; j < mat1[i].length; j++) { // column number of times
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println(" ");
        // }

        // que 05...
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for (int i = 0; i < n; i++) {
        //     // swap a[i] and a[l-1-i]
        //     temp = arr[i];
        //     arr[i] = arr[l - 1 - i];
        //     arr[l - 1 - i] = temp;
        // }
        // for (int element : arr) {
        //     System.out.print(element + " ");
        // }

        // que 06...and que 07.....
        int[] arr = { 120, 0, 34, 4, 55, 69 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int max_num : arr) {
            if (max_num > max) {
                max = max_num;
            }
        }
        System.out.println("The maximum number is :" + max);
        for (int min_num : arr) {
            if (min_num < min) {
                min = min_num;
            }
        }
        System.out.println("The minimum number is :" + min);

        // que 08...
        // boolean isSorted = true;
        // int[] arr = { 1, 23, 45, 46, 56, 66, 76 };
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         isSorted = false;
        //         break;
        //     }
        // }
        // if (isSorted) {
        //     System.out.println("This Array is sorted");
        // } else
        //     System.out.println("This Array is not sorted");

    }
}
