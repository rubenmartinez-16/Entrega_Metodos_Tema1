package es.uah.matcomp.mp.e3.ejerciciosclases;
public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z=z;
    }
    public Point3D() {}
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }
    @Override
    public String toString() {
        return"("+getX()+","+getY()+","+getZ()+")";
    }
}
