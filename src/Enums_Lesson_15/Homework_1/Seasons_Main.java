package Enums_Lesson_15.Homework_1;

import java.util.Scanner;

public class Seasons_Main {
    public static void main(String[] args) {
        System.out.print("ENTER MONTH NUMBER: ");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> Seasons.WINTER.month(1);
            case 2 -> Seasons.WINTER.month(2);
            case 3 -> Seasons.SPRING.month(3);
            case 4 -> Seasons.SPRING.month(4);
            case 5 -> Seasons.SPRING.month(5);
            case 6 -> Seasons.SUMMER.month(6);
            case 7 -> Seasons.SUMMER.month(7);
            case 8 -> Seasons.SUMMER.month(8);
            case 9 -> Seasons.AUTMN.month(9);
            case 10 -> Seasons.AUTMN.month(10);
            case 11 -> Seasons.AUTMN.month(11);
            case 12 -> Seasons.WINTER.month(12);

        }
    }
}
