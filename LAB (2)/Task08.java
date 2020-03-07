/**
 *
 * @author 19101268
 */
public class Task08 
{
  
  public static void main(String... abc) 
  {
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int[] a = new int[10];
    
    for (int i = 0; i < 10; ) 
    {
      int n = sc.nextInt();
      if (n>=0 && n<= 9) 
      {
        if (a[n] < 4) 
        {
          a[n]++;
          i++;
        } 
        else 
        {
          System.err.println("Number is already entered 4x times! Try another!");
          continue;
        }
      } 
      else 
      {
        System.err.println("Invalid Range!");
      }      
    }
    String o = "";
    for (int i=a.length-1; i>=0; --i) 
    {
      o += (a[i]>=2 && a[i]<5) ? i+", " : "";
    }
    System.out.println(o+"\b\b");
  }
}