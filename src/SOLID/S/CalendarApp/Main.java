package SOLID.S.CalendarApp;

public class Main {
    public static void main(String[] args) {

        Today date = new Today();
        date.showDate();
        AddEvent addEvent =new AddEvent("Birthday");
        addEvent.newEvent();
    }
}
