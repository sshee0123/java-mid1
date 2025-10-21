package time.test;

import time.ChronoUnitMain;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        // 시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구하라
        // 남은 기간: 0년 10개월 20일
        // 디데이 : 325일 남음
        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);

        Period between = Period.between(startDate, endDate);
        long dDay = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("남은 기간 : " + between.getMonths()+"개월 " + between.getDays()+"일");
        System.out.println("디데이 : " + dDay + "일 남음");
    }
}
