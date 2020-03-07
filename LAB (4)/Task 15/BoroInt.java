/**
 *
 * @author 19101268
 */
class BoroInt {
    
    public String val;
    
    public BoroInt() { 
        val = "0"; 
    }
    
    public BoroInt(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!(n.codePointAt(i) >= 48 && n.codePointAt(i) <= 57)) {
                System.err.println("BoroIntErModdheNumberCharaArKisuDeyaJaiNaException !!");
            } else { val = n; }
        }
    }
    
    public BoroInt(int n) {
        val = String.valueOf(n);
    }
    
    public BoroInt(BoroInt i) {
        this.val = i.val;
    }
    
    public String trim(String s) {
        String space = "";
        for (int i = 0; i < s.length(); ++i) {
            if (!(s.codePointAt(i)==32)) { space += s.charAt(i); }
        }
        return space;
    }
    
    public boolean validValue(String s) {
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.codePointAt(i) >= 48 && s.codePointAt(i) <= 57)) {
                isValid = false;
                break;
            } 
            else { 
                isValid = true; 
            }
        }
        return isValid;
    }
   
    public BoroInt add(BoroInt val) {
        BoroInt b1 = new BoroInt();        
        int oNe = Integer.parseInt(val.val);
        int tWo = Integer.parseInt(this.val);
        int sum = oNe+tWo;
        b1.val = String.valueOf(sum);
        return b1;
        
    }
    public BoroInt subtract(BoroInt val) {
        BoroInt b1 = new BoroInt();        
        int oNe = Integer.parseInt(val.val);
        int tWo = Integer.parseInt(this.val);
        int subtract = oNe-tWo;
        b1.val = String.valueOf(subtract);
        return b1;
    }
    public BoroInt multiply(BoroInt val) {
        BoroInt b1 = new BoroInt();        
        int oNe = Integer.parseInt(val.val);
        int tWo = Integer.parseInt(this.val);
        int multiply = oNe*tWo;
        b1.val = String.valueOf(multiply);
        return b1;
    }
    public BoroInt divide(BoroInt val) {
        BoroInt b1 = new BoroInt();        
        int oNe = Integer.parseInt(val.val);
        int tWo = Integer.parseInt(this.val);
        int divide = oNe/tWo;
        b1.val = String.valueOf(divide);
        return b1;
    }    
}