//Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.

import java.util.*;
public class PassingValuesFormfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        System.out.println(passedBy(a,b));

    }

    static int[] passedBy(int a, int b) {
        int ans[] = {++a,b+2};
        return ans;
    }
}

