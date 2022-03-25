package Problem7;

import java.util.Date;

public class Account {
    protected int id ;
    protected double balance ;
    protected static double annualInterestRate ;
    public Date dateCreated;

    public Account() {
        this(0,0);
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if(id >=0 )this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if(balance >=0)this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate()/100;
    }

    public void withdraw(double amount) {
        System.out.println("Account");
        System.out.println("Balance is: " + this.balance);
        System.out.println("Withdraw : " + amount);

        if(amount > this.balance) {
            System.out.println("Your balance is not enough");
        }
        else if (amount <= 0) System.out.println("Please enter a valid value.");
        else if(amount > 0) this.balance -= amount;
    }

    public void deposit(double amount) {
        System.out.println("Account");
        System.out.println("Balance is: " + this.balance);
        System.out.println("Deposit : " + amount);
        if(amount > 0)this.balance += amount;
        else if (amount < 0)System.out.println("Please enter a valid value.");
    }
    public String toString() {
        return  "Balance is " + balance +
                "\nThis account was created at "+ getDateCreated();
    }
}