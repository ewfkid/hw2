package service;

import model.Mage;
import model.Rogue;
import model.Unit;
import model.Warrior;

import java.sql.SQLOutput;

public class Demo {
    public static void demo() {
        Mage mage = new Mage("Sara", 100, 55);
        Warrior warrior = new Warrior("Alex", 95, 40, 30);
        Rogue rogue = new Rogue("John", 80, 35);

        System.out.println("The fight starts!");
        System.out.println();
        while (mage.getHp() > 0 && warrior.getHp() > 0 && rogue.getHp() > 0) {
            mage.doDmg(rogue);
            rogue.doDmg(warrior);
            warrior.doDmg(mage);
        }
        System.out.println("The fight is ended.");

        Unit[] units = {mage, warrior, rogue};
        for (Unit unit : units) {
            if (unit.getHp() > 0) {
                System.out.println(unit.getName() + " won!");
            }
        }
    }

}
