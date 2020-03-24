/**
 *
 * @author 19101268
 */
public class Task05 {
    public static void main(String... args) {
        String s = "23 3 8 20 32";
        String[] nums = s.split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += Integer.parseInt(nums[i]);
        }
        System.out.println(sum);
    }
}