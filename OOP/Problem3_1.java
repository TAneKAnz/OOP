import java.util.*;
public class Problem3_1 {
    static boolean prime(int x) {
        if (x == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean palindrom(int x) {
        int a = x;
        int b = 0;
        while (x != 0) {
            b *= 10;
            b += x % 10;
            x /= 10;
        }
        return a == b;
    }
    public static void main(String[] args) {
        for (int i = 2, n = 0; n < 100; i++) {
            if (prime(i) && palindrom(i)) {
                n++;
                System.out.print(i);
                System.out.print(" ");
                if (n % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}