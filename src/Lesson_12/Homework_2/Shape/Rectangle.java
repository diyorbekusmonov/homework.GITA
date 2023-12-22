package Lesson_12.Homework_2.Shape;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }


    @Override
    double getPerimetr() {
        return 2*(getA()+getB());
    }

    @Override
    double getSquare() {
        return getA()*getB();
    }

    @Override
    int getSideCount() {
        return 2;
    }
}
