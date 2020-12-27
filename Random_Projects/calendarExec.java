package Random_Projects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarExec {

    public static void main(String[] args) {
        timeForMilkAndCookies(new GregorianCalendar(2013, 11, 24));


    }

    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        return date.get(Calendar.MONDAY) == 11 && date.get(Calendar.DAY_OF_MONTH) == 24;
    }
}
