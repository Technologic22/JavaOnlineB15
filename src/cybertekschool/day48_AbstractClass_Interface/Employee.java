package cybertekschool.day48_AbstractClass_Interface;

public abstract class Employee {
    int id;
    String name;

    public Employee(){}
    //Why do we have constructor here? point?
    //we dont create object out of it?!!
    // - we reuse the logic in subclass!!

    public Employee(String name, int id){
        this.id=id;
        this.name=name;
    }
    public abstract void calculateAnnualSalary();

    //--this is optional, why we put this here?!
    //-- to enforce sub class to provide toString method
    public abstract String toString();
}
