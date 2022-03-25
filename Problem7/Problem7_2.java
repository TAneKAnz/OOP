package Problem8;

public class Problem7_2 {
    public static void main(String[] args) {
       Person person = new Person("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
               "somsak@mymail.com");
       Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
               "somsak@mymail.com", 3);
       Employee employee = new Employee("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
               "somsak@mymail.com", "OFFICE", 5000);
       Faculty faculty = new Faculty("Somsak", "1 Chalxongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
              "somsak@mymail.com", "OFFICE", 5000, "6" ,1);
       Staff staff = new Staff("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
               "somsak@mymail.com", "OFFICE", 5000, "Security Guard");

       System.out.println("-----------------------------------------------------------------------------------------------\n");
       System.out.println(person);
       System.out.println("\n-----------------------------------------------------------------------------------------------\n");
       System.out.println(student);
       System.out.println("-----------------------------------------------------------------------------------------------\n");
       System.out.println(employee);
       System.out.println("-----------------------------------------------------------------------------------------------\n");
       System.out.println(faculty);
       System.out.println("-----------------------------------------------------------------------------------------------\n");
       System.out.println(staff);
       System.out.println("-----------------------------------------------------------------------------------------------\n");
   }
}

