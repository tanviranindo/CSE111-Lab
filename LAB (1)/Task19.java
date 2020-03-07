import java.util.Scanner; 
public class Task19 
{ 
  public static void main(String[] args) 
  {    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int height = input.nextInt();
    
    for (int i=height; i>=1; i--) 
    {
      for (int j=1; j<i; j++)
      {
        System.out.print(" ");
      }
      for (int k=i; k<=height; k++)
      {
        if (i>1 && i<height-1)       
        {
          if (k>i && k<height)
          {
            System.out.print(" ");
          } 
          else
          {
            System.out.print(k);
          }
        }
        else
        {
          System.out.print(k);
        }
      }
      System.out.println();
    }    
  }  
}
