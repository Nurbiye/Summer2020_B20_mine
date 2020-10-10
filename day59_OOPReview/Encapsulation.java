package day59_OOPReview;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Encapsulation {
    private int ssn;

    private final LocalDate Published = LocalDate.of(2020,9,8);

    public int getSsn(){
        return ssn;
    }
    public void setSsn(int ssn){
        this.ssn =ssn;
    }

    public LocalDate getPublished(){
        return Published;
    }
   // public void setPublished(LocalDate Published){  this.Published = Published; }    //we can not use

}
