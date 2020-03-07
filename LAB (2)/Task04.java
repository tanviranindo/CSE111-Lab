import java.util.Scanner;
/**
 *
 * @author 19101268
 */
public class Task04 
{
  public static void main(String[] args) {
    
    int[] array = new int[5];
    int inputIndex =1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Unique Number: ");
    
    array[0]= input.nextInt();
    
    while(inputIndex<array.length)
    {
      int temp = input.nextInt();
      if(findDuplicate(temp,array,inputIndex)){
        array[inputIndex++]=temp;
      }
      
    }
    System.out.print("Unique Numbers are: ");
    for(int k =0;k<array.length;k++)
    {
      System.out.print(array[k]+" ");
    }
    System.out.println();
  }
  
  
  public static boolean findDuplicate(int input,int[] array,int offset){
    for(int i=0;i<=offset;i++){
      if(input==array[i]){
        System.out.println(array[i]+" is already in among the entered numbers");
        System.out.println("Enter a new number: ");
        return false;
      }
    }
    return true;
  }
}
