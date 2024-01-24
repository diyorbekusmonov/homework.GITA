package Lesson_21.product;

import Lesson_21.product_type.ProductType;

public class Meet extends BaseProduct {
    public Meet(ProductType productType, int price, int count) {
        super(productType, price, count);
    }

    public Meet(ProductType productType, int count) {
        super(productType, count);
    }
}
