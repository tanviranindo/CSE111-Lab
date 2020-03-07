/**
 *
 * @author 19101268
 */
public class Bird {
    public String color="";
    public String size="";
    Bird(){

    }
    Bird(String s) {
        size =s;
    }
     Bird(String s, String c) {
        size =s;
        color =c+"*";
    }
    
    void fly() {
        if(size.equals("") && color.equals(""))System.out.println("Bird*is*flying.");
        else System.out.println(size+"*"+color+"bird*is*flying.");
    }
}
