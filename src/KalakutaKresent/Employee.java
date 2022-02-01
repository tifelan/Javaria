package KalakutaKresent;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    public Employee(String firstName, String lastName,
                    double salary, String department)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
    // set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    // get firstName
    public String getFirstName()
    {
        return firstName;
    }
    // set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    // get lastName
    public String getLastName()
    {
        return lastName;
    }
    // set salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    // get salary
    public double getSalary()
    {
        return salary;
    }
    // set department
    public void setDepartment(String department)
    {
        this.department = department;
    }
    // get department
    public String getDepartment()
    {
        return department;
    }
}

