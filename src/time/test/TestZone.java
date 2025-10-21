package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestZone {
    public static void main(String[] args) {

        // 서울의 회의시간에서 런던, 뉴욕의 회의시간을 구하라
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간 : " + seoulTime);
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String availableZoneId : availableZoneIds) {
//            System.out.println("availableZoneId = " + availableZoneId);
//        }
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("런던의 회의 시간 : " + londonTime);
        System.out.println("뉴욕의 회의 시간 : " + newYorkTime);
    }
}
