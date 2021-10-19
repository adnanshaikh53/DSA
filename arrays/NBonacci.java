package arrays;

public class NBonacci {
    public static void main(String [] args){
        int series = 4;
        int length = 20;
        printFibonacci(series, length);
    }

    private static void printFibonacci(int series, int length) {
        int [] arr = new int[length];
        arr[series-1] = 1;
        for(int i = 0;i<series-1;i++){
            System.out.println(0);
        }
        System.out.println(arr[series-1]);
        System.out.println();
        for(int i = series; i<length; i++){
            arr[i] = arr[i-1]+arr[i-2];
            System.out.println(arr[i]);
        }
    }
}
