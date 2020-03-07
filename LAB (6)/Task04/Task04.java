/**
 *
 * @author 19101268
 */
public class Task04 {
  public static char [] trim(char [] input){
        boolean firstspace = false;
        String abc = "";
        for(int i=0; i < input.length; i++){
            if(!firstspace && input[i]==' ') { 
                firstspace = true;
                abc += input[i];
            }
            else if (input[i]!=' ') {
                abc += input[i];
                firstspace = false;
            }
        }
        return abc.toCharArray();
    }
    public static void main(String[] args) {
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = trim(input);
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}