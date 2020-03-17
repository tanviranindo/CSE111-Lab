class Car {
    public static int objectCount;
    private int year;
    
    
    public int getYear() {
        return year;
    }
    
    public static int getObjectCount() {
        return objectCount;
    }
    
    public Car(int year) {
        this.year = year;
        objectCount++;
    }
}