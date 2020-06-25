package cybertekschool.day50_Abstraction_Practice;

public class Subtraction extends Question{


    public Subtraction(int num1, int num2) {
        super("Subtraction ", "-");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {

        int tempNum;
        if (num1<num2){
            tempNum=num1;
            num1=num2;
            num2=tempNum;
        }

        //--After making sure num1 is more than num2,then we set the field value
        this.num1=num1;
        this.num2=num2;
        answer=num1-num2;
        calculated=true;
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
