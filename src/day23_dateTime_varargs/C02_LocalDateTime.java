package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        //2022-12-20T10:30:46.016906700
        LocalDateTime ldtTr=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldtTr);
        //2022-12-20T12:30:46.019900100
        System.out.println(ldt.getDayOfWeek());
        //2022-12-20T10:30:46.016906700
        System.out.println(ldt.withYear(2030));
        //2030-12-20T10:33:22.149299100

    }
}
