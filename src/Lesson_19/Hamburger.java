package Lesson_19;

import java.util.*;

public class Hamburger {
    private String rulonType;
    private int meat;
    private double cost;

    public Hamburger(String rulonType, int meat, double cost) {
        this.rulonType = rulonType;
        this.meat = meat;
        this.cost = cost;
    }

    public String getRulonType() {
        return rulonType;
    }

    public int getMeat() {
        return meat;
    }

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.add(2);
        Queue<Integer> queue = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();
    }

    public double getCost() {
        return cost;
    }
}
