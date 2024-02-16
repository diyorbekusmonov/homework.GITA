package SOLID.S.ClockApp;

public class Main {
    public static void main(String[] args) {
        WorldClock clock = new WorldClock();
        clock.ShowClock();
        Alarms alarm = new Alarms();
        alarm.addAlarm();
        Timers timer = new Timers();
        timer.setTimer();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
    }
}
