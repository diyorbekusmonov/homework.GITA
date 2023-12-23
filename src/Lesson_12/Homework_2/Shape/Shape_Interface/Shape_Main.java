package Lesson_12.Homework_2.Shape.Shape_Interface;

public class Shape_Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());
        System.out.println(circle.getSideCount());
        System.out.println();
        Rectangle rectangle=new Rectangle(4,6);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getSideCount());

    }
}
