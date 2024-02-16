package SOLID.O.Phones;

public class Main {
    public static void main(String[] args) {
        PhoneSale sale=new PhoneSale();
        System.out.println(sale.cost(new Apple()));
    }
}
