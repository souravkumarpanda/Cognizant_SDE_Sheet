package array;

import java.util.ArrayList;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        if(n<=1){
            return 1;
        }
        int idx = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

//    Using ArrayList
    public static ArrayList<Integer> removesDuplicates(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        if(n==0) return result;
        result.add(arr[0]);
        for(int i=1;i<n;i++){
            if (arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int newSize = removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
