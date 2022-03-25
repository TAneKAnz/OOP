package Problem8;

public class Student extends Person {
    private String STATUS[] = { "Freshman", "Sophomore", "Junior", "Senior" };
    private int status = 0;

    public Student() {
        this.status = 0;

    }

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;

    }

    public void setStatus(int newStatus) {
        status = newStatus;

    }

    public String getStatus() {
        return STATUS[status];

    }

    public String toString() {
        return super.toString() + String.format("\n\tStudent{status=%s}\n", this.getStatus());

    }
}

