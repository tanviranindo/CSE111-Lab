public class Vehicle {
    private int x, y;
    
    public void moveUp() {
        y ++;
    }
    
    public void moveDown() {
        y --;
    }
    
    public void moveLeft() {
        x --;
    }
    
    public void moveRight() {
        x ++;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
