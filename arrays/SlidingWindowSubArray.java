package arrays;

public class SlidingWindowSubArray {
    public static void main(String [] args) {
        int [] arr = {1,-5,10,21,5,3,10};
        int k = 3;   // This problem is for size k sub arrays
        int sum = 7;
        boolean isSubArrayExists = findSubArray(arr, k, sum);
        System.out.println("Sub Array exists: "+isSubArrayExists);
    }

    private static boolean findSubArray(int[] arr, int k, int sum) {
        int curr_sum =0;
        int max_sum;
        for(int i = 0;i<k;i++){
            curr_sum+= arr[i];
            if(curr_sum == sum){
                return true;
            }
        }
        for(int i = k;i<arr.length;i++){
            curr_sum+=arr[i]-arr[i-k];
            if(curr_sum == sum){
                return true;
            }
        }
        return false;
    }
}
