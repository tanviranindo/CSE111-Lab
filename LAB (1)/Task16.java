import java.util.Scanner;
public class Task16 
{
  public static void main(String[] args) 
  {    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int height = input.nextInt();  
    
    for ( int i=1 ; i<=height ; i++ ) 
    {
      for ( int j=1 ; j <= i ; j++ ) 
      {
        if(i==1 || i==2 || i==height || j==1 | j==i)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
