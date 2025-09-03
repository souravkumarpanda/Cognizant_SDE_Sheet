package array;

public class ElementWithLeftSideSmallerRightSideGreater {
    public static int findElement(int[] arr) {
        int n = arr.length;
        if(n<3) return -1;
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        int[] rightMin = new int[n];
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        for (int i = 1; i <= n - 2; i++) {
            if (arr[i] > leftMax[i] && arr[i] < rightMin[i]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7};
        System.out.println(findElement(arr));
    }
}
