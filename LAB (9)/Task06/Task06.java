/**
 *
 * @author 19101268
 */
import static java.lang.System.*;
import java.util.Scanner;

public class Task06 {
    public static int getSmallest(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10 * (n % 10);
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int p = 1; p <= T; p ++) {
            int N = sc.nextInt();
            int temp = getSmallest(N);
            while (temp >= 10) {
                temp = getSmallest(temp);
            }
            System.out.println("Case #" + p + ": " + N + " is " + (temp == 1 ? "a Happy" : "an Unhappy") + " number.");
        }
        
        sc.close();
    }
}