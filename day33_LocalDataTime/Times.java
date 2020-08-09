package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        LocalTime t1= LocalTime.of(15,46,55,32948); //we less use nanoOfSeconds
        System.out.println(t1);  // 0~23,      0~59        0~59  (hour, minute, second's range0

        // LocalTime.now();   //print us current time
        LocalTime t2 = LocalTime.now(); //it also prints nanOfSecond
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.of(2020,07,25,14,38);
        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);

    }
}
