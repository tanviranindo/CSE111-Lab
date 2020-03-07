import java.util.Scanner;

/**
 *
 * @author 19101268
 */
public class Task02
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int array[] = new int[10];
    System.out.println("Enter Ten Numbers: ");
    for(int i=0; i<array.length; i++)
    {
      array[i] = input.nextInt();
      System.out.print("You have entered ");
      for(int j=0; j<=i; j++)
      {
        if(j==i)
        {
          System.out.println(array[j]);
        }
        else
        {
          System.out.print(array[j]+", ");
        }
      }
    }
    System.out.println();
  }
}
