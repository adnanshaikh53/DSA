package arrays;

public class LeadersInArray {
    public static void main(String [] args) {
        int [] arr = {5,3,20,15,8,3};
        leadersArray(arr);
    }

    private static void leadersArray(int[] arr) {
        int size = arr.length;
        //Stack stk = new Stack();
        int max = arr[size-1];
        //stk.push(max);
        System.out.println(max);
        for(int i = size-2;i>=0;i--){
            int curr_max ;
            if(arr[i]>max){
                curr_max = arr[i];
                max = curr_max;
                System.out.println(curr_max);

            }
        }
    }
}
