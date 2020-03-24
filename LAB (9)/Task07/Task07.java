/**
 *
 * @author 19101268
 */
import java.util.Scanner; 
 
public class Task07 { 
    public static void main(String... args) { 
        Scanner sc = new Scanner (System.in); 
        int sum = 0; 
        int n; 
        for (int i = 0; i < 3; i ++) { 
            System.out.println("Please enter a number"); 
            n = sc.nextInt(); 
            sum += n; 
        } 
        sc.close();
        System.out.println("Sum = " + sum); 
    } 
} 
