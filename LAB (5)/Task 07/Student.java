/**
 *
 * @author 19101268
 */
public class Student 
{
    private String name;
    public static int numberOfStudents = 0;

    Student() {
        name = "default name";
        numberOfStudents++;
    }
    Student(String n) {
        name = n;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }    
}
