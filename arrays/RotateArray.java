package arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String [] args) {
        int [] arr = {1,2,4,7,8,10};
        int d = 2;
        rotateArray(arr,d);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotateArray(int[] arr, int d) {
        int low = 0;
        int high = arr.length;
        ReverseArrays.reverseArray(arr,low,d-1);
        ReverseArrays.reverseArray(arr,d,high-1);
        ReverseArrays.reverseArray(arr,low,high-1);
    }
}
