public class Problem6_2 {
    public static void main(String[] args) {
    Course c1 = new Course("OOP", 3,3);
    c1.addStudent("Tan");
    c1.addStudent("Tom");
    c1.addStudent("Ten");
    c1.clear();
    c1.display();
    }
}

class Course {
    private String courseName;
    private int credit;
    private String[] students;
    private int numberOfStudents;
    private int indexOfStudent;
    //contructor
    public Course(){
        courseName = "None";
        credit = 0;
        indexOfStudent = 0;
    }
    public Course(String courseName, int credit,int numberOfStudents){
        this.courseName = courseName;
        this.credit = credit;
        this.numberOfStudents = numberOfStudents;
        students = new String[numberOfStudents];
    }
    public void addStudent(String students){
        this.students[indexOfStudent++] = students;
    }
    public void dropStudent(String students){
        for(int i = 0; i < students.length();i++){
            if(this.students[i] == students){
                this.students[i] = null;
            }
        }
    }
    public void clear(){
        for(int i = 0; i < numberOfStudents; i++){
            this.students[i] = null;
        }
    }
    public void display(){
        System.out.print("Course: " + courseName + ", credit: " + credit + "\nStudent in class: \n");
        for(int i = 0;i < students.length;i++){
            if(students[i] != null){
                System.out.println(" - " + students[i]);
            }else
                numberOfStudents--;
        }
        if(numberOfStudents == 0){
            System.out.println(" No student in class.");
        }
    }
}
   