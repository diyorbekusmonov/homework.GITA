package Lesson_21.hamburger;

import Lesson_21.product_type.GarnirType;
import Lesson_21.product.Garnir;

import java.util.ArrayList;
import java.util.List;

public class Simple implements Hamburger {

    private int count;
    private List<Garnir> garnirs = new ArrayList<>();

    public Simple(int count) {
        this.count = count;
        garnirs.add(new Garnir(GarnirType.SALAD, 1));
    }

    public boolean addGarnir(List<Garnir> iGarnirs) {
        if (!iGarnirs.isEmpty()) {
            garnirs.clear();
            garnirs.addAll(iGarnirs);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "count=" + count +
                ", garnirs=" + garnirs +
                '}';
    }
}
