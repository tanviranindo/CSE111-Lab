/**
 *
 * @author Tanvir Anindo
 */
import java.util.Scanner;
public class ComplexDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Complex Number: ");
        double rOne = input.nextDouble();
        double iOne = input.nextDouble();
        System.out.println("Second Complex Number: ");
        double rTwo = input.nextDouble();
        double iTwo = input.nextDouble();
        
        Complex cOne = new Complex(rOne, iOne);
        Complex cTwo = new Complex(rTwo, iTwo);
        
        System.out.print("(" + cOne + ") + (" + cTwo + ") = ");
        Complex add = cOne.add(cTwo);
        System.out.println(add);
        System.out.print("(" + cOne + ") - (" + cTwo + ") = ");
        Complex subtract = cOne.subtract(cTwo);
        System.out.println(subtract);
        System.out.print("(" + cOne + ") * (" + cTwo + ") = ");
        Complex multiply = cOne.multiply(cTwo);
        System.out.println(multiply);
        System.out.print("(" + cOne + ") / (" + cTwo + ") = ");
        Complex divide = cOne.divide(cTwo);
        System.out.println(divide);
    }
    
}
