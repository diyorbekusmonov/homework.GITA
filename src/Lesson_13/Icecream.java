package Lesson_13;

public class Icecream {
    Milk milk;
    Resept resept;
    Piece piece;

    public Icecream(Resept resept, Piece piece) {
        this.resept = resept;
        this.piece = piece;
    }

    public void addMilk(int newMilk) {
        int temp = milk.getMilkVolume() + newMilk;
    }

    public void addSugar() {

    }
}
