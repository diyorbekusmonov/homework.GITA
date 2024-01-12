package Enums.Homework_1;

import Lesson_13.Sugar;

public enum Seasons {
    SPRING {
        @Override
        public void month(int numberMonth) {
            super.month(numberMonth);
        }
    }, SUMMER {
        @Override
        public void month(int numberMonth) {
            super.month(numberMonth);
        }
    }, AUTMN {
        @Override
        public void month(int numberMonth) {
            super.month(numberMonth);
        }
    }, WINTER {
        @Override
        public void month(int numberMonth) {
            super.month(numberMonth);
        }
    };



    public void month(int numberMonth) {
        switch (numberMonth) {
            case 1 -> System.out.println("january " + WINTER);
            case 2 -> System.out.println("february " + WINTER);
            case 3 -> System.out.println("march " + SPRING);
            case 4 -> System.out.println("april " + SPRING);
            case 5 -> System.out.println("may " + SPRING);
            case 6 -> System.out.println("june " + SUMMER);
            case 7 -> System.out.println("jule " + SUMMER);
            case 8 -> System.out.println("august " + SUMMER);
            case 9 -> System.out.println("september " + AUTMN);
            case 10 -> System.out.println("october " + AUTMN);
            case 11 -> System.out.println("november " + AUTMN);
            case 12 -> System.out.println("december " + WINTER);
            default -> System.out.println("ERROR");
        }
    }
}
