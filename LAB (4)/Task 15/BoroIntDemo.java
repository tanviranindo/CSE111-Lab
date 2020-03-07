/**
 *
 * @author 19101268
 */
import java.util.Scanner;
public class BoroIntDemo {
  public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
    System.out.println("First Value (BIGGER ONE): ");
    int value1=input.nextInt();
    System.out.println("Second Value (SMALLER ONE): ");
    int value2 = input.nextInt();
    
    BoroInt a=new BoroInt(value2);
    BoroInt b=new BoroInt(value1);
    BoroInt c;
    c = a.add(b);
    System.out.println("SUM: "+c.val);
    c = a.subtract(b);
    System.out.println("SUBTRACT: "+c.val);
    c = a.multiply(b);
    System.out.println("MULTIPLY: "+c.val);
    c = a.divide(b);
    System.out.println("DIVIDE: "+c.val);
  }
}