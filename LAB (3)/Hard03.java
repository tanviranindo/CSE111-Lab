import java.util.Scanner;
public class Hard03
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String check = input.next();
        String record = "";
        for(int i=0; i<check.length(); i++) 
        {
            if(check.charAt(i)>64 && check.charAt(i)<91) 
            {
                System.out.print(check.charAt(i));
                for(int j=record.length()-1; j>=0; j--) 
                {
                    System.out.print(record.charAt(j));
                }
                record = new String();
            } 
            else 
            {
                record+= check.charAt(i);
            }
        }
        System.out.println("");
    }
}
