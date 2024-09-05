/**
 * Extraction numbers one by one.
 */
public class Extraction {
    public static void main(String[] args) {
        
        int n = 7563;
        int x = 1000;
        while(x>0){
            int digit = n / x ;
            System.out.println(digit);
            n = n - digit*x;
            x /= 10;
        }
    }
    
}