/**
 *
 * @author 19101268
 */
import java.util.StringTokenizer;

public class Task04 {
    public static void main(String... args) {
        String s = "23 3 8 20 32";
        StringTokenizer st = new StringTokenizer(s);
        int sum = 0;
        while (st.hasMoreElements()) {
            sum += Integer.parseInt(st.nextElement().toString());
        }
        System.out.println(sum);
        s = "23,3,8,20,32";
        st = new StringTokenizer(s,",");
        sum = 0;
        while (st.hasMoreElements()) {
            sum += Integer.parseInt(st.nextElement().toString());
        }
        st = new StringTokenizer(s, ",");
        System.out.println(sum);
        sum = 0;
        while (st.hasMoreElements()) {
            sum += Integer.parseInt(st.nextToken().toString());
        }
        System.out.println(sum);
    }
}