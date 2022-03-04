public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("spotify", "taninwlol001@gmail.com");
        Account a3 = new Account("IG", "tantan", "Tan12345678");
        a2.setName("TAneKAnz");
        a3.setEmail("64010309@kmitl.ac.th");
        a3.setName("ttan_tanakarn");
        a3.display();
        Account.securityDetail();
        System.out.println(a3.securityCheck());
    }
}

class Account {
    private String app;
    private String user;
    private String password;
    private String email;
    private String name;
    private boolean alphabet;
    private boolean number;
    private static int length;
    private boolean capital;
    //constructor
    public Account() {

    }
    public Account(String app, String email) {
        this.app = app;
        this.email = email;
    }
    public Account(String app, String user, String password) {
        this.app = app;
        this.user = user;
        this.password = password;
    }
    //setter getter
    public String getApp() {
        return app;
    }
    public void setApp(String app) {
        this.app = app;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //behavior
    public String securityCheck() {
        if (password.length() >= length) {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 'A') {
                    alphabet = true;
                }
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    number = true;
                }
                if (password.charAt(i) <= 'Z') {
                    capital = true;
                }
                if (alphabet == true && number == true && capital == true) {
                    return "this password is safty";
                }
            }
        }
        return "this password is unsafty";
    }
    //static method
    public static void securityDetail() {
        System.out.println("----Password must have length >= 8, Capital letter, Alphabet and Number----");
    }
    //
    public void display() {
        System.out.print("App: " + app + "\nName: " + name + "\nUser: " + user + "\nPassword: " + password + "\nEmail: " + email +"\n");
    }
}