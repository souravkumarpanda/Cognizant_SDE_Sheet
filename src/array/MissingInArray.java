package array;

public class MissingInArray {
    public static int missingNum(int[] arr){
        int n = arr.length+1;
        int num = n*(n+1)/2;
        int secNum = 0;
        for(int ele:arr){
            secNum += ele;
        }
        return num-secNum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
}
