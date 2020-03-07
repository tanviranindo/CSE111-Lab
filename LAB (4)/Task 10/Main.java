/**
 *
 * @author 19101268
 */
public class Main
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        
        System.out.println("C1, Radius: " + c1.getRadius());
        System.out.println("C1, Area: " + c1.getArea());
        System.out.println();
        System.out.println("C2, Radius: " + c2.getRadius());
        System.out.println("C2, Area: " + c2.getArea());
    }
    
}
