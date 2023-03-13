package Hw3_21000143.ex2;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.setName("Rectangle");
    }
    @Override
    protected double getVolume() {
        return 0;
    }
    @Override
    protected double getArea() {
        return length * width;
    }
    @Override
    protected double getPerimeter() {
        return 2 * (length + width);
    }

}
