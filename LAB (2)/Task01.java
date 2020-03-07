import java.util.Scanner;

/**
 *
 * @author 19101268
 */
public class Task01 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int array[] = new int[10];
    System.out.println("Enter Ten Numbers: ");
    for(int i=0; i<array.length; i++)
    {
      array[i] = input.nextInt();
    }
    System.out.print("Printing in reverse order: ");
    for(int j=array.length-1; j>=0; j--)
    {
      System.out.print(array[j]+" ");
    }
    System.out.println();
  }
}
