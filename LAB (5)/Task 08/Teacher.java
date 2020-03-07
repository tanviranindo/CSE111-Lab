/**
 *
 * @author 19101268
 */
public class Teacher {
  String name;
  String department;
  String subject = "";
  
  Teacher(String n, String d) {   
    name = n;
    department = d;
  }
  
  public void addCourse(Course c) {
    subject = subject+"\n"+c.course;
  }
  void printDetail() {
    System.out.println("========================");
    System.out.println("Name: "+name);    
    System.out.println("Department: "+department);
    System.out.println("List of courses");
    System.out.print("========================");
    System.out.println(subject);
    System.out.println("========================");
    
    
  }
  
  
}
