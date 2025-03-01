package es.uah.matcomp.mp.e4.ejerciciosclases;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }
    @Override
    public void moveUp(){
        this.center.moveUp();
    }
    @Override
    public void moveDown(){
        this.center.moveDown();
    }
    @Override
    public void moveLeft(){
        this.center.moveLeft();
    }
    @Override
    public void moveRight(){
        this.center.moveRight();
    }
}
