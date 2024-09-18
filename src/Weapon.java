public class Weapon {
    private WeaponType weapon;
    private String weaponName;

    public Weapon(WeaponType weapon, String weaponName) {
        this.weapon = weapon;
        this.weaponName = weaponName;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }



    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
