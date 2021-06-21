package cybertekschool.day52_Polymorphism_practice.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John Snow", 10000));
        accountList.add (new Account("Vald", 11000));
        accountList.add(new Account ("Svetlana", 13000));
        accountList.add(new Account("Muhammed", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add( new Account("Ata", 15000));

        System.out.println("Accountlist before: " + accountList);
        Collections.sort(accountList);
        System.out.println("Accountlist after: " + accountList);

        //TASK: Create another account with your name
        //transfer everyone's money to your account

        Account myAccount= new Account("my TD bank", 0);

        System.out.println("my Account Balan ce before"+myAccount);
        for (Account each : accountList){
            each.transferAll(myAccount);
        }

        System.out.println("my Account Balan ce after"+myAccount);

        System.out.println("EVeryone's balance afterwards"+accountList);

        //what can be the data type of a1
        /*
        *Account a1 ;
        * Comparable a1;
        * Transferable;
        * Object a1;
        *
        * An Object can be referred by
        *       it's own type
        *       it's super class type
        *       interface type that it implemented
        *
        */
        Account a1=new Account("Polymorphism", 1000);
        Transferable t1=new Account("Polymorphism", 1000);
        Comparable c1=new Account("Polymorphism", 1000);
        Object o1=new Account("Polymorphism", 1000);

    }
}
