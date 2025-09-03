package array;

public class PalindromicArray {
    public static boolean isPalindrome(int x){
        int original = x;
        int reverse = 0;
        while(x > 0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x /= 10;
        }
        return original == reverse;
    }
    public static boolean isArrayPalindrome(int[] arr){
        for (int ele:arr){
            if(!isPalindrome(ele)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        System.out.println(isArrayPalindrome(arr));
    }
}
