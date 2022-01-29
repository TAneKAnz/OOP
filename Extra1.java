import java.util.*;
public class Extra1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 3;
        int sequence = 2;
        int n = 0;
        System.out.print(number1 + ", ");
        System.out.print(number2 + ", ");
        while (n < 10) {
            number1 += sequence;
            sequence += 2;
            System.out.print(number1 + ", ");
            number2 += 3;
            System.out.print(number2 + ", ");
            //n++;
        }
    }
}