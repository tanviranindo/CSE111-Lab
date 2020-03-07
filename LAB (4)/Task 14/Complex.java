/**
 *
 * @author Tanvir Anindo
 */
public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    public Complex() {
        realPart = 0.0;
        imaginaryPart = 0.0;        
    }
    public Complex (double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;        
    }
    
    public Complex add (Complex otherNumber) {
        Complex newComplex = new Complex();
        newComplex.realPart = realPart + otherNumber.realPart;
        newComplex.imaginaryPart = imaginaryPart + otherNumber.imaginaryPart;
        return newComplex;        
    }
    
    public Complex subtract (Complex otherNumber) {
        Complex newComplex = new Complex();
        newComplex.realPart = realPart - otherNumber.realPart;
        newComplex.imaginaryPart = imaginaryPart - otherNumber.imaginaryPart;
        return newComplex;        
    }
    
    public Complex multiply (Complex otherNumber) {
        Complex newComplex = new Complex();
        newComplex.realPart = realPart * otherNumber.realPart - imaginaryPart * otherNumber.imaginaryPart ;
        newComplex.imaginaryPart = realPart * otherNumber.imaginaryPart + otherNumber.realPart * imaginaryPart;
        return newComplex;        
    }
    
    public Complex divide (Complex otherNumber) {
        Complex newComplex = new Complex();
        
        double leftRealPart = realPart;
        double leftImaginaryPart = imaginaryPart;
        
        double rightRealPart = otherNumber.realPart;
        double rightImaginaryPart = -otherNumber.imaginaryPart;
        
        double productofRealPart = otherNumber.realPart * otherNumber.realPart;
        double productofImaginaryPart = otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        
        Complex leftComplex = new Complex(leftRealPart, leftImaginaryPart);
        Complex rightComplex = new Complex(rightRealPart, rightImaginaryPart);
        
        Complex numComplex = leftComplex.multiply(rightComplex);
        double denominator = productofRealPart + productofImaginaryPart;
        
        newComplex.realPart = numComplex.realPart / denominator;
        newComplex.imaginaryPart = numComplex.imaginaryPart / denominator;
        
        return newComplex;        
    }
        
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    public double getRealPart() {
        return realPart;
    }
    
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    
    public String toString() {
        return String.format("%.2f",realPart) + " + (" + String.format("%.2f",imaginaryPart) + "i)";
    }

}
