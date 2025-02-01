//A pangram is a sentence where every letter of the English alphabet appears at least once.
import java.util.Scanner;
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
            int count = 0;
                
            for (char c : sentence.toCharArray()) {
                int index = c - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
                if (count == 26) return true;
            }
                
            return false;
        }
}
public class IsPangram extends Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = "qwertuiopasdfghjkylzxcvbnm";

        Solution s1 = new Solution();
        boolean res =  s1.checkIfPangram(sentence);

        System.out.println(res);
    }
}
