import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 4, 4, 4, 1, 1, 1, 7, 7 };
        removeDuplicateElement_1(arr);
        removeDuplicateElement_2(arr);
        int newLength = removeDuplicateElement_3(arr);

        // Print only unique part
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void removeDuplicateElement_1(int[] arr) {
        Set<Integer> list = new LinkedHashSet<>();
        for (int i : arr) {
            list.add(i);
        }

        System.out.println(list);
    }

    static void removeDuplicateElement_2(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }


    static int removeDuplicateElement_3(int[] arr){
        if(arr.length == 0) return 0;

        int j = 0;
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] =  arr[i];
            }
        }
        return j+1;
    }
}
