package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
        Account_Tim aimarAccount = new Account_Tim();
        aimarAccount.withdrawal(100);
        aimarAccount.deposit(1000);
        aimarAccount.withdrawal(500);

        aimarAccount.setAccountNr("1");
        aimarAccount.setBalance(100.55);
        aimarAccount.setCustumerName("Aimar Shaw ");
        aimarAccount.setEmail("******@hotmail.com");
        aimarAccount.setPhoneNr("555555");
        aimarAccount.getBalance();

        //after making a constructor in "Account_Tim" class.
        Account_Tim LysAccaunt = new Account_Tim("2",10_000,"Ly Shaw","*****@hot.ee","55500000");
        System.out.println(LysAccaunt.getAccountNr());

        Account_Tim TESTAccount = new Account_Tim("Test","test@test.com","000");
        System.out.println(TESTAccount.getPhoneNr());

        aimarAccount.withdrawal(100.55);
        aimarAccount.deposit(100);
        aimarAccount.getBalance();

        //Challange
        VipCustomer aimar = new VipCustomer();
        System.out.println(aimar.getName());
        VipCustomer person2 = new VipCustomer("bob",0);
        System.out.println(person2.getEmailAddress());
        VipCustomer person3 = new VipCustomer("Root",1_000_000,"acsess@hot.com");
        System.out.println(person3.getEmailAddress());
    }
}
