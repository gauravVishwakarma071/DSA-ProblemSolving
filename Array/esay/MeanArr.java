public class MeanArr {
    public static void main(String[] args) {
        int arr[] = {3,8,5,8,3};
        System.out.println(mean(arr));
    }

    static float mean(int[] arr) {
        float sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum/2;
    }
}
