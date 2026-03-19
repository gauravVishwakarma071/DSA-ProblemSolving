public class ReverseArr {
    public static void main(String args[]){
        int arr[] = {6,8,7,4,2};
        reverseArr(arr);
    }

    public static void reverseArr(int[] arr){

        int i = 0; 
        int j = arr.length-1;
        int temp;
        while (i<=j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }

        // Arrays.stream(arr).forEach(
        //     System.out::print
        // );

        // System.out.print(Arrays.toString(arr));
    }
}
