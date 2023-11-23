package model;

public class Mage extends Unit {
    private int mp;

    public Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public void getDmg(int dmg) {
        hp -= dmg;
        System.out.println("Mage gets " + dmg + " damage!");
        System.out.println("Mage hp is " + getHp() + " now.");
    }

    @Override
    public void doDmg(Unit unit) {
        if (getMp() >= 10) {
            unit.getDmg(20);
            mp -= 10;
            System.out.println("Mage has enough mp! The damage will be higher.");
            System.out.println("Mage causes damage 20.");
        } else {
            unit.getDmg(10);
            System.out.println("Mage causes damage 10.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMp: " + getMp();
    }
}
