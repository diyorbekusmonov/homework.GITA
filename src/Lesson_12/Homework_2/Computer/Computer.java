package Lesson_12.Homework_2.Computer;

public abstract class Computer {
    private final String processesModel;
    private final int diskSize;

    public Computer(String processesModel, int diskSize) {
        this.processesModel = processesModel;
        this.diskSize = diskSize;
    }

    public String getProcessesModel() {
        return processesModel;
    }

    public int getDiskSize() {
        return diskSize;
    }

    abstract void showInfo();
}
