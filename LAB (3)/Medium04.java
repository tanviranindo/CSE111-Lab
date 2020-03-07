import java.util.Scanner;
public class Medium04
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner (System.in);
        String check = input.nextLine();
        
        String string2 = String.valueOf(check.charAt(0));
        int indexCounter = 0;
        for (int i = 1; i < check.length(); i ++) 
        {
            if (string2.charAt(indexCounter) != check.charAt(i)) 
            {
                string2 += check.charAt(i);
                indexCounter ++;
            }
        }
        
        System.out.println(string2);
    }
}
