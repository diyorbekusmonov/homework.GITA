package Lesson_12.Homework_2.Shape;

public class Circle extends Shape{
    public Circle(double a) {
        super(a);
    }

    @Override
    double getPerimetr() {
        return  2*Math.PI*getA();
    }

    @Override
    double getSquare() {
        return Math.PI*getA()*getA() ;
    }

    @Override
    int getSideCount() {
        return 1;
    }
}
