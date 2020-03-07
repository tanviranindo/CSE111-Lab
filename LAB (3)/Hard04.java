import java.util.Scanner;
public class Hard04
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int shiftNumber = input.nextInt();
        String check = input.next();
        for (int i=0; i<check.length(); i++) 
        {
            char chill = check.charAt(i);
            chill+= shiftNumber;
            if(chill>90)
            {
                chill-= 26;
            }
            else
            {
                System.out.print(chill);
            }
        }
        System.out.println();
    }
}