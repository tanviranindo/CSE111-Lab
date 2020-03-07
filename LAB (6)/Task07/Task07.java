/**
 *
 * @author 19101268
 */
public class Task07 {

public static  int[] removeOdd(int[] arr){
        int count=0, save =0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
        }
        int [] newarr = new int[count];
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                newarr[save++]=arr[i];
            }
        }
        return newarr;
        
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
        System.out.println("");
    }
}