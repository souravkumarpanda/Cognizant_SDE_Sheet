package array;

public class LargestElementInArray {
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele > max) max = ele;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {13,2,33,4,5,6,67};
        System.out.println(largest(arr));
    }
}
