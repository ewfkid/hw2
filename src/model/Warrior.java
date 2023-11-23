package model;


public class Warrior extends Unit {
    private int armor;
    private int weapon;

    public Warrior(String name, int hp, int armor, int weapon) {
        super(name, hp);
        this.armor = armor;
        this.weapon = weapon;
    }

    public int getArmor() {
        return armor;
    }

    public int getWeapon() {
        return weapon;
    }

    @Override
    public void getDmg(int dmg) {
        if (armor > 0) {
            armor -= armor * 20 / 100;
            hp -= dmg * 60 / 100;
            System.out.println("Warrior gets " + dmg * 60 / 100 + " damage!");
        } else {
            hp -= dmg;
            System.out.println("Warrior gets " + dmg + " damage!");
        }
        System.out.println("Warrior hp is " + getHp() + " now.");
    }

    @Override
    public void doDmg(Unit unit) {
        if (getWeapon() >= 20) {
            unit.getDmg(25);
            weapon -= 20;
            System.out.println("Warrior has weapon! The damage will be higher.");
            System.out.println("Warrior causes damage 25.");
        } else {
            unit.getDmg(10);
            System.out.println("Warrior causes damage 10.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nArmor: " + getArmor();
    }
}
