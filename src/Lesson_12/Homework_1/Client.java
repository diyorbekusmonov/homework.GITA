package Lesson_12.Homework_1;

import java.util.Scanner;

public class Client {
    Scanner in = new Scanner(System.in);

    private final int costCAll;
    private final int costSMS;
    private int minutCall;
    private int countSMS;
    private int addedBalans;
    private int balans;
    private boolean temp = true;

    public Client(int costCAll, int costSMS, int balans) {
        this.costCAll = costCAll;
        this.costSMS = costSMS;
        this.balans = balans;
    }

    public boolean isActive() {
        if (costCAll <= balans || costSMS <= balans) {
            System.out.println("Abonent is active");
            return true;

        } else {
            temp = false;
            System.out.println("Abonent is inactive");
        }
        return false;
    }

    public void addSum() {
        while (!isActive()) {
            if (!temp) {
                System.out.print("Balansni to'ldiring: ");
                addedBalans = in.nextInt();
                balans += addedBalans;
            }
        }
    }

    public void call(int callMinut) {
        if (balans / (costCAll * callMinut) >= 1) {
            System.out.println(true);
        }else System.out.println(false);
    }

    public void  sms(int smsCount) {
        if (balans / (costSMS * smsCount) >= 1) {
            System.out.println(true);
        }else System.out.println(false);
    }
}
