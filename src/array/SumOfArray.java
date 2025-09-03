package array;

public class SumOfArray {
    public static int sum(int[] arr){
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(sum(arr));
    }
}
