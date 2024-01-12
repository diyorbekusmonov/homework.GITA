package Lesson_13;

public class Milk {
    public int milkVolume;
    private int milkCost;

    public Milk(int milkVolume, int milkCost) {
        this.milkVolume = milkVolume;
        this.milkCost = milkCost;
    }

    public int getMilkVolume() {
        return milkVolume;
    }

    public int getMilkCost() {
        return milkCost;
    }

    public void setMilkVolume(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    public void setMilkCost(int milkCost) {
        this.milkCost = milkCost;

    }

}
