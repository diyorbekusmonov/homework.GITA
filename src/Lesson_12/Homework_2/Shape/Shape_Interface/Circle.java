package Lesson_12.Homework_2.Shape.Shape_Interface;

public class Circle implements Shape {
    private double a;


    public Circle(int a) {
        this.a = a;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*a;
    }

    @Override
    public double getSquare() {
        return Math.PI*a*a;
    }

    @Override
    public int getSideCount() {
        return 1;
    }
}
