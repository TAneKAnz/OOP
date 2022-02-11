import java.util.*;
public class Problem4_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arrayRand = new double[1000];
        StopWatch s = new StopWatch();
        Test t = new Test();
        System.out.println("Creating a list containing 1000 elements,");
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            arrayRand[i] = rand.nextInt(100000)/100.00;
            System.out.printf("%.2f       ", arrayRand[i]);
            count++;
            if (count % 5 == 0) {System.out.println();}
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        s.start();
        Arrays.sort(arrayRand);
        s.stop();
        count = 0;
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%.2f       ", arrayRand[i]);
            count++;
            if (count % 5 == 0) {System.out.println();}
        }
        System.out.println("Sorting stopwatch stoped.");
        System.out.print("The sort time is " + s.getElapsedTime() + " milliseconds.\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        s.start();
        for (long i = 2, n = 0; n < 1000; i++) {
            if (t.prime(i) && t.palindrom(i)) {
                n++;
                System.out.print(i);
                System.out.print(" ");
                if (n % 10 == 0) {
                    System.out.println();
                }
            }
        }
        s.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.print("The palindromPrime time is " + s.getElapsedTime() + " milliseconds.");
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    void start() {
        startTime = System.currentTimeMillis();
    }
    void stop() {
        endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return endTime - startTime;
    }
}

class Test {
    boolean prime(long x) {
        if (x == 2) {
            return true;
        }
        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    boolean palindrom(long x) {
        long a = x;
        long b = 0;
        while (x != 0) {
            b *= 10;
            b += x % 10;
            x /= 10;
        }
        return a == b;
    }
}