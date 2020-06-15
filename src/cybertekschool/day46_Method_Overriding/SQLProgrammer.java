package cybertekschool.day46_Method_Overriding;

public class SQLProgrammer extends Programmer{

    //access modifier in subclass
    //can have same visibility or more visibility

    @Override
    protected void code() {
        System.out.println("writing SQL Query!");
    }

    //@Override
    public void test() {
        System.out.println("Testing SQL Query!");
    }

    public void writeSQLQuery(){
        System.out.println("Writing SQL Query!");
    }
}
