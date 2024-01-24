package Lesson_21.hamburger;

import Lesson_21.product.Garnir;
import Lesson_21.product_type.GarnirType;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger implements Hamburger {
    private int count;
    List<Garnir> healthyGarnirs = new ArrayList<>();

    public HealthyBurger(int count) {
        this.count = count;
        healthyGarnirs.add(new Garnir(GarnirType.SALAD, 1));
        healthyGarnirs.add(new Garnir(GarnirType.CARROT, 1));
        healthyGarnirs.add(new Garnir(GarnirType.CABBAGE, 1));
        healthyGarnirs.add(new Garnir(GarnirType.CUCUMBER, 1));
    }

    public boolean addGarnir(List<Garnir> iGarnir) {
        if (!iGarnir.isEmpty()) {
            //healthyGarnirs.clear();
            healthyGarnirs.addAll(iGarnir);
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "HealthyBurger{" +
                "count=" + count +
                ", healthyGarnirs=" + healthyGarnirs +
                '}';
    }
}
