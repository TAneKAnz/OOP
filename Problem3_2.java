import java.util.*;
public class Problem3_2 {
    public static int[] merge(int[] list1, int[] list2) {
        int[] newList = new int[list1.length + list2.length];
        /*for (int i = 0; i < newList.length; i++) {
            if (i < list1.length) {
                newList[i] = list1[i];
            }
            else {
                newList[i] = list2[i-list1.length];
            }
        }*/
        System.arraycopy(list1, 0, newList, 0, list1.length);
        System.arraycopy(list2, 0, newList, list1.length, list2.length);
        Arrays.sort(newList);
        return newList;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 : ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        //int[] mergeList = merge(list1, list2);
        System.out.print("The merged list is ");
        /*for (int i = 0; i < mergeList.length; i++) {
            System.out.print(mergeList[i] + " ");
        }*/
        for (int i : merge(list1, list2)) {
            System.out.print(i + " ");;
        }
    }
}