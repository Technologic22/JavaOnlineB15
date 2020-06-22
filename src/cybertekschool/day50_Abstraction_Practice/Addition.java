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

    @Override
    public String toString(){
        if (calculated==true){
            return num1+operator+num2+" = "+answer;
        }else {return num1+operator+num2+" = "; }
    }

}
