package day34_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WarmUpTasks {
    public static void main(String[] args) {

        LocalDateTime t3 = LocalDateTime.of(2020,07,25,14,38);
        System.out.println(t3);

        //May/20/2019 DayName 4:30 pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019, 5, 20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(  LocalDateTime.now().format(DTFormat)  );



        //Sunday, 09:51 AM, Jul/26/2020
        DateTimeFormatter a= DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime time = LocalDateTime.of(2020,07,26,9,51);
        System.out.println(time.format(a));




    }
}
