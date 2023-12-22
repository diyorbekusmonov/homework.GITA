package Lesson_12.Homework_2.Car;

public class Malibu extends Car {
    public Malibu(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    public int maxLongestWay(int fuelConsumption) {
        return getMaxCapacity() / fuelConsumption;
    }

    @Override
    public int getMaxOilFromREfill(int fuelCapacity) {
        return fuelCapacity-getBusyCapacity();
    }


}
