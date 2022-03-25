package Problem8;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date dateCreated;

    public Transaction(char type, double balance, String description) {
        dateCreated = new Date();
        this.type = type;
        this.amount = 0.0;
        this.balance = balance;
        this.description = description;
    }



    public Transaction(char type, double amount, double balance, String description) {
        dateCreated = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

   

    public Date getDateCreated() {
        return this.dateCreated;

    }
    
    
    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}