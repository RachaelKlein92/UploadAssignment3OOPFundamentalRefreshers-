package OptionTwoInterface;

public class Main {

    public static void main (String args[]) {
        //only creating one object, as the subclass CalcSalaryIncreaseRyan inherits from
        //super class Calculations
        CalcSalaryIncreaseRyan salary = new CalcSalaryIncreaseRyan();


        // subclass already inherits methods from super class
        // when creating/initiating an object in main from the subclass, use same object created to call
        // methods from superclass
        salary.setSalary(100);

        salary.setName("Ryan");
        System.out.println("The salary for " + salary.getName() + " is " + salary.MonthlyIncrease(20));


    }

}
