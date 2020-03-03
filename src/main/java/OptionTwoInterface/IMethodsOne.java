package OptionTwoInterface;



public interface IMethodsOne {

    // when creating an interface, the class you implement the interface, has to take on all the methods as
    // @Override, into that class
    // you can implement more than one interface, as interfaces data is kept related to each other per interface
    // ONLY specify the method name and parameter used.
    //always use the same parameter and method name when implementing the interface

    double MonthlyIncrease(double increaseAmount);

    int AgeOfEmployer();

    String surname();

}
