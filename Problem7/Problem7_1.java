package Problem7;

public class Problem7_1 {
    public static void main(String[] args) {
        System.out.println();
        
        //account1 : Account
        System.out.println("------------------------");
        
        Account account1 = new Account(1,5000);
        account1.withdraw(2000);
        System.out.println(account1.toString());
        System.out.println("------------------------");

        //account2 : SavingAccount
        System.out.println("------------------------");
        SavingAccount account2 = new SavingAccount(2, 5000, 4.5);
        account2.withdraw(6000); 
        System.out.println(account2.toString());
        System.out.println("------------------------");

        //account3 : CheckingAccount
        System.out.println("------------------------");
        CheckingAccount account3 = new CheckingAccount(3, 5000, 5000);
        account3.withdraw(10000);
        System.out.println(account3.toString());
        System.out.println("------------------------");
    }
}