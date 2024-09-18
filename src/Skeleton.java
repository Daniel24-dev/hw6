public class Skeleton extends Boss{
    private int arrow;

    public Skeleton(int health, int damage, Weapon weapon, int arrow) {
        super(health, damage, weapon);
        this.arrow = arrow;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrows" + this.arrow);
    }
}
