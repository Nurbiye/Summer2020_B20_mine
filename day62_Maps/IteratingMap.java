package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class IteratingMap {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>() ;
        map.put("Nurbiye", LocalDate.of(1989,7,20));
        map.put("John", LocalDate.of(1988,3,12));
        map.put("Daniel", LocalDate.of(1989,2,20));
        map.put("Eric", LocalDate.of(1958,3,3));
        map.put("Caleb", LocalDate.of(1983,10,7));
        map.put("James", LocalDate.of(1979,9,29));

        System.out.println(map);
        for (String each : map.keySet()) {
            System.out.println(each);
        } //we can not get second or other names by index, since Set does not have index, so we can turn it to list

        List<String> names = new ArrayList<>(map.keySet()) ;
        System.out.println(names);
        System.out.println(names.get(1));

        System.out.println("=============================");
        for (LocalDate each : map.values()) {
            System.out.println(each);
        }

        System.out.println("============================");
        List<LocalDate> DOB = new ArrayList<>(map.values() );
        //  DOB.addAll(map.values());    -->i can add this line in above ArrayList()
        System.out.println(DOB.get(1));

        System.out.println("============================");

        for (Map.Entry<String, LocalDate> each : map.entrySet()) {   // --> I can assign them first as well
            System.out.println(each.getValue() + " : " + each.getKey() );
        }

    }
}
