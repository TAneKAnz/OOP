public final class Durian extends Tree implements IHarvesting {

    public Durian() {
    }

    public Durian(int age) {
        super(age);
    }

    @Override
    public double harvest(double kg) {
        return kg * 180;
    }

    @Override
    public double compost() {
        Phase p = new Phase(age, 5, 15, 30);
        return p.calcPhase(10, 20, 50, 100);
    }

    @Override
    public double water() {
        Phase p = new Phase(age, 5, 15, 30);
        return p.calcPhase(50, 100, 200, 500);
    }
    
    @Override
    public boolean harvesting(int month) {
        if (month <= 8 && month >= 6) {
            return true;
        } else {
            return false;
        }
    }
}
