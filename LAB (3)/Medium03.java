import java.util.Scanner;
public class Medium03
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String names = input.nextLine();
        String names2 = input.nextLine();
        String concating = names.concat(" ").concat(names2);
        char []convert = concating.toCharArray();
        int store1 = 0;
        int store2 = 0;
        for(int i = 0; i<convert.length; i++)
        {
            System.out.print(convert[i]);
        }
        System.out.println();
        for(int i = 0; i<names.length(); i++)
        {
            int temp = names.codePointAt(i);
            if(temp!=32)
            {
                store1 = store1 + temp;
            }
        }
        for(int i = 0; i<names2.length(); i++)
        {
            int temp = names2.codePointAt(i);
            if(temp!=32)
            {
                store2 = store2 + temp;
            }
        }
            System.out.println(store1+store2);
    }
    
}

