package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        // 2024년 1월 1일부터 2주 간격으로 5번 반복하여 날짜 출력
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i=0; i<5; i++) {
            LocalDate plusDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
//            startDate.plusWeeks(i*2)
            System.out.println("날짜 " + (i+1) +": "+ plusDate);
        }
    }
}
