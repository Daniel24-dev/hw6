public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.SWORD,"Frostmorne");

        Boss boss = new Boss(200,34,weapon);
        Skeleton lich = new Skeleton(10,3,new Weapon(WeaponType.BOW,"Frozen Bow"),66);
        boss.printInfo();
        lich.printInfo();
    }
}