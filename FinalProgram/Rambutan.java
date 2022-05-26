public final class Rambutan extends Tree implements IHarvesting {

    public Rambutan() {
    }

    public Rambutan(int age) {
        super(age);
    }

    @Override
    public double harvest(double kg) {
        return kg * 40;
    }

    @Override
    public double compost() {
        Phase p = new Phase(age, 4, 10, 20);
        return p.calcPhase(5, 10, 25, 50);
    }

    @Override
    public double water() {
        Phase p = new Phase(age, 4, 10, 20);
        return p.calcPhase(40, 50, 100, 200);
    }

    @Override
    public boolean harvesting(int month) {
        if (month <= 6 && month >= 4) {
            return true;
        } else {
            return false;
        }
    }
}
