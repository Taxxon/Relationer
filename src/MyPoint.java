/**
 * Created by emka15 on 2017-11-08.
 */
public class MyPoint {

    private int x = 0;
    private int y = 0;

    MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getX() {

        return x;
    }

    public int[] getXY(){
        return new int[this.x + this.y];
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x)*(this.x - x)+(this.y - y)*(this.y - y));
    }

    public  double distance(MyPoint another){
        return Math.sqrt(((this.x - another.getX()) * (this.x - another.getX())) + ((this.y - another.getY()) * (this.y - another.getY())));
    }

    public double distance(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }
}
