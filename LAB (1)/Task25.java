import java.util.Scanner;
public class Task25
{ 
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int a = input.nextInt();
    
    for(int i=1; i<=a; i++) 
    {      
      for(int j=i; j<a; j++) 
      {        
        System.out.print(" ");
      }      
      for(int k=1; k<=i; k++)
      {
        System.out.print(k);
      }
      for(int l=i-1; l>0; l--)
      {
        System.out.print(l);
      }      
      System.out.println();      
    }
  }  
}