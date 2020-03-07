/**
 *
 * @author 19101268
 */
import java.util.Scanner;
public class ClockDemo 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter midnight time: ");
        int midSec = input.nextInt();
        System.out.println("");
        
        Clock firstClock = new Clock (midSec);
        
        System.out.println("First Clock Ticking: ");
        for(int i=0; i<10; i++)
        {
            firstClock.tick();
            System.out.println(firstClock.toString(midSec));
        }
        
        System.out.println("");
        
        System.out.println("Enter hours: ");
        int hours = input.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = input.nextInt();
        System.out.println("Enter seconds value");
        int seconds = input.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);
        
        System.out.println("");
        System.out.println("Second Clock Ticking: ");
        for(int i=0; i<10; i++)
        {
            secondClock.tick();
            System.out.println(secondClock.toString(midSec));
        }        
        
        System.out.println("");
        
        firstClock = firstClock.addClock(secondClock);
        
        
        System.out.println("First Clock: "+firstClock.toString(midSec));
        System.out.println("Second Clock: "+secondClock.toString(midSec));
        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Third Clock: "+thirdClock.toString(hours));
    }
    
}
