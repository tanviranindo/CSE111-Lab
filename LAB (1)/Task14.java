import java.util.Scanner;
public class Task14
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter Row Number: ");
    int row=input.nextInt();
    System.out.println("Enter Column Number: ");
    int column=input.nextInt();
    
    for(int i=1; i<=row; i++)
    {
      for (int j=1; j<=column; j++)
      {
        if(i==1 || i==row)
        {
          System.out.print("*");
        }
        else if(j==1 || j==column)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}