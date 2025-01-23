package isp.lab3.exercise4;
import java.lang.Math;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint()
    {
        x = 0;
        y = 0;
        z = 0;
    }
    public MyPoint(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() { return x; }
    public int getY() { return y;}
    public int getZ() { return z;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setZ(int z) {this.z = z;}
    public void setXYZ(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() { return "(x, " +x+ "y, " +y+ "z)";}
    public double distance(int x, int y, int z)
    {
       double d;
       d = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2) + Math.pow((this.z - z), 2));
       return d;

    }

    public double distance(MyPoint another)
    {
        int x = another.getX();
        int y = another.getY();
        int z = another.getZ();
        return distance(x, y, z);
    }



    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2, 3);
        MyPoint p2 = new MyPoint(4, 5, 6);
        
        System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));

    }

}

