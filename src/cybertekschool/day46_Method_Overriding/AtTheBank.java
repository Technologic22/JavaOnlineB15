package cybertekschool.day46_Method_Overriding;

public class AtTheBank {
    public static void main(String[] args) {
        CheckingAccount acc1=new CheckingAccount("Leyla", 1050417, 2000);
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(4500);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(1500);
        System.out.println("acc1 = " + acc1);

    }
}
