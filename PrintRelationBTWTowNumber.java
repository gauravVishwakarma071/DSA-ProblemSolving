import java.util.*;
public class PrintRelationBTWTowNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number..?");
        int n = sc.nextInt();
        System.out.println("Enter second number..?");
        int m = sc.nextInt();
        System.out.println(comNM(n,m));
        sc.close();
    }

    public static String comNM(int n, int m) {

        if(n<m)  return "lesser"; 
        else if(n==m) return "equal";
        else return "greater";
    }   

}