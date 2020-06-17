package cybertekschool.day48_AbstractClass_Interface;

//--Concrete class is responsible for providing body(Implementation)
//--for abstract methods from superr class
public class FullTimeEmployee extends Employee{

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Fulltime Annual Salary =  " + (monthlySalary*12));
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
