package array;

import java.util.Arrays;

public class FindIndex {
    public static int[] findIndex(int[] arr, int key){
        int start = -1;
        int end = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if (arr[i] == key){
                start = i;
                break;
            }
        }
        for (int i=n-1;i>=0;i--){
            if (arr[i] == key){
                end = i;
                break;
            }
        }
        return new int[] {start,end};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int key = 5;
        System.out.println(Arrays.toString(findIndex(arr, key)));
    }
}
