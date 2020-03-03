package OptionTwoInterface;

public class Calculations implements IMethodsOne {

    //data types that have been encapsulated, kept private and
    //only used within methods when data has been
    //set or retrieved, hence setting them to private
    private double salary;
    private int age;
    private String Surename;

    //a Constructor to initiate objects
    public Calculations(double salary, double increase) {
        this.salary = salary;
        //this.increase = increase;
    }

    //a Constructor to initiate objects
    public Calculations() {

    }

    //getters to get methods
    public double getSalary() {
        return salary;
    }
    //setters to set data types with values
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public double MonthlyIncrease(double increaseAmount) {
        double sum = ((getSalary() /100)  * increaseAmount) + getSalary() ;
        return sum;
    }

    @Override
    public int AgeOfEmployer() {
        age = 200;
        return age;
    }

    @Override
    public String surname() {
        Surename = "Micheal";
        return Surename;
    }
}
