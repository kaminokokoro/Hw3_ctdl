package Hw3_21000143.ex1;

public class Complex {

    private float real;
    private float image;

    public Complex(float real, float image) {
        this.real = real;
        this.image = image;
    }

    public float realPart() {
        return real;
    }

    public float imagePart() {
        return image;
    }


    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.image + c.image);
    }

    public Complex minus(Complex c) {
        return new Complex(this.real - c.real, this.image - c.image);
    }

    public Complex time(Complex c) {
        return new Complex(this.real * c.real - this.image * c.image,
                this.real * c.image + this.image * c.real);
    }

    public String toString() {
        return "(" + real + ", " + image + ")";
    }

}
