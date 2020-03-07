/**
 *
 * @author 19101268
 */
public class Circle 
{
 private double radius = 1.0;
 private String color = "red";
 
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    Circle()
    {
        
    }
    Circle(double r)
    {
        radius = r;
    }
}