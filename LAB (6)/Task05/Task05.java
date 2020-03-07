/**
 *
 * @author 19101268
 */
import java.util.Scanner;

public class Task05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Please enter a word in UPPER-case");
        String str = sc.nextLine();
        
        int[] counter = new int [26];
        
        for (int i = 0; i < str.length(); i ++) {
            counter[str.codePointAt(i) - 65] ++;
        }
        
        int prev = -1;
        int prevIndex = 0;
        int index = 0;
        int max = counter[0];
        for (int i = 1; i < counter.length; i ++) {
            if (counter[i] > max) {
                prev = max;
                prevIndex = index;
                index = i;
                max = counter[i];
            } 
            else if (counter[i] == max) {
                prevIndex = i;
            } 
            else if (counter[i] > prev) {
                prev = counter[i];
                prevIndex = i;
            }
        }
        prevIndex += 65;
        System.out.println((char) prevIndex);        
        
    }
}