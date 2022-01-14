public class Problem1_1 {
    public static void main(String[] args) {
        int sec = 365*5*24*60*60;
        int number = ((sec/7)-(sec/13)+(sec/45)) + 312032486;
        System.out.println(number);
    }
}