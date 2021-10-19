package arrays;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String [] args){
        int [] arr = {1,2,4,6,8,10};
        int [] rev;
        int low = 0;
        int high = arr.length -1;
        reverseArray(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int low, int high) {


        while(low<high){   // only reverse if low is less than high, if otherwise we have already reversed all elements
            int temp = arr[low];   // standard swapping between the low and high elements
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

}
