package Hw3_21000143.ex2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Sphere(5);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(5, 10);
        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            if (shape instanceof Sphere) {
                System.out.println("Volume: " + shape.getVolume());
            }else {
                System.out.println("Area: " + shape.getArea());
            }
            System.out.println();
        }
    }
}
