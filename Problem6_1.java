import java.util.Scanner;
public class Problem6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMI b1 = new BMI();
        System.out.print("Enter name and age: ");
        b1.setName(input.next());
        b1.setAge(input.nextInt());
        System.out.print("Weight (input format: 1=kg 2=pound value): ");
        switch(input.nextInt()) {
            case 1: b1.setWeight(input.nextDouble());
                    break;
            case 2: b1.setWeight(input.nextDouble() * 0.45359237);
                    break;
            default:break;
        }
        System.out.print("Height (input format: 1=meter 2=feet-inch): ");
        b1.sethFormat(input.nextInt());
        switch(b1.gethFormat()) {
            case 1: b1.setMeters(input.nextDouble());
                    break;
            case 2: b1.setFeet(input.nextDouble());
                    b1.setInches(input.nextDouble());
                    break;
            default:break;
        }
        input.close();
        System.out.printf("Your BMI: %.2f",b1.getBMI());
        System.out.println("\n" + b1.toString());
    }
}

class BMI {
    private String name;
    private int age;
    private double weight;
    private int hFormat;
    private double meters;
    private double feet;
    private double inches;
    private double bmi;
    //constructor
    public BMI() {
    }
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }
    public BMI(String name, int age, double weight, double meters) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.meters = meters;
    }
    //setter and getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int gethFormat() {
        return hFormat;
    }
    public void sethFormat(int hFormat) {
        this.hFormat = hFormat;
    }
    public double getMeters() {
        return meters;
    }
    public void setMeters(double meters) {
        this.meters = meters;
    }
    public double getFeet() {
        return feet;
    }
    public void setFeet(double feet) {
        this.feet = feet;
    }
    public double getInches() {
        return inches;
    }
    public void setInches(double inches) {
        this.inches = inches;
    }
    
    public double getBMI() {
        if (hFormat == 1) {
            bmi = weight/(meters*meters);
            return bmi;
        }
        else if (hFormat == 2) {
            meters = ((feet * 12) + inches) * 0.0254;
            return bmi;
        }
        else {
            return 0;
        }
    }
    public String toString() {
        if(bmi >= 30.0){
            return "Interpretation: Obese";
        }else if(bmi >= 25){
            return "Interpretation: Overweight";
        }else if(bmi >= 18.5){
            return "Interpretation: Normal weight";
        }else if(bmi < 18.5 && bmi > 0){
            return "Interpretation: Underweight";
        }else if(bmi < 0){
            return "Error: This result is impossible! Have something wrong on your input.\n- don't Enter negative number\n- don't Enter Zero";
        }else
            return "Error";
        
    }
}
