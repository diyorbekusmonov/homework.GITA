package SOLID.S.CalendarApp;

import java.text.DateFormat;

public class Today {
    java.util.Date d = new java.util.Date();
    String s= DateFormat.getDateInstance().format(d);
     void showDate(){
        System.out.println(s);
    }
}
