/**
 *
 * @author 19101268
 */
import static java.lang.System.out;
import java.util.Scanner;
public class MyString{
    Scanner input = new Scanner(System.in);
    char [] c;
    String s="";
    public MyString(String s){
        out.println("First String: "+s);
        c = s.toCharArray();
        this.s=s;
    }
    
    public int length (){
        int count = 0;
        for(int i=0; i<c.length; i++){
            count++;
        }
        out.print("Length of the String: ");
        return count;    
    }
    public char charAt(int n){
        char a = 0;
        if(n>c.length-1 || n<0){
            System.out.println("Invalid Index");
        }
        else{
            a = c[n];
        }
        out.print("At "+n+" character is: ");
        return a;
    }
    
    public boolean startsWith(){
        out.print("Enter Second String for startsWith:");
        String s = input.next();
        char[] second = s.toCharArray();
        if(second.length<=c.length){
            for(int i=0; i<second.length; i++){
                if(second[i]!=c[i]){
                    out.print(this.s+" starts with "+s+": ");
                    return false;
                }
            }
            out.print(this.s+" starts with "+s+": ");
            return true;
        }
        else{
            out.print(this.s+" starts with "+s+": ");
            return false;
        }
    }
    public boolean endsWith(){
        out.print("Enter Second String for endsWith:");
        String s = input.next();
        char[] second = s.toCharArray();
        if(second.length<=c.length){
            for(int i=second.length-1, j=c.length-1; i>=0; i--){
                if(second[i]!=c[j]){
                    out.print(this.s+" ends with "+s+": ");
                    return false;
                }
                --j;
            }
            out.print(this.s+" ends with "+s+": ");
            return true;
        }
        else{
            out.print(this.s+" ends with "+s+": ");
            return false;
        }
    }
    public char[] replaceFirst(char oldChar, char newChar) {
        out.print("Enter a String to replace First: ");
        String s = input.next();
        char[] saves = s.toCharArray();
        for(int i=0; i<saves.length; i++){
            if(saves[i]==oldChar){
                saves[i]=newChar;
                break;
            }
        }
        out.print("After replacing the first "+oldChar+" by "+newChar+": ");
        return saves;
    }
    public char[] replaceAll(char oldChar, char newChar) {
        out.print("Enter a String to replace All: ");
        String s = input.next();
        char[] saves = s.toCharArray();
        for(int i=0; i<saves.length; i++){
            if(saves[i]==oldChar){
                saves[i]=newChar;
            }
        }
        out.print("After replacing all "+oldChar+" by "+newChar+": ");
        return saves;
    }
    public char[] replaceLast(char oldChar, char newChar) {
        out.print("Enter a String to replace Last: ");
        String s = input.next();
        char[] saves = s.toCharArray();
        for(int i=saves.length-1; i>=0; i--){
            if(saves[i]==oldChar){
                saves[i]=newChar;
                break;
            }
        }
        out.print("After replacing the last "+oldChar+" by "+newChar+": ");
        return saves;
    }
    public char[] toLowerCase(){ 
        out.print("Enter a String to convert into LowerCase: ");
        String s = input.next();
        char[] saves = s.toCharArray();
        for(int i=0; i<saves.length; i++){
            if((int)saves[i]>=65 && (int)saves[i]<=90){
                saves[i]+=32;
            }
        }
        out.print("LowerCase for "+s+" is ");
        return saves;
    }    
    public char[] toUpperCase(){ 
        out.print("Enter a String to convert into UpperCase: ");  
        String s = input.next();
        char[] saves = s.toCharArray();
        for(int i=0; i<saves.length; i++){
            if((int)saves[i]>=97 && (int)saves[i]<=122){
                saves[i]-=32;
            }
        }
        out.print("UpperCase for "+s+" is ");
        return saves;
    }
    
    public boolean equals(){
        out.print("Enter Second String to check Equality: ");
        String s2 = input.next();
        char[] secondInput = s2.toCharArray();
        boolean a = true;
        if(c.length!=secondInput.length){
            a = false;
        }
        else{
            for(int i=0; i<secondInput.length; i++){
                a = c[i]==secondInput[i];
            }
        }
        out.print(this.s+" is equal "+s2+": ");
        return a;
    }
    
    public boolean equalsIgnoreCase(){
        out.print("Enter Second String to check Equality (IgnoreCASE): ");
        String s2 = input.next();
        char[] secondInput = s2.toCharArray();
        boolean a = true;
        if(c.length!=secondInput.length){
            a = false;
        }
        else{
            for(int i=0; i<secondInput.length; i++){
                if(c[i]==secondInput[i]){
                    a = true;
                }
                else a = c[i]==secondInput[i]+32 || c[i]+32==secondInput[i];
            }
        }
        out.print(this.s+" is equal "+s2+": ");
        return a;
    }
    public int compareTo(){
        out.print("Enter Second String for CompareTO: ");
        String s2 = input.next();
        char[] s12 = s2.toCharArray();
        int len;
        if (c.length<s12.length) {
            len = s12.length;
        }
        else {
            len = c.length;
        }
        int r = 0;
        for (int i = 0; i < len; i++) {
            if (c[i]==s12[i]){
                r = 0;
            }
            else if ((int)s12[i]>(int)c[i]) { 
                r = (int)s12[i]-(int)c[i]; 
                break; 
            }
            else { 
                r = (int)s12[i]-(int)c[i]; 
                break; 
            }
        }
        out.print("Output for CompareTo is: ");
        return r;
    }
    public int compareToIgnoreCase(){
        out.print("Enter Second String for CompareTO (IgnoreCase): ");
        String s2 = input.next();
        out.print("Output for CompareTo (IgnoreCase) is: ");
        return s.toUpperCase().compareTo(s2.toUpperCase());
    }
    public String subString(int x){
        out.print("Enter a string to use subString: ");
        char[] subs =input.next().toCharArray();
        String save = "";
        for(int i=x; i<subs.length; ++i){
            save=save+subs[i];
        }
        out.print("SubString for "+x+": ");
        return save;
    }
    public String subString(int x, int y){
        out.print("Enter a string to use subString: ");
        char[] subs = input.next().toCharArray();
        String save = "";
        for(int i=x; i<=y; ++i){
            save=save+subs[i];
        }
        out.print("SubString for "+x+" and "+y+": ");
        return save;
    }
    public int indexOf(char ch){
        int temp=-1;
        for(int i=0; i<c.length; ++i){
            if(c[i]==ch){
                temp=i;
                break;
            }
        }
        out.print("Integer of "+ch+" for indexOf is: ");
        return temp;
    }
    public int lastIndexOf(char ch){
        int temp=-1;
        for(int i=c.length-1; i>=0; --i){
            if(c[i]==ch){
                temp=i;
                break;
            }
        }
        out.print("Integer of "+ch+" for lastIndexOf is: ");
        return temp;
    }
    public int indexOf(char ch, int fromIndex){
        int temp=-1;
        for(int i=fromIndex; i<c.length; ++i){
            if(c[i]==ch){
                temp=i;
                break;
            }
        }
        out.print("From indexOf "+fromIndex+" and character "+ch+": ");
        return temp;
    }
    public int lastIndexOf(char ch, int fromIndex){
        int temp=-1;
        for(int i=fromIndex; i>=0; --i){
            if(c[i]==ch){
                temp=i;
                break;
            }
        }
        out.print("From lastIndexOf "+fromIndex+" and character "+ch+": ");
        return temp;
    }  
    
    public String concat(){
        out.print("Enter Second String for concatenate: ");
        String s2 = input.next();
        out.print("After concatenation: ");
        return s+s2;
    }
}