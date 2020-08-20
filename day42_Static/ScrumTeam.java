package day42_Static;

import day40_CustonClassReview.BankAccount;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
 */
public class ScrumTeam {
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM){
        this.PO =PO;
        this.BA=BA;
        this.SM=SM;
    }

    public void addTester(Tester tester){
        testers.add(tester); // add a tester to testers arrayList.
    }
        //we can change the name below "addTesters" to "addTester", same name, different parameters(overLoaded method)
    public void addTester(Tester[] testers){ //now this line local variable and instance variable shared same name: testers
       this.testers.addAll(Arrays.asList(testers) ); //Arrays.asList(): in order to add multiple testers into ArrayList
      //call instance variable by using this.
    }
    public void removeTester(long employeeID){ //007
        testers.removeIf(p->p.employeeID  ==  employeeID);
                //        each employeeID    argument given ID 007.
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        if (developers.length==0){ //to check if the array in empty(we can use this to above addTesters part
            return;
        }
        this.developers.addAll(Arrays.asList(developers) );
    }
    public void removeDeveloper(long employeeId){
        developers.removeIf(p->p.employeeID ==employeeId);
    }

    public String toString(){
        return testers.size() +" testers, "+developers.size()+" developers, PO:"+PO + ", BA:"+ BA +", SM:"+SM;
    }

}
