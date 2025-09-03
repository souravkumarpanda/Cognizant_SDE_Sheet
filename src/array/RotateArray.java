package array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
