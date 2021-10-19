package arrays;

public class SlidingWindowMaxSum {
    public static void main(String [] args){
        int [] arr = {1,-5,10,21,5,3,10};
        int k = 3;
        int max_sum = maxSum(arr,k);
        System.out.println(max_sum);
    }

    private static int maxSum(int[] arr, int k) {
        int curr_sum=0;
        int max_sum;
        for(int i = 0;i<k;i++){
            curr_sum+= arr[i];
        }
        max_sum = curr_sum;
        for(int i=k;i<arr.length;i++){
            curr_sum+= arr[i] - arr[i-k];
            max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}
