package majid;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 6, 2};
        int val = 6;

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("The length of the new array is: " + k);
    }
}