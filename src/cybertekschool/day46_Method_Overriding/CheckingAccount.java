package cybertekschool.day46_Method_Overriding;

public class CheckingAccount extends BankAccount{

    //no additional field in checking account

    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance);
    }

    //this bank account will give U $200 if U deposit over $3000
    @Override
    public void deposit(int amount){
        if (amount>=3000){
            super.deposit(amount+200);
        }else{super.deposit(amount);}
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
