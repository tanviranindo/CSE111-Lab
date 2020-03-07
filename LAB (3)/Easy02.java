import java.util.Scanner;
public class Easy02
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       String check = input.nextLine();
       char news[] = check.toCharArray();
       
       for(int i=0; i<news.length; i++)
       {
           news[i]+=1;
       }
       for(int i=0; i<news.length; i++) 
       {
           if(news[i]=='!')
           {
               System.out.print(" ");
           }
           else
           {
               System.out.print(news[i]);
           }
       }
       System.out.println();    
    }
}
