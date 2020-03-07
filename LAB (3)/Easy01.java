import java.util.Scanner;
public class Easy01
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       String check = input.nextLine();
       char news[] = check.toCharArray();
       
       for(int i=0; i<news.length; i++)
       {
        for(int j=i+1; j<news.length; j++)
        {    
           if(news[j]<news[i])
           {
               int temp = news[j];
               news[j] = news[i];
               news[i] = (char)temp;
           }
        }
       }
       for(int i=0; i<news.length; i++) System.out.print(news[i]);
       System.out.println();    
    }
}
