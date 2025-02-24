package es.uah.matcomp.mp.e3.ejerciciosclases;

public class LineSub extends Point{
    private Point end;
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    @Override
    public String toString(){
        return "Line: [Begin = " + super.toString() + ", End = " + end + " ]";
    }
    public Point getBegin(){
        return new Point(super.getX(), super.getY());
    }
    public Point getEnd(){
        return end;
    }
    public void setBegin(Point begin){
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(Point end){
        this.end.setX(end.getX());
        this.end.setY(end.getY());
    }
    public int getBeginX(){
        return super.getX();
    }
    public int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int beginX){
        super.setX(beginX);
    }
    public void setBeginY(int beginY){
        super.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY){
        super.setX(beginX);
        super.setY(beginY);
    }
    public void setEndX(int endX){
        this.end.setX(endX);
    }
    public void setEndY(int endY){
        this.end.setY(endY);
    }
    public void setEndXY(int endX, int endY){
        this.end.setX(endX);
        this.end.setY(endY);
    }
    public int getLength(){
        if (((Math.sqrt((super.getX()-getEndX())*(super.getX()-getEndX()) + (super.getY()-getEndY())*(super.getY()-getEndY())))) - (int) ((Math.sqrt((super.getX()-getEndX())*(super.getX()-getEndX()) + (super.getY()-getEndY())*(super.getY()-getEndY())))) >= 0.5) {
            return 1 + (int) ((Math.sqrt((super.getX() - getEndX()) * (super.getX() - getEndX()) + (super.getY() - getEndY()) * (super.getY() - getEndY()))));
        }
        else{
            return (int) ((Math.sqrt((super.getX()-getEndX())*(super.getX()-getEndX()) + (super.getY()-getEndY())*(super.getY()-getEndY()))));
        }
    }
    public double getGradient(){
        return Math.atan((double)(getEndY()-getBeginY())/(getEndX()-getBeginX()));
    }

}
