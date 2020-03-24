/**
 *
 * @author 19101268
 */
import java.util.*;
public class Task03{
    public static void main(String[]args){
       String s = "23 3 8 20 32";
       int sum = 0;
       Scanner sc = new Scanner (s);
       while(sc.hasNextInt()) {
           sum += sc.nextInt();
       }
       sc.close();
       System.out.println(sum);
    }
}
