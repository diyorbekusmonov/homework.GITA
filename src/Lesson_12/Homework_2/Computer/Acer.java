package Lesson_12.Homework_2.Computer;

public class Acer extends Computer{
    public Acer(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println(getProcessesModel()+" "+getDiskSize()+"GB");
    }
}
