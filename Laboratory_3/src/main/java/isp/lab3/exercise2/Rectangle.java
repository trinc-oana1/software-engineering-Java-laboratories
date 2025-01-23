package isp.lab3.exercise2;

public class Rectangle {
    private int length = 2;
    private int width = 1;
    private String color = "red";

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() { return length;}
    public int getWidth() { return width;}
    public String getColor() { return color;}
    public int getPerimeter() {return 2*length + 2*width;}
    public int getArea() { return length * width;}

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, "blue");

        String c;
        r1.getLength();
        r1.getWidth();
        r1.getColor();
        r1.getPerimeter();
        r1.getArea();
        System.out.println("R1 has the following: "+"\nlength= " + r1.getLength()+ "\nwidth= " + r1.getWidth()+ "\ncolor= " + r1.getColor()+ "\nperimeter= " + r1.getPerimeter()+ "\narea= " + r1.getArea()  );

    }

}
