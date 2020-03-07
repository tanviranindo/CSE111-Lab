/**
 *
 * @author 19101268
 */
public class Dog {
    private String color = "Black";
    
    public void bark() {
        System.out.println(color+" dog is barking");
    }    
    public void changeColor(String s) {
        color = s;
    }
    Dog(String s) {
        color = s;
    }
    
} 