package Characters;

import Weapons.IUseWeapon;

public class Dwarf extends Fighter {

    private int dodgy;

    public Dwarf(String name, int health, IUseWeapon currentWeapon, int dodgy) {
        super(name, health, currentWeapon);
        this.dodgy = dodgy;
    }

    public int getDodgy() {
        return dodgy;
    }

    public void setDodgy(int dodgy) {
        this.dodgy = dodgy;
    }
}
