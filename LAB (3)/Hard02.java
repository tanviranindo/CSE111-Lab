import java.util.Scanner;
public class Hard02 
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner (System.in);
        String team = input.next();
        String coach = input.next();
        
        int teams= 1, coachs= 1;
        
        for(int i = 0; i < team.length(); i ++) 
        {
            teams*= team.charAt(i) - 64;
        }
        for(int i = 0; i < coach.length(); i ++)
        {
            coachs*= coach.charAt(i) - 64;
        }
        System.out.println(teams% 14 < coachs% 14 ? "I Am Happy With My Coach" : "I Am Sad With My Coach");
    }
}