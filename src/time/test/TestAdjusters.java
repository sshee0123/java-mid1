package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
        // 입력 받은 월의 첫날 요일과 마지막 요일 구하라
        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
