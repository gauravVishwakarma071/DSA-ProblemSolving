import java.util.Scanner;
public class SametionOfAllDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(samOfDivisors(N));

    }

    private static long samOfDivisors(int N) { 
        long totalSum = 0;  // Use long to handle large sums

        // Calculate the total sum using the formula
        for (int i = 1; i <= N; i++) {
            totalSum += (long) i * (N / i);  // Cast i to long to prevent overflow
        }
        
        return totalSum;
    }
}

/*
Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Example 1:

Input:
N = 4
Output:
15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15
 */ 
