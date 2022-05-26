import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //set the compost and water price
        double compostPrice = 20, waterPrice = 0.2;

        //put another tree at this 
        Accounting mangosteen = new Accounting();
        Accounting durian = new Accounting();
        Accounting rambutan = new Accounting();
        Accounting all = new Accounting();

        try (Scanner input = new Scanner(System.in)) {
            //use polymorphism by use Tree point to subclass that randomed
            Tree t = null;
            for (int i = 0; i < 20; i++) {
                int[] r = {randomBetween(1, 60), randomBetween(1, 100)};  //random kg of harvesting and subclass of Tree
                switch (randomBetween(0, 2)) {  //put another tree at this and put more random range
                    case 0:
                        t = new Mangosteen(r[0]);
                        mangosteen.sum(t.harvest(r[1]), t.compost()*compostPrice, t.water()*waterPrice, t.getClass().getName());
                        break;
                    case 1:
                        t = new Durian(r[0]);
                        durian.sum(t.harvest(r[1]), t.compost()*compostPrice, t.water()*waterPrice, t.getClass().getName());
                        break;
                    case 2:
                        t = new Rambutan(r[0]);
                        rambutan.sum(t.harvest(r[1]), t.compost()*compostPrice, t.water()*waterPrice, t.getClass().getName());
                        break;
                    default:
                        t = new Mangosteen(r[0]);
                        mangosteen.sum(t.harvest(r[1]), t.compost()*compostPrice, t.water()*waterPrice, t.getClass().getName());
                }
                all.sum(t.harvest(r[1]), t.compost()*compostPrice, t.water()*waterPrice, "Net");
            }

            //put another tree at this
            receipt(mangosteen);                    //display mangosteen accounting
            receipt(durian);                        //display durian accounting
            receipt(rambutan);                      //display rambutan accounting
            receipt(all);                           //display net accounting
            System.out.println("net profit : " + (all.getHarvest() - all.getCompost() - all.getWater()));
            System.out.println("------------------------");
            System.out.print("Check a harvesting season of each tree !!\nMonth = ");
            int month = input.nextInt();
            t = new Mangosteen();
            System.out.println("Mangosteen is in harvesting : " + ((Mangosteen) t).harvesting(month));
            t = new Durian();
            System.out.println("Durian is in harvesting : " + ((Durian) t).harvesting(month));
            t = new Rambutan();
            System.out.println("Rambutan is in harvesting : " + ((Rambutan) t).harvesting(month));
        }

        System.out.println("------------------------");
    }

    //display
    public static void receipt(Accounting a) {
        System.out.println("------------------------");
        System.out.println(a.getName());
        System.out.println("harvest = " + a.getHarvest());
        System.out.println("compost = " + a.getCompost());
        System.out.println("water   = " + a.getWater());
        //System.out.println("------------------------");
    }

    //random
    public static int randomBetween(int fromNumber, int toNumber) {
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
    }

}
