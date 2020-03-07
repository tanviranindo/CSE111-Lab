/**
 *
 * @author 19101268
 */
import java.util.Scanner;
public class Task09{
  public static void main(String... abc) {
    
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    
    System.out.println("Please enter ten numbers");
    for (int i=0; i<array.length; ++i) array[i] = input.nextInt();
    
    System.out.println("Please enter your choice:\n 1.Sort at odd position\n 2.Sort at even position\n 3.Sort all");
    int n = input.nextInt();
    if (n==1) oddSort(array);
    if (n==2) evenSort(array);
    if (n==3) allSort(array);
  }
  
  static void allSort(int[] array) 
  {
    for(int i=1; i<array.length; ++i) 
    {
      int temp = array[i]; int j = i-1;
      while (j>=0 && array[j]<temp) array[j+1] = array[j--];
      array[j+1] = temp;
    }
    System.out.println(java.util.Arrays.toString(array));
  }
  
  static void oddSort(int[] array) 
  {
    int[] b = new int[array.length/2];
    for (int k=0; k<b.length; k++) b[k] = array[2*k+1]; 
    for(int i=1; i<b.length; ++i) 
    {
      int temp = b[i]; int j = i-1;
      while (j>=0 && b[j]<temp) 
      { 
          b[j+1] = b[j]; j--; 
      }
      b[j+1] = temp;
    }
    for (int k=0; k<b.length; k++) array[2*k+1] = b[k];
    System.out.println(java.util.Arrays.toString(array));
  }
  
  static void evenSort(int[] array) 
  {
    int[] b = new int[array.length/2];
    for (int k=0; k<b.length; k++) b[k] = array[2*k]; 
    for(int i=1; i<b.length; ++i) 
    {
      int temp = b[i]; int j = i-1;
      while (j>=0 && b[j]<temp) 
      { 
          b[j+1] = b[j]; j--; 
      }
      b[j+1] = temp;
    }
    for (int k=0; k<b.length; k++) array[2*k] = b[k];
    System.out.println(java.util.Arrays.toString(array));
  }
}