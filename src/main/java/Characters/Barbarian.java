package Characters;

import Weapons.IUseWeapon;

public class Barbarian extends Fighter {

    private int rage;

    public Barbarian(String name, int health, IUseWeapon currentWeapon, int rage) {
        super(name, health, currentWeapon);
        this.rage = rage;
    }

    public int getRage() { return rage; }

    public void setRage(int rage) {
        this.rage = rage;
    }
}
