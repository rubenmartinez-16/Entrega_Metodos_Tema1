package es.uah.matcomp.mp.e3.ejerciciosclases;

public class MovablePoint extends Point_3_4 {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        setY(y);
        setX(x);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){}
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public MovablePoint move() {
        setX(xSpeed + getX());
        setY(ySpeed + getY());
        return this;
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
