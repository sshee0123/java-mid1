package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 :");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    // 캘린더 출력
    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 입력받은 월의 1일
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 입력받은 월의 다음 달

        // 월요일=1 ... 일요일=7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; // 처음 시작할 요일 구하기
        
        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i=0; i<offsetWeekDays; i++) {
            System.out.print("   ");
        }
        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 열 맞추기 위한 포맷팅
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) { // 토요일마다 한 줄
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
