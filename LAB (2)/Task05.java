/**
 *
 * @author 19101268
 */
import java.util.Scanner;
public class Task05 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter voltage:");
    double e = input.nextDouble();
    System.out.print("Enter resistance:");
    double r = input.nextDouble();
    System.out.print("Enter inductance:");
    double l = input.nextDouble();
    System.out.print("Enter capacitance:");
    double c = input.nextDouble();
    System.out.print("Enter frequency:");
    double f = input.nextDouble();
    
    double new1= 2*Math.PI*f*l;
    double new2 = (1/(2*Math.PI*f*c));
    double new3 = Math.pow(r,2);
    double new4 = Math.pow((new1-new2),2);;
    double new5 = Math.sqrt(new3+new4);
    double i = e/new5;
    System.out.println("Current: "+i+" amperes");
    
    
    
  }
  
}
