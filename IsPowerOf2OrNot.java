import java.util.*;
public class IsPowerOf2OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number..?");
        int n = sc.nextInt();
        System.out.println(isPovOF2(n));
    }

    public static boolean isPovOF2(int n) {
      if(n==0){
        return false;
      }
      while(n%2==0){
        n/=2;
      }
      if(n==1){
         return true;
      }
      return false;
    }
       
}
