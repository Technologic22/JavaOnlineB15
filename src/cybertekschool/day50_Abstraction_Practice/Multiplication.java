package cybertekschool.day50_Abstraction_Practice;

public class Multiplication extends Question {

    public Multiplication(int num1, int num2) {
        super("Multiplication ", "*");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {
        answer=num1*num2;
        calculated=true;
    }

    @Override
    public String toString(){
        super.toString();
        if (calculated==true){
            return super.toString()+num1+operator+num2+" = "+answer;
        }else {return  super.toString()+num1+operator+num2+" = "; }
    }

}
