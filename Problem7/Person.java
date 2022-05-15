package Problem7;

public class Person {
    private String name ;
    private String address ;
    private String phoneNumber;
    private String emailAddress ;


    public Person(){
        this("","","","");
    }
    public Person(String name, String address,String phoneNumber,String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String toString() {
        return "Person{name="+this.name+", address="+this.address +", phoneNumber="+this.phoneNumber+", email="+this.emailAddress+"}";
    }
}
