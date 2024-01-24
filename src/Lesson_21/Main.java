package Lesson_21;

import Lesson_21.hamburger.DeluxeBurger;
import Lesson_21.hamburger.HealthyBurger;
import Lesson_21.product.*;
import Lesson_21.product_type.GarnirType;
import Lesson_21.product_type.ProductType;
import Lesson_21.db.KingBurgersDB;
import Lesson_21.hamburger.Hamburger;
import Lesson_21.hamburger.Simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Garnir> userChoseGarnirs = new ArrayList<>();
    private static final List<Hamburger> userChoseHamburgers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KingBurgersDB db = KingBurgersDB.getInstance();

        List<BaseProduct> products = new ArrayList<>();
        products.add(new Meet(ProductType.MEET, 10_000, 5));
        products.add(new RulonBread(ProductType.RULON_BREAD, 3_000, 5));
        products.add(new Garnir(GarnirType.SALAD, 2_000, 5));
        products.add(new Garnir(GarnirType.TOMATO, 1_000, 5));
        products.add(new Meet(ProductType.CHIPS, 8_000, 5));
        products.add(new Meet(ProductType.DRINKS, 7_000, 5));
        products.add(new Garnir(GarnirType.CUCUMBER, 6_000, 5));
        products.add(new Garnir(GarnirType.CABBAGE, 4_000, 5));

        db.setProducts(products);

        boolean isChooseHamburger = true;
        boolean isChooseHamburgerAgain = false;

        while (isChooseHamburger) {
            if (!isChooseHamburgerAgain) {
                System.out.println("Hamburger tanlang!");
                System.out.println("1) Simple burger 2)  Healthy burger 3) Deluxe burger 4) Quit");
            } else {
                System.out.println("Hamburger yana tanlaysizmi?");
                System.out.println("1) Simple burger 2) Healthy burger 3) Deluxe burger 4) Quit");
            }
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Nechta tanlaysiz?");
                    int counterHamburger = scanner.nextInt();
                    choseSimpleBurger(scanner, db, counterHamburger);
                    isChooseHamburgerAgain = true;
                }
                case 2 -> {
                    System.out.println("Nechta tanlaysiz? ");
                    int counterHealthyBurger = scanner.nextInt();
                    choseHealthyBurger(scanner, db, counterHealthyBurger);
                    isChooseHamburgerAgain = true;
                }
                case 3 -> {
                    System.out.println("Nechta tanlaysiz? ");
                    int counterDeluxeBurger = scanner.nextInt();
                    chooseDeluxeBurger(counterDeluxeBurger);
                    isChooseHamburgerAgain = true;
                }
                default -> {
                    isChooseHamburger = false;
                    System.out.println("Sizning burgerlaringiz : ");
                    System.out.println(userChoseHamburgers);
                }
            }
        }
    }

    private static void chooseDeluxeBurger(int counterDeluxeBurger) {

        System.out.println("Sizning burgeringizda ");
//        DeluxeBurger deluxeBurger = new DeluxeBurger(8);
//        for (Products products : deluxeBurger.getProductsDeluxeBuger()) {
//            System.out.println(products);
//        }
        DeluxeBurger deluxeBurgerCount = new DeluxeBurger(counterDeluxeBurger);
        userChoseHamburgers.add(deluxeBurgerCount);
        System.out.println(userChoseHamburgers);
        System.out.println("mahsulotlari bor");
    }

    private static void choseHealthyBurger(Scanner scanner, KingBurgersDB db, int counterHealtyBurger) {
        System.out.println("Sizning burgeringizda ");
        for (int i = 0; i < GarnirType.values().length - 2; i++) {
            System.out.println((i + 1) + ")" + GarnirType.values()[i] + " | Narx : " + getCost(GarnirType.values()[i], db));
        }
        System.out.println("mahsulotlari bor");
        boolean isChooseGarnir = true;
        boolean isChooseAgaingGarnir = false;
        while (isChooseGarnir) {
            if (!isChooseAgaingGarnir) {
                System.out.println("Garnir qo'shasizmi?");
                System.out.println("1) Ha 2) Yoq");
            } else {
                System.out.println("Yana Garnir qo'shasizmi?");
                System.out.println("1) Ha 2) Yoq");
            }
            switch (scanner.nextInt()) {
                case 1 -> {
                    for (int i = 4; i < GarnirType.values().length; i++) {
                        System.out.println((i + 1) + ")" + GarnirType.values()[i] + " | Narx : " + getCost(GarnirType.values()[i], db));
                    }
                    int chooseGarnirUser = scanner.nextInt() - 1;
                    GarnirType chooseGarnirType = GarnirType.values()[chooseGarnirUser];
                    userChoseGarnirs.add(new Garnir(chooseGarnirType, 1));
                    isChooseAgaingGarnir = true;
                }
                case 2 -> {
                    isChooseGarnir = false;
                    isChooseAgaingGarnir = false;
                    HealthyBurger healthyBurger = new HealthyBurger(counterHealtyBurger);
                    healthyBurger.addGarnir(userChoseGarnirs);
                    userChoseHamburgers.add(healthyBurger);
                    userChoseGarnirs.clear();
                    System.out.println(userChoseHamburgers);
                }
            }
        }

    }


    private static void choseSimpleBurger(Scanner scanner, KingBurgersDB db, int counterHamburger) {
        boolean isChooseGarnir = true;
        boolean isChooseAgainGarnir = false;
        while (isChooseGarnir) {
            if (!isChooseAgainGarnir) {
                System.out.println("Garnir tanlaysizmi!");
                System.out.println("1) Ha 2) Yoq");
            } else {
                System.out.println("Garnir yana tanlaysizmi!");
                System.out.println("1) Ha 2) Yoq");
            }
            switch (scanner.nextInt()) {
                case 1 -> {
                    for (int i = 0; i < GarnirType.values().length; i++) {
                        System.out.println((i + 1) + ") " + GarnirType.values()[i] + " | Narx : " + getCost(GarnirType.values()[i], db));
                    }
                    int chooseGarnirUser = scanner.nextInt() - 1;
                    GarnirType choseGarnirType = GarnirType.values()[chooseGarnirUser];
                    userChoseGarnirs.add(new Garnir(choseGarnirType, 1));
                    isChooseAgainGarnir = true;
                }
                case 2 -> {
                    isChooseGarnir = false;
                    isChooseAgainGarnir = false;
                    Simple simpleHamburger = new Simple(counterHamburger);
                    simpleHamburger.addGarnir(userChoseGarnirs);
                    userChoseHamburgers.add(simpleHamburger);
                    userChoseGarnirs.clear();
                    System.out.println(userChoseHamburgers);
                }
            }
        }
    }

    private static int getCost(GarnirType garnirType, KingBurgersDB db) {
        for (int i = 0; i < db.getProducts().size(); i++) {
            BaseProduct baseProduct = db.getProducts().get(i);
            if (baseProduct.getGarnirType() != null) {
                if (baseProduct.getGarnirType().equals(garnirType)) {
                    return baseProduct.getPrice();
                }
            }
        }
        return 0;
    }
}