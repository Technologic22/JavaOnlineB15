package cybertekschool.day50_Abstraction_Practice;

public class Addition extends Question {


    public Addition(int num1, int num2) {
        super("Addition opp", "+");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {

        answer=num1+num2;
        calculated=true;  //-- if U moved till this point, it means u have calculated
    }

    //--!! How do I call the toString method of Super class?!!
    //-- super.toString();
    @Override
    public String toString(){
        super.toString();
        if (calculated==true){
            return super.toString()+num1+operator+num2+" = "+answer;
        }else {return  super.toString()+num1+operator+num2+" = "; }
    }

}
