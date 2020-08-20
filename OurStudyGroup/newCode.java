package OurStudyGroup;

import java.util.Set;
import java.util.TreeSet;

public class newCode {
    public static void main(String[] args) {
        //get a number from 1 to 11 (inclusive)
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 500000000; i++) {
            int num = (int) (Math.random()*11 + 1);
//            System.out.println(num);
            set.add(num);
            if(set.size() == 6) {
                break;
            }
        }
        System.out.println(set);
    }
}
