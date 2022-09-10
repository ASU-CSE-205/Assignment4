/* Assignment #: 4
 Name: Suvan Kumar
 StudentID: 1221910898
 Lecture: MWF 10:10 - 11am
 Description: Assignment 4 class displays a menu of choices to a user
 and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */


public class Department extends Manager {

        /*The default constructor should be provided to initialize the value of string attributes to "?" and Manager object to null.
public Department( )
This constructor accepts arguments for the department’s name, manager for the department,  department's division, and department's location.
public Department(String name, Manager manager, String division, String location)
The following accessor methods should be provided to get the attributes:
public String getName()
public Manager getManager()
public String getDivision()
public String getLocation()
The following modifier(mutator) methods should be provided to change the attributes:
public void setName(String someName)
public void setManager(String someFirstName, String someLastName, int someYearsExperience, String someManagingSince)
public void setDivision(String someDivision)
public void setLocation(String someLocation)
The following method must be defined:
public String toString()
 */

    String departmentName;
    Manager manager1;
    String departmentDiv;
    String loc;

    public Department() {
        departmentName = "?";
        manager1 = null;
        departmentDiv = "?";
        loc = "?";
    }

    public Department(String name, Manager manager, String division, String location) {
        departmentName = name;
        manager1 = manager;
        departmentDiv = division;
        loc = location;
    }

    public String getName() {
        return departmentName;
    }

    public Manager getManager() {
        return manager1;
    }

    public String getDivision() {
        return departmentDiv;
    }
    
    public String getLocation() {
        return loc;
    }

    public void setName(String someName) {
        departmentName = someName;
    }

    public void setManager(String someFirstName, String someLastName, int someYearsExperience, String someManagingSince) {
        managerFirst = someFirstName;
        managerLast = someLastName;
        numYears = someYearsExperience;
        managingTime = someManagingSince;

    }

    public void setDivision(String someDivision) {
        departmentDiv = someDivision;
    }

    public void setLocation(String someLocation) {
        loc = someLocation;
    }


    public String toString() {
        return "\nDepartment Name:\t" + departmentName + "\nDivision:\t" + departmentDiv + "\nLocation:\t" + loc + "\nManager Information:\t" + manager1;
    }

}
