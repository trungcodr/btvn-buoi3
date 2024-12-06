package btvn_buoi5;

public class Rectangle extends ShapeService {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length+width)*2 ;
    }

    public void showInfo(){
        System.out.println("Dien tich hinh chu nhat: " + area());
        System.out.println("Chu vi hinh chu nhat: " + perimeter());
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

