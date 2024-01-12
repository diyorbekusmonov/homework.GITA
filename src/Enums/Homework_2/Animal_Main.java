package Enums.Homework_2;

import java.util.Scanner;

import static Enums.Homework_2.Animal.*;

public class Animal_Main {
    public static void main(String[] args) {
        System.out.println("CHOOSE: ");
        System.out.print("1.DOG   ");
        System.out.print("2.CAT   ");
        System.out.print("3.SHEP  ");
        System.out.print("4.COW   ");
        System.out.println("5.ROOSTER");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> {
                System.out.print(DOG + "-");
                DOG.soundAnimals();
            }

            case 2 -> {
                System.out.print(CAT + "-");
                CAT.soundAnimals();
            }
            case 3 -> {
                System.out.print(SHEP + "-");
                SHEP.soundAnimals();
            }
            case 4 -> {
                System.out.print(COW + "-");
                COW.soundAnimals();
            }
            case 5 -> {
                System.out.print(ROOSTER + "-");
                ROOSTER.soundAnimals();
            }
            default -> System.out.println("ERROR");

        }
    }
}