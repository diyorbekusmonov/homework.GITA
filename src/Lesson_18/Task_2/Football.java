package Lesson_18.Task_2;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Football {
    public static void main(String[] args) {

        List<String> futballPlayers = new LinkedList<>();
        futballPlayers.add("Akbar");
        futballPlayers.add("Ali");
        futballPlayers.add("Doni");
        futballPlayers.add("Bilol");
        futballPlayers.add("Behruz");
        futballPlayers.add("Said");
        futballPlayers.add("Jamshid");
        futballPlayers.add("Jahon");
        futballPlayers.add("Elyor");


        List<String> tennisPlayers = new LinkedList<>();
        tennisPlayers.add("Akmal");
        tennisPlayers.add("Bilol");
        tennisPlayers.add("Xoji");
        tennisPlayers.add("Maqsud");
        tennisPlayers.add("Jamshid");
        tennisPlayers.add("Jahon");
        tennisPlayers.add("Vali");
        tennisPlayers.add("G'ulom");
        tennisPlayers.add("Akbar");

        futballPlayers.removeAll(tennisPlayers);
        System.out.println("futball players: " + futballPlayers);
        System.out.println(tennisPlayers.size() + futballPlayers.size());
        LinkedHashSet<String>st=LinkedHashSet.newLinkedHashSet(0);
    }
}