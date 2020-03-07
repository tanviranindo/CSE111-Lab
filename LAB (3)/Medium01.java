import java.util.Scanner;
public class Medium01
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      String a = input.nextLine();
      char array[] = a.toCharArray();
      for(int i=0; i<array.length; i++)
      {
          for(int j=0; j<=i; j++)
          {
              System.out.print(array[j]);
          }
          System.out.println();
      }
    }    
}
