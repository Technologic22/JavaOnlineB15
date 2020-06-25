package cybertekschool.day50_Abstraction_Practice;

public abstract class Question {
    protected int num1;
    protected int num2;
    protected String operator;
    protected int answer;
    protected boolean calculated;
    protected String questionType="Unknown"; //--setting default value to 'default' to avoid null

    public Question(String questionType, String operator){
        this.questionType=questionType;
        this.operator=operator;
    }

    public abstract void calculate();

    @Override
    public String toString() {
        return "The Question Type is " + questionType+ " question : ";
    }
}
