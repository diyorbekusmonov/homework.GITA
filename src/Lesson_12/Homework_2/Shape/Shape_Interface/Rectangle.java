package Lesson_12.Homework_2.Shape.Shape_Interface;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return 2*(a+b);
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    public int getSideCount() {
        return 2;
    }
}
