import java.util.*;
public class S1Q1_64010309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of matrix : ");
        int size = input.nextInt();
        while (size < 4) {
            System.out.print("Input size of matrix : ");
            size = input.nextInt();
        }
        System.out.println("Random matrix is : ");
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Please input value of Row and Column : ");
        int[] pos = new int[2];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = input.nextInt();
            //System.out.print(pos[i] + " ");
        }
        System.out.println("The selected member is " + matrix[pos[0]][pos[1]]);

        //check_top(matrix, pos);
        System.out.println();
        //check_right(matrix, pos);
        System.out.println();
        check_bottom(matrix, pos);
        System.out.println();
        check_left(matrix, pos);
        System.out.println();
    }

    static void check_top(int[][] m, int[] p) {
        System.out.print("Member on the top : ");
        if (p[0]-1 < 0) {
            System.out.println("NO");
        }
        else {
            for (int i = p[0]-1; i >= 0; i--) {
                System.out.print(m[i][p[1]] + ",");
            }
        }
    }

    static void check_right(int[][] m, int[] p) {
        System.out.print("Member on the Right Hand side : ");
        if (p[1]+1 >= m.length) {
            System.out.println("NO");
        }
        else {
            for (int i = p[1]; i <= m.length; i++) {
                System.out.print(m[p[0]][i] + ",");
            }
        }
    }

    static void check_bottom(int[][] m, int[] p) {
        System.out.print("Member on the Bottom : ");
        if (p[0]+1 >= m.length) {
            System.out.println("NO");
        }
        else {
            for (int i = p[0]+1; i < m.length; i++) {
                System.out.print(m[i][p[1]] + ",");
            }
        }
    }

    static void check_left(int[][] m, int[] p) {
        System.out.print("Member on the Left Hand side : ");
        if (p[1]-1 < 0) {
            System.out.println("NO");
        }
        else {
            for (int i = p[1]-1; i >= 0; i--) {
                System.out.print(m[p[0]][i] + ",");
            }
        }
    }
}