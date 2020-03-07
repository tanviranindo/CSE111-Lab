import java.util.Scanner;
public class Medium02
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner (System.in);
        boolean notEntered = true;
        char[] array;
        for (int n = 0; n < 1; n ++) 
        {
            array = input.next().toCharArray();
            
            int[] alphabets = new int [26];
            
            for (int i = 0; i < array.length; i ++) 
            {
                if (array[i] > 64 && array[i] < 91) 
                {
                    alphabets[array[i] - 65] ++;
                } 
                else if (array[i] > 96 && array[i] < 123) 
                {
                    alphabets[array[i] - 97] ++;
                }
            }
                       
            for (int i = 0; i < 26; i ++) 
            {
                if (alphabets[i] > 1) 
                {
                    notEntered = false;
                    System.err.println("'" + (char) (i + 65) +"' has been counted " + alphabets[i] + " time in the word '"+ String.valueOf(array) + "'");
                }
            }
            
            if (notEntered) 
            {
                System.out.println("You entered " + String.valueOf(array) + ".");
            } 
            else if(notEntered==false)
            {
                n --;
                System.out.println("Please enter another word.");
                notEntered=true;
            }
        }
    }
}