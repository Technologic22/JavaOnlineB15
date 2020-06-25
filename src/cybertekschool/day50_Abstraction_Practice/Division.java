package cybertekschool.day50_Abstraction_Practice;

public class Division extends Question{

    public Division(int num1, int num2) {
        super("Division ", "/");
        this.num1=num1;
        this.num2=num2;

        int tempNum;
        if (num1<num2){
            tempNum=num1;
            this.num1=num2;
            this.num2=tempNum;
        }
    }

    @Override
    public void calculate() {

        if (num2==0){
            answer=0;
        }else {
            answer=num1/num2;
        }

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
