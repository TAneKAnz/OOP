package Problem7;

public class Faculty extends Employee {
    private String officeHours = "";
    private int rank = 0 ;


    
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String officeHours, int rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank ;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        if (rank > 0)
            this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\tFaculty{officeHours=%s, rank=%d}\n",
                getOfficeHours(), getRank());
    }
}