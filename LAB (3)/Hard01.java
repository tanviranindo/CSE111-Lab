import java.util.Scanner;
public class Hard01
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        String number = input.next();
        int total = 0;
        for (int i = 0; i < number.length(); i ++) {
            total += number.codePointAt(i) - 48;
        }
        
        if (total % 3 == 0) 
        {
            System.out.println(number + " is divisible by 3.");
        } 
        else 
        {
            System.out.println(number + " is not divisible by 3.");
        }
    }
}
