import java.util.Scanner;
/**
 *
 * @author 19101268
 */
public class Task03 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int array[] = new int[10];
    System.out.println("Enter Ten Numbers: ");
    for(int i=0; i<array.length; i++)
    {
      array[i] = input.nextInt();
    }
    for (int i = 0; i < array.length-1; i++) 
    { 
      int min = i; 
      for (int j = i+1; j < array.length; j++) 
        if (array[j] > array[min]) 
        min = j;  
      int temp = array[min]; 
      array[min] = array[i]; 
      array[i] = temp; 
    } 
    System.out.print("Printing the ten numbers sorted in descending order:");
    for(int i=0; i<array.length; i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }   
}
