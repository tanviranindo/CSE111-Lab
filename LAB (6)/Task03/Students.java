/**
 *
 * @author 19101268
 */
public class Students {
    public String name;
    public String id; 
    public String address;
    public double cgpa;
    Students(String n, String i, String a, double c) {
        name = n;
        id=i;
        address=a;
        cgpa=c;
    }
    Students() {
        name = "";
        id = "";
        address = "";
        cgpa = -4.0;
    }
    String nameDao(){
        if(name.equals("")){
            System.out.print("Ei name e kono student nai");
        }
        return name;
    }
    String boloToAmiKe() {
        if(id.equals("")){
        System.out.print("Student ei nai, abar id :P");
        }
        return id;
    }
    String addressDao() {
        if(address.equals("")){
        System.out.print("Naam nai .. thikana ashbe koi theke?");
        }
        return address;
    }
    double cgpaDao() {
        return cgpa;
    }
    void nameBoshao(String s) {
        name = s;
    }    
    void addressBoshao(String s) {
         address = s;
    }
    void idBoshao(String s) {
        id = s;
    }
    void cgpaBoshao(double c) {
        cgpa = c;
    }
    
    void standUp() {
        System.out.println(name+" is now standing up!!");
    }
    String tellMeYourName() {
        String result = "Sir, my name is "+name;
        return result;
    }
    void call(String n) {
        System.out.println(name+": Hey, Sumit Dutta, Sir is calling you!!");
    }
    int add2Numbers(int i, int z) {
        return i+z;
    }
}
