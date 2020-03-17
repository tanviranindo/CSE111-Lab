public class Vehicle2010 extends Vehicle {
    public void moveUpperRight() {
        moveUp();
        moveRight();
    }
    
    public void moveUpperLeft() {
        moveUp();
        moveLeft();
    }
    
    public void moveLowerRight() {
        moveDown();
        moveRight();
    }
    
    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }
    
    public boolean equals(Vehicle2010 v2) {
        if (getX() == v2.getX() && getY() == v2.getY()) {
            return true;
        }
        else {
            return false;
        }
    }
}
