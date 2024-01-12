package Lesson_14.Homework_1;

public class Car {
    Battery battery;
    private final int slotCount;
    private final int powerOfMotor;
    private int useEnergy;

    public Car(int slotCount, int powerOfMotor,Battery battery) {
        this.battery = battery;
        this.slotCount = slotCount;
        this.powerOfMotor = powerOfMotor;
    }

    public boolean run(int time) {
        useEnergy = (int) ((powerOfMotor / 1.5) * time);
        return (powerOfMotor / 1.5) * time <= battery.getBatteryCapacity();
    }

    public String getBatteryInfo() {
        return battery.getBatteryCapacity() - useEnergy +"mAh"+ " " + (battery.getBatteryCapacity() - useEnergy) * 100 / battery.getBatteryCapacity() + "%";

    }

    public boolean addBattery() {
        return slotCount != 0;
    }
}
