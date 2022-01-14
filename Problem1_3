import java.util.*;
public class Problem1_3 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num < 1 || num > 999){
            System.out.print("Enter a number between 0 and 1000: ");
            num = input.nextInt();
        }
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}