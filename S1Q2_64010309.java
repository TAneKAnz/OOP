import java.util.*;
public class S1Q2_64010309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] cha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int nNum = 0, nCha = 0;
        int rand;
        System.out.print("Random characters are : ");
        while (nNum < 5 && nCha < 5) {
            rand = (int)(Math.random()*10);
            if (cha[rand] != ',' && nNum == nCha) {
                System.out.print(cha[rand] + " ");
                cha[rand] = ',';
                nCha++;
            }
            rand = (int)(Math.random()*10);
            if (num[rand] != ',' && nNum < nCha) {
                System.out.print(num[rand] + " ");
                num[rand] = ',';
                nNum++;
            }
        }
        System.out.println();
        System.out.print("Select group of characters [1] character or [2] numeric : ");
        int select = input.nextInt();
        if (select == 1) {
            System.out.print("Characters not in the list are : ");
        }
        else if (select == 2) {
            System.out.print("Numerics not in the list are : ");
        }
        for (int i = 0; i < 10; i++) {
            if (cha[i] != ',' && select == 1) {
                System.out.print(cha[i] + " ");
            }
            if (num[i] != ',' && select == 2) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.println("End of program");
    }
}