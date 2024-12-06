package btvn_buoi5;

public class Square extends ShapeService{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    public void showInfo(){
        System.out.println("Dien tich hinh vuong: " + area());
        System.out.println("Chu vi hinh vuong: " + perimeter());
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
