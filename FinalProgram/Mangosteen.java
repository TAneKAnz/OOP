public final class Mangosteen extends Tree implements IHarvesting {
    
    public Mangosteen() {
    }

    public Mangosteen(int age) {
        super(age);
    }

    @Override
    public double harvest(double kg) {
        return kg * 80;
    }

    @Override
    public double compost() {
        Phase p = new Phase(age, 5, 20, 40);
        return p.calcPhase(10, 20, 50, 100);
    }

    @Override
    public double water() {
        Phase p = new Phase(age, 5, 20, 40);
        return p.calcPhase(50, 100, 200, 500);
    }

    @Override
    public boolean harvesting(int month) {
        if (month <= 7 && month >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
