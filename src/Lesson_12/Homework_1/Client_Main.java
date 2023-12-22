package Lesson_12.Homework_1;

public class Client_Main {
    public static void main(String[] args) {
        Client client = new Client(200, 150,  100);
        client.addSum();
        client.isActive();
        client.call(3);
        client.sms(6);
    }
}
