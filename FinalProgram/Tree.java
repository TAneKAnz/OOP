public abstract class Tree {
    protected int age;
    protected float height;

    public Tree() {
    }
    public Tree(int age) {
        this.age = age;
    }
    public Tree(int age, float height) {
        this.age = age;
        this.height = height;
    }

    //getter setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    
    //method
    public abstract double harvest(double kg);              //earning per year
    public abstract double compost();                       //amount of compost per year (kg)
    public abstract double water();                         //amount of water per year (litre)

    @Override
    public String toString() {
        return "Tree [age=" + age + ", height=" + height + "]";
    }
}
