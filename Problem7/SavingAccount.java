package Problem7;

public class SavingAccount extends Account{
    public SavingAccount(){
        super();
    }
    public SavingAccount(int id, double balance , double annualInterestRate){
        super(id, balance , annualInterestRate);
        System.out.println("Saving Account");
        System.out.println("Balance is: " + balance);
    }



    public void withdraw(double amount) {
        System.out.println("Withdraw : " + amount);
        if (amount <= this.balance) {
            this.balance -= amount;

        } else {
            System.out.println("\"Error, you can't be overdrawn.\"");

        }
    }
    public void deposit(double amount) {
        
        System.out.println("Deposit : " + amount);
        if(amount > 0)this.balance += amount;
        else if (amount < 0)System.out.println("Please enter a valid value.");
    }
    

    
    @Override
    public String toString(){
        return  "deposit interest : " + getMonthlyInterest() 
                + "\nbalace is " + (balance + getMonthlyInterest())
                + "\nThis Saving account was created at "+getDateCreated();
    }
}