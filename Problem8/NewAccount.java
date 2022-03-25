import java.util.ArrayList;

public class NewAccount {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate = 1.5;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public NewAccount(int id, double balance) {
        this.name = "";
        this.id = id;
        this.balance = balance;

    }


    public NewAccount(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public void withdraw(double amount) {
       
        if (amount > this.balance) {
            System.out.println("\n***Your balance is not enough***\n");
            this.balance -= 0.0;
            transactions.add(new Transaction('W', this.balance, ""));
            
        }
        else if (amount < 0) {
            System.out.println("\n***Please enter a valid value.***\n");
            this.balance -= 0.0;
            transactions.add(new Transaction('W', this.balance, ""));
        }
        else if (amount > 0){
            this.balance -= amount;
            transactions.add(new Transaction('W', amount, this.balance, ""));
            
        }

    }

    public void deposit(double amount) {
        if(amount >= 0){
            this.balance += amount;
            transactions.add(new Transaction('D', amount, this.balance, ""));
        }

        else if (amount < 0){
            System.out.println("\n***Please enter a valid value.***\n");
            this.balance += 0.0;
            transactions.add(new Transaction('D', this.balance, ""));
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        
        annualInterestRate = (newAnnualInterestRate >= 0 && newAnnualInterestRate <= 100)?newAnnualInterestRate:1.5;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }




    public void showPersonal() {
        System.out.println("Name: " + name);
        System.out.println("Account ID: " + id);
        System.out.println("Annual interest rate: " + annualInterestRate);
        System.out.println("Balance: " + transactions.get(transactions.size() - 1).getBalance());

    }

    public void showAllAction() {
        System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");

        for (int i = 0; i < transactions.size(); i++) {
            Transaction temp = transactions.get(i);
            System.out.println(temp.getDateCreated() + "\t\t" + temp.getType() + "\t\t" + temp.getAmount() + "\t\t"
                    + temp.getBalance());

        }
    }
}