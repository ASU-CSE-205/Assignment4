/* Assignment #: 4
 Name: Suvan Kumar
 StudentID: 1221910898
 Lecture: MWF 10:10 - 11am
 Description: Assignment 4 class displays a menu of choices to a user
 and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */



public class Manager extends Assignment4{
    String managerFirst;
    String managerLast;
    int numYears;
    String managingTime;
    
    public Manager() {
        managerFirst = "?";
        managerLast = "?";
        numYears = 0;
        managingTime = "?";
    }

    public Manager(String firstName, String lastName, int yearsExperience, String managingSince) {
        managerFirst = firstName;
        managerLast = lastName;
        numYears = yearsExperience;
        managingTime = managingSince;
    }
    
    
    public String getFirstName() {
        return managerFirst;
    }

    public String getLastName() {
        return managerLast;
    }

    public int getYearsExperience(){
        return numYears;
    }
    
    public String getManagingSince(){
        return managingTime;
    }

    public void setFirstName(String someFirstName) {
        managerFirst = someFirstName;
    }
    public void setLastName(String someLastName) {
        managerLast = someLastName;
    }
    public void setYearsExperience(int someYears) {
        numYears = someYears;
    }
    public void setManagingSince(String someDate) {
        managingTime = someDate;
    }

    public String toString() {
        return "\nLast Name:\t" + managerLast + "\nFirstName:\t" + managerFirst + "\nYears of Experience:\t" + numYears + "\nManaging Since:\t" + managingTime;
    }


}
