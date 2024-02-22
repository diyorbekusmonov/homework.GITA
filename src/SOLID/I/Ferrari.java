package SOLID.I;

public class Ferrari implements Sportcar{
    @Override
    public int getSpeed() {
        return 400;
    }

    @Override
    public int getMaxSpeed() {
        return 410;
    }
}
