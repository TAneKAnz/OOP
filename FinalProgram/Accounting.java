public class Accounting {
    
    private double harvest, compost, water;
    private String name;
     
    public void sum(double harvest, double compost, double water, String name) {
        this.harvest += harvest;
        this.compost += compost;
        this.water += water;
        this.name = name;
    }

    public double getHarvest() {
        return harvest;
    }

    public double getCompost() {
        return compost;
    }

    public double getWater() {
        return water;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " [harvest = " + harvest + ", compost = " + compost + ", water = " + water + "]";
    }
}
