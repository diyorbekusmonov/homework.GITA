package Lesson_18.ATM;

public class Money {
private int count;
    private String amount;

    public Money(int count, String amount) {
        this.count = count;
        this.amount = amount;
    }

    public Money(String amount) {
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String  amount) {
        this.amount = amount;
    }
}
