package array;

public class CountTheZeroes {
    public static int countZeroes(int[] arr){
        int count = 0;
        for(int ele:arr){
            if(ele==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(countZeroes(arr));
    }
}
