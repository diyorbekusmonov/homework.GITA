package Lesson_12.Homework_2.Car;

public class Car_Main {
    public static void main(String[] args) {
        Malibu malibu=new Malibu(50,30);
        Captiva captiva=new Captiva(60,40);
        System.out.println(malibu.maxLongestWay(10));
        System.out.println(malibu.getMaxOilFromREfill(40));
        System.out.println();
        System.out.println(captiva.maxLongestWay(12));
        System.out.println(captiva.getMaxOilFromREfill(45));
    }
}
