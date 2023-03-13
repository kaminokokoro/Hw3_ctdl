package Hw3_21000143.ex2;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
        this.setName("Circle");
    }
    @Override
    protected double getVolume() {
        return 0;
    }
    @Override
    protected double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
