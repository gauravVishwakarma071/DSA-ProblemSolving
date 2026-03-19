public class ElementSum{

    public static void main(String args[]){
        int arr[] = {3,8,5,9,3};
        System.out.println(allSum(arr));
    }

    static int allSum(int[] arr){
        int sum =0;
        for (var each : arr) {
            sum = sum + each;
        }
        return sum;
    }
}