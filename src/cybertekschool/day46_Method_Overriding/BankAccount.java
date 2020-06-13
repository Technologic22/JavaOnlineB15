package cybertekschool.day46_Method_Overriding;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    //always add no arg constructor to your superclass
    //to avopid error in subclass 'cuz of super keyword
    public BankAccount(){}

    public BankAccount(String accountHolder, long accountNum, double balance){
        //super(); - first statemnt in any constructot
        this.accountHolder=accountHolder;
        this.accountNum=accountNum;
        this.balance=balance;
    }

    public void deposit(int amount){
        balance +=amount;    // balance= this.balance+amount;
    }

    public void withdraw (int amount){
        balance-=amount ;
    }
}
