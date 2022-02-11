import java.util.Scanner;

// 1.Create a class Account with the following data members: balance, accountHolder. Create two objects with different states. Create a driver class BankAccounts with the main method to create the objects of the Account class.

// 2.Modify the class Account to provide a method called debit that withdraws money from an Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message indicating ―Debit amount exceeded account balance.
// Modify class BankAccounts to test method debit.

// 3.Modify the class Account to provide a method called credit that deposits money into an Account.
// 4.Modify class BankAccounts to test method credit.
 class Account {
    double balance;
    String accountHolder;
    Account(double balance,String accountHolder)
    {
        this.balance=balance;
        this.accountHolder=accountHolder;
    }
    //Task 2
    public void debit(double amt)
    {
        if(amt>this.balance)
        {
            System.out.println("Debit amount exceeded account balance");
        }else{
            this.balance-=amt;
            System.out.println(this.accountHolder+" left amount is "+this.balance);
        }
    }
    //Task4
    public void credit(double amt)
    {
        this.balance+=amt;
        System.out.println(this.accountHolder+" your total balance is "+this.balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Task1
        Account obj1=new Account(10000,"Kamini");
        Account obj2=new Account(23456,"Abc");
        // Account obj=new Account(); 
        //Task2->check debit functionality
        System.out.println("Enter amt to be debited");
        obj1.debit(sc.nextDouble());
        //Task3 ->credit 
        System.out.println("Enter amount to credit");
        obj2.credit(sc.nextDouble());
    }
}
