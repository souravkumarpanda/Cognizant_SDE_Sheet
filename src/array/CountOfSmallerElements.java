package array;

public class CountOfSmallerElements {
    public static int smaller(int[] arr, int x){
        int count = 0;
        for(int ele:arr){
            if(ele < x) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 8, 4, 5};
        int x = 9;
        System.out.println(smaller(arr,x));
    }
}
