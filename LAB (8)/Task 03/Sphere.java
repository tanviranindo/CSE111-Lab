class Sphere extends Point {
    private double volume;
    Sphere ( double r) {
        super (r);
        System.out.print("Creating a Sphere ... ");
        volume = 4.0 / 3 * Math.PI * r * r * r;
        System.out.println("done!");
    }
    
    
    
    public String toString() {
        return "The volume of the Sphere is " + volume;
    }
}