public class Boss extends GameEntity{

    private Weapon weapon;


    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo(){

        System.out.println("Health: " + getHealth());
        System.out.println("Weapon: " + weapon.getWeaponName()+ " (" + weapon.getWeapon() + ")");
    }


    }

