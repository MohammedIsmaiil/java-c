package chapter9;

public class Employee extends Person {
    private int employeeID;
    private String title;

    public Employee(){
        super("angie");
        System.out.println("In Employee default constructor");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
