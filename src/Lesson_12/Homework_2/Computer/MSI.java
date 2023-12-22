package Lesson_12.Homework_2.Computer;

public class MSI extends Computer{
    public MSI(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println(getProcessesModel()+" "+getDiskSize()+"TB");
    }
}
