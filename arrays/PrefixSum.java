package arrays;

public class PrefixSum {
    public static void main(String [] args){
        int [] arr = {1, 3, 5, 9, 2, 4};
        int [] prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        prefixSum(prefix_sum,0,2);
        prefixSum(prefix_sum,2,5);
    }

    private static void prefixSum(int[] prefix_sum,int left, int right) {
        int sum;
        if(left!=0){
            sum = prefix_sum[right] - prefix_sum[left-1];
        }else{
            sum = prefix_sum[right];
        }
        System.out.println("The sum of "+left+" and "+right+" is "+sum);
    }
}
