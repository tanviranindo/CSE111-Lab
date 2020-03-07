import java.util.Scanner;
/**
 *
 * @author 19101268
 */
public class Task07
{
  public static void main(String[] args) 
  {
    int[] array = new int[11];
    int inputIndex =1;        
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Unique Number: ");
    
    array[0]= input.nextInt();
    
    while(inputIndex<11)
    {            
      int temp = input.nextInt();
      if(findDuplicate(temp,array,inputIndex))
      {
        array[inputIndex++]=temp;
      }
      
    }
    System.out.print("Numbers taken: ");
    for(int k =0;k<array.length;k++)
    {
      System.out.print(array[k]+" ");
    }
    System.out.println();
  }
  
  
  public static boolean findDuplicate(int input,int[] array,int offset)
  {
    int count=1;
    for(int i=0;i<=offset;i++)
    {
      if(input==array[i])
      {
        if(count==4)
        {
          System.out.println(array[i]+" was entered 4x times");
          System.out.println("Enter a new number: ");
          return false;
        }                
        count++;
      }
    }
    return true;
  }
}

