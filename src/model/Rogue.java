package model;

public class Rogue extends Unit {

    private int ep;
    public Rogue(String name, int hp, int ep) {
        super(name, hp);
        this.ep = ep;
    }

    public int getEp() {
        return ep;
    }

    @Override
    public void getDmg(int dmg) {
        hp -= dmg * 90 / 100;
        System.out.println("Rogue gets " + dmg * 90 / 100 + " damage!");
        System.out.println("Rogue hp is " + getHp() + " now.");
    }

    @Override
    public void doDmg(Unit unit) {
        if (getEp() >= 15) {
            unit.getDmg(15);
            ep -= 5;
            System.out.println("Rogue has enough ep! The damage will be higher.");
            System.out.println("Rogue causes damage 15.");
        } else {
            unit.getDmg(5);
            System.out.println("Rogue causes damage 5");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nEp: " + getEp();
    }
}
