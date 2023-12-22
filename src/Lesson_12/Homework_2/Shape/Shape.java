package Lesson_12.Homework_2.Shape;

public abstract class Shape {
    private double a;
    private double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    abstract double getPerimetr();
    abstract double getSquare();
    abstract int getSideCount();

}
