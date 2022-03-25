package Problem7;

public class CheckingAccount extends Account{
    private double overdraftLimit ;

    public CheckingAccount(){
        super();
        this.overdraftLimit = 0 ;
    }
    public CheckingAccount(int id, double balance ,double overdraftLimit){
        
        super(id,balance);
        this.overdraftLimit = overdraftLimit;

        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Balance is: " + balance);
    }


    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }
    

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw : " + amount);
        if(amount <= 0) {
            System.out.println("Please enter a valid value.");
        }

        else if (amount <= (this.balance + overdraftLimit)) {
            this.balance -= amount;
        }
        else System.out.println("Your balance is not enough");
    }


    @Override
    public String toString() { 
        return  "balace is " + this.balance
                + "\nThis Checking account was created at "+ getDateCreated();
    }
    
}