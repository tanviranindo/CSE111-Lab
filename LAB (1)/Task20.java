import java.util.Scanner;
public class Task20
{ 
  public static void main(String[] args)
  {
    
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Number: ");
    int height=input.nextInt();
    
    for(int i=1;i<=height;i++)
    {      
      for(int j=1;j<=height-i;j++)        
      {
        System.out.print(" ");
      }
      if(i==1 || i==height)
        for(int j=1;j<=i*2-1;j++)        
      {
        System.out.print("*");
      }
      else
      {
        for(int j=1;j<=i*2-1;j++)          
        { 
          if(j==1 || j==i*2-1)
            System.out.print("*");
          else            
            System.out.print(" ");
        }
      }
      System.out.println();      
    } 
  }
}