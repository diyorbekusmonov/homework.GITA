package Enums.Homework_2;

import java.util.Arrays;
import java.util.Scanner;

import static Enums.Homework_2.Animal.*;

public class Animal_Main {
    public static void main(String[] args) {

        Animal[] animal = values();
        for (int i = 0; i < animal.length; i++) {
            System.out.print((i + 1) + " " + animal[i] + "\t");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> {
                System.out.print(DOG + " - ");
                DOG.soundAnimals();
            }

            case 2 -> {
                System.out.print(CAT + " - ");
                CAT.soundAnimals();
            }
            case 3 -> {
                System.out.print(SHEP + " - ");
                SHEP.soundAnimals();
            }
            case 4 -> {
                System.out.print(COW + " - ");
                COW.soundAnimals();
            }
            case 5 -> {
                System.out.print(ROOSTER + " - ");
                ROOSTER.soundAnimals();
            }
            default -> System.out.println("ERROR");

        }
    }
}