import java.util.*;
public class Problem1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if ((a*d) - (b*c) == 0){
            System.out.println("Error");
        }
        else{
            System.out.println("x = " + (e*d - b*f)/(a*d - b*c));
            System.out.println("y = " + (a*f - e*c)/(a*d - b*c));
        }
    }
}