// You are given an integer 'n'. Return 'true' if 'n' is an Armstrong number, and 'false' otherwise
import java.util.Scanner;
public class AmstrongNum {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number...");
            int n = sc.nextInt();
            System.out.println(amNum(n));
        }
    }

    private static boolean amNum(int n) {
        int orignalNum  = n;
        int numDigits = String.valueOf(n).length();  // Calculate the number of digits
        int ans = 0;
        while(n>0){
            int dig = n % 10;
            ans += Math.pow(dig, numDigits);  // Raise to the power of the number of digits
            n = n / 10;
        }
        return orignalNum==ans;
    }
}
