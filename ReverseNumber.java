/**
 * ReverseNumber
 */
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter your number that you want to reverse....");
        int x = sc.nextInt();
        
        System.out.println("->"+revNum(x));
    }

    private static int revNum(int x){
        
        int ans = 0;
        while(x!=0){
            int digit = x % 10;
            if((ans > Integer.MAX_VALUE / 10)||(ans < Integer.MIN_VALUE / 10)){
                return 0 ;
            }
            ans = (ans*10) + digit;
            x = x / 10;
        }
        return ans;
    }
       
}
