/**
 *
 * @author 19101268
 */
class Task10 
{
  public static void main(String... abc) 
  {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Please enter input limit: ");
    int size = input.nextInt();
    int[] array = new int[size];
    System.out.println("Please enter "+size+" numbers");
    array[0] = input.nextInt();
    
    for (int i = 1; i < array.length;) 
    {
      int candidate = input.nextInt();
      if (candidate>=0 && candidate<=9) 
      {
        int count = 0;
        for (int j = 0; j < i; j++) 
        { 
            if (candidate==array[j]) 
                count++; 
        }
        if (count < 4) 
        { 
            array[i] = candidate; 
            ++i; 
        }
        else 
        {
            System.err.println(candidate+" has been entered 4 times. Try a different number"); 
            continue; 
        }
      } 
      else 
      {
          System.err.println("Invalid Range! Valid Range is 0-9"); 
          continue; 
      }
    }
    int[] b = new int[10];
    for (int j = 0; j < array.length; ++j) b[array[j]]++;
    for (int i = 0; i < b.length; ++i) System.out.print((b[i]>=2) ? i+" " : "");
    System.out.println();
    
  }
}

