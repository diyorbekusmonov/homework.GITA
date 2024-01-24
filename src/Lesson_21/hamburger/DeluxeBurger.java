package Lesson_21.hamburger;

import Lesson_21.product.Products;
import Lesson_21.product_type.GarnirType;
import Lesson_21.product_type.ProductType;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger implements Hamburger {
    private int count;
    List<Products> productsDeluxeBuger = new ArrayList<>();

    public DeluxeBurger(int count) {
        this.count = count;
        productsDeluxeBuger.add(new Products(GarnirType.CHEESE, 1));
        productsDeluxeBuger.add(new Products(GarnirType.SALAD, 1));
        productsDeluxeBuger.add(new Products(ProductType.CHIPS, 1));
        productsDeluxeBuger.add(new Products(ProductType.DRINKS, 1));
    }

    public void showInfo() {
        System.out.println(productsDeluxeBuger);
    }

    public List<Products> getProductsDeluxeBuger() {
        return productsDeluxeBuger;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "count=" + count +
                ", productsDeluxeBuger=" + productsDeluxeBuger +
                '}';
    }
}
