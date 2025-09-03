package array;
public class AlternatesOfAnArray {
    public static void alternate(int[] arr){
        for (int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        alternate(arr);
    }
}
