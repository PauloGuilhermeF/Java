package JavaCore.Tdatas.Test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTeste {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Domingo e o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.roll(Calendar.HOUR, 24);
        //c.roll(Calendar.MARCH, 9);
        Date date1 = c.getTime();
        System.out.println(date1);

        //NumberFormat, locale, Calendar, Date, DateFormat

    }
}
