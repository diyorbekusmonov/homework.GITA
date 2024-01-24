package Lesson_18.ATM;

import java.util.List;

public class ATM_Main {
    public static void main(String[] args) {
        Money money1 = new Money(1000, "5000");
        ATM atm = new ATM();
        atm.addMoneys((List<Money>) money1,false);
    }
}
