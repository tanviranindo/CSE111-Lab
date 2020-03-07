import java.util.Scanner;
public class Task06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a [] = new int[15];
        
        for (int i = 0; i < a.length; i ++) a[i] = sc.nextInt();
        
        System.out.println(sizeOfPositiveNum(a, a.length));
        
    }
    
    public static int sizeOfPositiveNum(int[] receivedArr, int size) {
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = receivedArr[i];
        }
        
        int temp;
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] >= 0) {
                temp = arr[i];
                arr[i] = arr[cnt];
                arr[cnt++] = temp;
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " \n");
    }
        return cnt;
    }
}