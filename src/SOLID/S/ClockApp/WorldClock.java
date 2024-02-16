package SOLID.S.ClockApp;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class WorldClock {
    public void ShowClock(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("My Location: "+localDateTime.format(formatter));

    }
}
