import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number...");
        int n = sc.nextInt();
        System.out.println("At what bit...");
        int pos = sc.nextInt();
        int bitMask = 1 << --pos;
        
        //System.out.println(getBit(n,bitMask)); // For Get Bit 
        //System.out.println(setBit(n,bitMask)); // For Set Bit 
        //System.out.println(clearBit(n,bitMask)); // For clear Bit 
        //System.out.println(updateBit0(n,bitMask)); // For update Bit 
        //System.out.println(updateBit1(n,bitMask)); // For update Bit 
    }

    //update bit function fro 0
    static int updateBit0(int n, int bitMask) {
        int newNumber = ~(bitMask) & n;
        return newNumber;
    }

    //update bit function for 1
    static int updateBit1(int n, int bitMask) {
        int newNumber = bitMask | n;
        return newNumber;
    }

    //setbit function
    public static int setBit(int n, int bitMask) {
        
        int newNumber = bitMask | n;
        return newNumber;
    }
    
    //getbit function
    public static String getBit(int n,int bitMask) {
        if((bitMask & n)==0 ) return "ZERO";
        else return "ONE";
    }
    
    //clearbit function
    static int clearBit(int n, int bitMask) {
        int newNumber = ~(bitMask) & n;
        return newNumber;
    }

    
}
