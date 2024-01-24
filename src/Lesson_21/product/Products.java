package Lesson_21.product;

import Lesson_21.product_type.GarnirType;
import Lesson_21.product_type.ProductType;

public class Products extends BaseProduct{
    public Products(ProductType productType, int count) {
        super(productType, count);
    }

    public Products(GarnirType garnirType, int price, int count) {
        super(garnirType, price, count);
    }

    public Products(GarnirType garnirType, int count) {
        super(garnirType, count);
    }

    public Products(ProductType productType, int price, int count) {
        super(productType, price, count);
    }
}
