import java.util.Scanner;
public class Task11
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter Number: ");
    int row = input. nextInt();
    
    for(int i=1; i<=row; i++)
    {
      int k=0; 
      for(k=1; k<=row-i; k++)
      {
        System.out.print(" ");
      }
      for(int j=k; j<=row; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}  