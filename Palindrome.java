/*
Given an integer x, return true if x is a 
palindrome, and false otherwise.
*/
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int orignalX = x;
        while (x>0) { 
            int dig = x %10;
            rev = (rev*10) + dig;
            x = x / 10;
        }

       return orignalX==rev;
    }
}