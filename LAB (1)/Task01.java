import java.util.Scanner;
public class Task01
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter number: ");
    int a= input.nextInt();
    
    for(int i=1; i<=a; i++)
    {
      System.out.print(i);
    }
    System.out.println("");
  }
}