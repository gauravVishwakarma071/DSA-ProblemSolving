
import java.util.Arrays;

//Swaping element of two index from given array.
public class ArraySwap2Indexs{
    public static void main(String args[]){
        
        int[] arr = {4,2,5,3,8,9}; //array sixe = 5

        //before swap
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        //After swap
        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}