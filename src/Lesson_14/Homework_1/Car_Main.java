package Lesson_14.Homework_1;

public class Car_Main {
    public static void main(String[] args) {
        Battery battery = new Battery(1000);
        Car car = new Car(4, 5, battery);
        System.out.println(car.run(10));
        System.out.println(car.getBatteryInfo());
        System.out.println(car.addBattery());
    }
}
