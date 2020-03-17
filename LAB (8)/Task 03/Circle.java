class Circle extends Point {
    private double area = 0;
    
    Circle ( double r) {
        super (r);
        System.out.print("Creating a Circle ... ");
        setArea(r);
        System.out.println("done!");
    }
    
    void setArea (double rad) {
        area = Math.PI * rad * rad;
    }
    
    public String toString() {
        return "The area of the Circle is " + area; 
    }
}