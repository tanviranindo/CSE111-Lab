import java.util.Scanner; 
public class Task24
{ 
  public static void main(String[] args)
  { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int a = input.nextInt();
    for (int i=1; i<=a; i++) 
    {      
      System.out.print(i);
    }
    for (int i= a-1; i>0; i--)
    {
      System.out.print(i);
    }
    System.out.println();
  }  
}