package Lesson_12.Homework_2.Shape;

public class Shape_Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,4);
        Circle circle=new Circle(3);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getSideCount());
        System.out.println();
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());
        System.out.println(circle.getSideCount());
    }
}
