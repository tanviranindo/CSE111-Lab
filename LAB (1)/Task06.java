import java.util.Scanner;
public class Task06
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("(Enter Number: ");
    int a=input.nextInt();
    
    for (int i=1; i<=a; i++)
    {
      for (int j=1; j<=i; j++) 
    {
      System.out.print(j);
    }
      System.out.println("");
    }
  }
}
    
    