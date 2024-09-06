/*
Given a number n.Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 */
import java.util.*;
public class NDividesN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(nDivN(N));
    }
    public static int nDivN(int N) {
        // Handle negative numbers by taking absolute value
        N = Math.abs(N);
        int ans = 0;
        int originalN = N; // Keep the original number for division checks
        
        while (N != 0) { 
            int digit = N % 10; // Get the last digit
            if (digit != 0 && originalN % digit == 0) { // Avoid division by zero
                ans++; 
            }
            N = N / 10; // Remove the last digit
        }
        return ans;
    }
}  