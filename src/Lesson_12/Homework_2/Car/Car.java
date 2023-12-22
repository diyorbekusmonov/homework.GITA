package Lesson_12.Homework_2.Car;

public abstract class Car {
    private int maxCapacity;
    private int busyCapacity;

    public Car(int maxCapacity, int busyCapacity) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;

    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBusyCapacity() {
        return busyCapacity;
    }
    public abstract int maxLongestWay(int fuelConsumption);

    abstract int getMaxOilFromREfill(int fuelCapacity);

}
