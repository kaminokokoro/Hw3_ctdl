package Hw3_21000143.ex2;

public class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
        this.setName("Sphere");
    }
    @Override
    protected double getVolume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
    @Override
    protected double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    protected double getPerimeter() {
        return 0;
    }
}
