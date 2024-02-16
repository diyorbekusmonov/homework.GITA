package SOLID.S.CalendarApp;

public class AddEvent {
    String message;

    public AddEvent(String message) {
        this.message = message;
    }

    public void newEvent() {
        System.out.println("added " + message);
    }
}
