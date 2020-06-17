package cybertekschool.day48_AbstractClass_Interface;

public class HourlyEmployee extends Employee{

    double hourlyWage;
    int numsOfHours;

    public HourlyEmployee(String name, int id, double hourlyWage, int numsOfHours) {
        super(name, id);
        this.hourlyWage=hourlyWage;
        this.numsOfHours=numsOfHours;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("Hourly Employee annual income: "+(hourlyWage * numsOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", yearly salary= "+(hourlyWage*numsOfHours)
                +'}';
    }
}
