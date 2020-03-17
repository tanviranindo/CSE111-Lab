class ComplexNumber extends RealNumber {
    private double imaginaryValue;
    
    public void setImaginaryValue(double imaginaryPart) {
        imaginaryValue = imaginaryPart;
    }
    
    public double getImaginaryValue() {
        return imaginaryValue;
    }
    
    public ComplexNumber() {
        setRealValue(1);
        setImaginaryValue(1);
    }
    
    public ComplexNumber(double realPart, double imaginaryPart) {
        setRealValue(realPart);
        setImaginaryValue(imaginaryPart);
    }
    
    public void check() {
        ping();
        super.ping();
        System.out.println("Checking ended.");
    }
    
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
    
    public String toString() {
        return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
}