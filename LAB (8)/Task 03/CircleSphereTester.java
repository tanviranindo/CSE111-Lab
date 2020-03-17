import java.util.*;

public class CircleSphereTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius of Circle:");
        double circleRadius = sc.nextDouble();
        Circle circle1 = new Circle(circleRadius);
        System.out.println(circle1);
        System.out.println();
        System.out.println("Enter the radius of Sphere:");
        double sphereRadius = sc.nextDouble();
        Sphere sphere1 = new Sphere(sphereRadius);
        System.out.println(sphere1);
    }
}