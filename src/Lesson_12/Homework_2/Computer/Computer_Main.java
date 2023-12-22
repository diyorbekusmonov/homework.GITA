package Lesson_12.Homework_2.Computer;

public class Computer_Main {
    public static void main(String[] args) {
        Acer acer = new Acer("Intel Celeron", 512);
        HP hp = new HP("Intel CORE i5", 256);
        MSI msi = new MSI("AMD Ryzen 9", 2);
        acer.showInfo();
        hp.showInfo();
        msi.showInfo();
    }
}
