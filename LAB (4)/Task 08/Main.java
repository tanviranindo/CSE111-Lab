/**
 *
 * @author 19101268
 */
public class Main
{
    public static void main(String[] args) 
    {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        
        john.setName("john");
        john.setID("19101268");
        john.setAddress("Dhaka");
        john.setCGPA(4.00);
        
        mike.setName("mike");
        mike.setID("19101278");
        mike.setAddress("Bogura");
        mike.setCGPA(3.98);
        
        carol.setName("carol");
        carol.setID("19101008");
        carol.setAddress("Chittagong");
        carol.setCGPA(3.95);
        
        System.out.println("Name: "+john.getName());
        System.out.println("ID: "+john.getID());
        System.out.println("Address: "+john.getAddress());
        System.out.println("CGPA: "+john.getCGPA());
        
        System.out.println("\nName: "+mike.getName());
        System.out.println("ID: "+mike.getID());
        System.out.println("Address: "+mike.getAddress());
        System.out.println("CGPA: "+mike.getCGPA());
        
        System.out.println("\nName: "+carol.getName());
        System.out.println("ID: "+carol.getID());
        System.out.println("Address: "+carol.getAddress());
        System.out.println("CGPA: "+carol.getCGPA());
    }
}