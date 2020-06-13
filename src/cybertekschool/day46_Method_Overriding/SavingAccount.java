package cybertekschool.day46_Method_Overriding;

import javax.swing.JButton;

public class SavingAccount extends BankAccount{

    double interestRate;

    /**
     * A constructor to set all the fields value
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */
    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
    super(accountHolder, accountNum, balance);
    this.interestRate=interestRate;
    }

    public static void main(String[] args) {
        //Bad idea to have main here...
        SavingAccount s1=new SavingAccount("Muhamed", 1287687, 4000,3.5);
        System.out.println("s1 = " + s1.toString());
        s1.withdraw(1000);
        System.out.println("s1 = " + s1);
    }

        // in our Savingaccount, if we withdraw
        //U get $30 penaltry
        //so we oerride this withdraw method to reflect this requirement
    @Override
    public void withdraw (int amount){
        //balance-=amount ;
        //taking away 30 ovver what U withdraw
        //balance=balance-amount-30;
        balance-=amount;
        balance-=30;
    }


    @Override //ITS OPTIONAL annotation, ONCE BEING USED, IT WILLNEFORCE overriding rule
              //if any rule doent match it will not even compile
              //so its alkways good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
