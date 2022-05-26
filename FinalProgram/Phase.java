public class Phase {
    private int age, a, b, c;

    public Phase() {
    }

    public Phase(int age, int a, int b, int c) {
        this.age = age;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //range the phase of each tree
    public double calcPhase(int firstPhase, int secondPhase, int thirdPhase, int lastPhase) {
        if (age < a) {
            return firstPhase;
        } else if (age < b) {
            return secondPhase;
        } else if (age < c) {
            return thirdPhase;
        } else {
            return lastPhase;
        }
    }
}
