public class LargestElement {
    public static void main(String args[]) {
        int arr[] = { 3, 8, 5, 9, 3 };
        System.out.println(larElem(arr));
    }

    static int larElem(int[] arr) {

        if (arr.length == 0)
            return -1;
        int max = arr[0];
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }
}