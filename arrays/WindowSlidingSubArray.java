package arrays;

public class WindowSlidingSubArray {
    public static void main(String [] args) {
        int[] arr = {1, 4, 10, 21, 5, 3, 10};
        int sum = 35;
        boolean isSubArray = findSubArray(arr, sum);
        System.out.println(isSubArray);
    }

    private static boolean findSubArray(int[] arr, int sum) {
        int curr_sum = arr[0];
        int start = 0;
        for(int i = 1;i<arr.length; i++){
            while (curr_sum>sum &&  start<i-1 ){
                curr_sum-= arr[start]   ;
                start++;
            }
            if(curr_sum == sum){
                return true;
            }
            if(curr_sum<sum){
                curr_sum+=arr[i];
            }
        }
        return curr_sum==sum;
    }
}
