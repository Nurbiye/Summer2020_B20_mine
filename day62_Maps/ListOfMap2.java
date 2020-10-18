package day62_Maps;


import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {
    public static void main(String[] args) {
        List <Map<String, LocalDate>>  list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        System.out.println(list);

        String[] friends = {"Vildan","Maram","Sarah","Rebicca","Newal"};
        LocalDate[] DOBFriends = {LocalDate.of(1982,5,10),
                 LocalDate.of(1976,3,20),
                 LocalDate.of(1984,2,13),
                 LocalDate.of( 1983,6,28),
                 LocalDate.of(1969,8,3)};

         String[] classMates = {"Zeliha","Aliya","Kalbinur","Sevda","Naz"};
        LocalDate[] DOBClassMates = {LocalDate.of(1982,5,10),
                LocalDate.of(1976,3,20),
                LocalDate.of(1984,2,13),
                LocalDate.of( 1983,6,28),
                LocalDate.of(1969,8,3)};



         String[] family = {"Bayima", "Bahrulla","Muhammed","Ibrahim","Nurbiye"};
        LocalDate[] DOBFamily = {
                LocalDate.of(1982,6,1),
                LocalDate.of(1986,2,15),
                LocalDate.of(2015,6,19),
                LocalDate.of( 2017,2,20),
                LocalDate.of(1989,7,20) };






        for(int i = 0; i < friends.length; i++){
            list.get(0).put(friends[i], DOBFriends[i]);
        }

        for(int i = 0; i <classMates.length; i++){
            list.get(1).put(classMates[i], DOBClassMates[i]);
        }

        for(int i=0; i < family.length; i++){
            list.get(2).put(family[i], DOBFamily[i]);
        }

        System.out.println(list);




    }




}




