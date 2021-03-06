package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
 */
public class Developer extends Employee {

    public Developer(String name, int age, char gender, double salary, int ID, String jobTitle) {
        setInfo(name, age, gender, salary, ID, jobTitle);
    }
    public void coding(){
        System.out.println(name + "  is developing code while hitting his head to the wall");
    }
    public void fixBug(){
        System.out.println(name + " is fixing a bug while cursing the Tester ");
    }
    //we didn't set toString method , since parent class already has that method.



}
