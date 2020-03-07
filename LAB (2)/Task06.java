import java.util.Scanner;

/**
 *
 * @author 19101268
 */
public class Task06 
{
  
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = input.nextInt();
    int oddadd=0;
    int evenadd=0;
    for(int i=1; i<=n; i++)
    {
      if(i%2!=0)
      {
        oddadd+=Math.pow(i, 2);
      }
      else
      {
        evenadd+=Math.pow(i, 2);
      }
    }
    System.out.println(oddadd-evenadd);
  }
  
}
