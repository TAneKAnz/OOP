import java.util.*;
public class Problem3_2 {
    static Scanner input = new Scanner(System.in);

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergeList = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, mergeList, 0, list1.length);
        System.arraycopy(list2, 0, mergeList, list1.length, list2.length);
        Arrays.sort(mergeList);
        return mergeList;
    }
    
    public static void main(String[] args) {
        String t = "";
        System.out.print("Enter list1 : ");
        t = input.nextLine();
        String[] temp = t.split(" ");
        int[] list1 = new int[temp.length];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = Integer.parseInt(temp[i]);
        }

        System.out.print("Enter list2 : ");
        t = input.nextLine();
        temp = t.split(" ");
        int[] list2 = new int[temp.length];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = Integer.parseInt(temp[i]);
        }

        System.out.print("The merged list is ");
        for (int i : merge(list1, list2)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}