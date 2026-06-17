package majid;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        String str1 = "wxyz";
        String str2 = "zyxw";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1, arr2);

        System.out.println("String-1 : " + str1);
        System.out.println("String-2 : " + str2);
        System.out.println("Check if two given strings are anagrams or not?: " + result);
    }
}