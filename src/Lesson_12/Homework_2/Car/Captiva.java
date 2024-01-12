package Lesson_12.Homework_2.Car;

public class Captiva extends Car{
    public Captiva(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    public int maxLongestWay(int fuelConsumption) {
        return getMaxCapacity()/fuelConsumption;
    }

    @Override
    int getMaxOilFromREfill(int fuelCapacity) {
        return fuelCapacity-getBusyCapacity();
    }

}
