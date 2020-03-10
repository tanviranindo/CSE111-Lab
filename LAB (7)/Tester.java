/**
 *
 * @author 19101268
 */
import static java.lang.System.out;
import java.util.Scanner;
public class Tester{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        out.print("Enter First String: ");
        String first = input.next();
        MyString s1 = new MyString(first);
        
        out.println(s1.length());
        
        out.print("Enter Char At: ");
        int number = input.nextInt();
        out.println(s1.charAt(number));
        
        out.println(s1.startsWith());
        
        out.println(s1.endsWith());
        
        out.print("(Use of replaceFirst)\n"+"Old Character: ");
        char a = input.next().charAt(0);
        out.print("New Character: ");
        char b = input.next().charAt(0);
        out.println(s1.replaceFirst(a,b));
        
        out.print("(Use of replaceALL)\n"+"Old Character: ");
        char c = input.next().charAt(0);
        out.print("New Character: ");
        char d = input.next().charAt(0);
        out.println(s1.replaceAll(c, d));
        
        out.print("(Use of replaceLast)\n"+"Old Character: ");
        char e = input.next().charAt(0);
        out.print("New Character: ");
        char f = input.next().charAt(0);
        out.println(s1.replaceLast(e, f));
        
        out.println(s1.toLowerCase());
  
        out.println(s1.toUpperCase());
      
        out.println(s1.equals());
      
        out.println(s1.equalsIgnoreCase());
      
        out.println(s1.compareTo());
      
        out.println(s1.compareToIgnoreCase());
      
        out.print("Enter (X) for subString(X has to be smaller than word's length): ");
        int num0 = input.nextInt();
        out.println(s1.subString(num0));
      
        out.print("Enter (X) for substring(X has to be smaller than Y): ");
        int num01 = input.nextInt();
        out.print("Enter (Y) for subString(Y can not be greater than word's length): ");
        int num02= input.nextInt();
        out.println(s1.subString(num01, num02));
      
        out.print("Enter Character for indexOf: ");
        char i = input.next().charAt(0);
        out.println(s1.indexOf(i));
      
        out.print("Enter Character for lastIndexOf: ");
        char j = input.next().charAt(0);
        out.println(s1.lastIndexOf(j));
      
        out.print("Enter Number for indexOf: ");
        int num2 = input.nextInt();
        out.print("Enter Character for indexOf: ");
        char k = input.next().charAt(0);
        out.println(s1.indexOf(k, num2));
      
        out.print("Enter Number for indexOf: ");
        int num3 = input.nextInt();
        out.print("Enter Character for indexOf: ");
        char l = input.next().charAt(0);
        out.println(s1.lastIndexOf(l, num3));
      
        out.println(s1.concat());
    }
}