/**
 *
 * @author 19101268
 */
public class Clock 
{
    private int hours;
    private int minutes;
    private int seconds;
    
    void setClock(int seconds) 
    {
        seconds = seconds % 86400;
        setHours(seconds / 3600);
        setMinutes(seconds % 3600 / 60);
        setSeconds(seconds % 3600 % 60);
    }
    int getHours()
    {
        return hours;
    }
    int getMinutes()
    {
        return minutes;
    }
    int getSeconds()
    {
        return seconds;
    }
    
    void setHours(int h)
    {
        if(hours<24 && hours>=0)
        {
            hours = h;
        }
    }
    void setMinutes(int m)
    {
        if(m>59)
        {
            setHours(hours+(m/60));
        }
        if(minutes<60 && minutes>=0)
        {
            minutes = m%60;
        }
    }
    void setSeconds(int s)
    {
        if(s>59)
        {
            setMinutes(minutes+(s/60));         
        }
        if(seconds<60 && seconds>=0)
        {
            seconds = s%60;
        }
    }
    
    void tick()
    {
        setSeconds(seconds+1);
    }
    
    Clock addClock(Clock c)
    {
        int totalSecondsOfC = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        int totalTime = totalSecondsOfC + totalSeconds;
        Clock newClock = new Clock();
        newClock.setClock(totalTime);
        
        return newClock;
    }
    
    String toString(int s)
    {
        return hours + ":" + minutes + ":" + seconds;
    }
    
    void tickDown()
    {
        setSeconds(seconds - 1);
    }
    
    Clock subtractClock(Clock c)
    {
        int totalSecondsOfC = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        int totalTime = Math.abs(totalSecondsOfC - totalSeconds);
        
        Clock newClock = new Clock();
        newClock.setClock(totalTime);
        
        return newClock;
    }
    
    Clock()
    {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }
    
    Clock(int seconds)
    {
        setClock(seconds);
    }
    Clock(int h, int m, int s)
    {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }
}
