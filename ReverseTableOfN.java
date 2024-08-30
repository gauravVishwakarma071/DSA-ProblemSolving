import java.util.*;

public class ReverseTableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your number..");
        int n = sc.nextInt();
        revTable(n);
        sc.close();

   }

   
    public static void revTable(int n) {
        
        int multiplier = 10;
        while(multiplier>0){
            int ans = multiplier*n;
            System.out.print(ans+" ");
            multiplier--;
        }
        System.out.println();
    }
}
