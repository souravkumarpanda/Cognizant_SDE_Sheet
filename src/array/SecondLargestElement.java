package array;

public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int ele:arr){
            if (ele > max){
                secMax = max;
                max = ele;
            } else if (ele > secMax && ele < max) {
                secMax = ele;
            }
        }
        return (secMax==Integer.MIN_VALUE) ? -1 : secMax;
    }

    public static void main(String[] args) {
        int[] arr = {100,102,103,8467};
        System.out.println(secondLargest(arr));
    }
}
