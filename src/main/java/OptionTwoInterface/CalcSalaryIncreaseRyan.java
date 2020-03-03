package OptionTwoInterface;

public class CalcSalaryIncreaseRyan extends Calculations implements IMethodsOne {

    private String name;
    private String surname;
    private int age;

    public double getIncrease1() {
        return increase1;
    }

    public void setIncrease1(double increase1) {
        this.increase1 = increase1;
    }

    private double increase1;


    public CalcSalaryIncreaseRyan(String name, double increase1) {
        this.name = name;
        this.increase1 = increase1;
    }

    public CalcSalaryIncreaseRyan(double salary, int increase, String name, double increase1) {
        super(salary,increase);
        this.name = name;
        this.increase1 = increase1;
    }

    public CalcSalaryIncreaseRyan() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    //polymorphism, taking a methods and changing the content inside
    //but using the same name for the method with the same parameter

    @Override
    public double MonthlyIncrease(double increaseAmount){
        double sum = ((super.getSalary() /100)  * increaseAmount) + super.getSalary() ;
        return sum;
    }

    @Override
    public int AgeOfEmployer() {
        age = 11;
        return age;
    }

    @Override
    public String surname() {
        surname = "Jack";
        return surname;
    }
}
