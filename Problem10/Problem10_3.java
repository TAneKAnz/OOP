package Problem10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem10_3 {
    public static void main(String[] args) throws FileNotFoundException {
		// Create three ArrayLists
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		File file = new File("Salary.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String[] line = (input.nextLine()).split(" ");
            Double salary = Double.parseDouble(line[3]);
            processData(assistant, associate, full, line[2], salary);
        }
		
		double totalAssistant = getTotal(assistant);
		double totalAssociate = getTotal(associate);
		double totalFull = getTotal(full);
		double totalFaculty = (totalAssistant + totalAssociate + totalFull);



		System.out.println("\n   Total salary");
		System.out.println("---------------------");
		System.out.printf("Assistant    :  $ %.2f\n", totalAssistant);
		System.out.printf("Associate    :  $ %.2f\n", totalAssociate);
		System.out.printf("Full         :  $ %.2f\n", totalFull);
		System.out.printf("All faculty  :  $ %.2f\n", totalFaculty);

		System.out.println("\n   Average salary");
		System.out.println("---------------------");
		System.out.printf("Assistant    :  $ %.2f\n", (totalAssistant / assistant.size()));
		System.out.printf("Associate    :  $ %.2f\n", (totalAssociate / associate.size()));
		System.out.printf("Full         :  $ %.2f\n", (totalFull / full.size()));
		System.out.printf("All faculty  :  $ %.2f\n", (totalFaculty / (assistant.size() + associate.size() + full.size())));

        System.out.println("\n   number of people");
        System.out.println("---------------------");
        System.out.printf("Assistant   :  %d\n", (assistant.size()));
		System.out.printf("Associate   :  %d\n", (associate.size()));
		System.out.printf("Full        :  %d\n", (full.size()));
		System.out.printf("All faculty :  %d\n", ((assistant.size() + associate.size() + full.size())));
	}

	public static double getTotal(ArrayList<Double> list) {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total;
	}

	public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank, double salary) {
		if (rank.equals("assistant")){
			a.add(salary); 
		}
		else if (rank.equals("associate"))
			b.add(salary);
		else if (rank.equals("full"))
			c.add(salary);
	}
}