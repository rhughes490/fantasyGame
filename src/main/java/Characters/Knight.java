package Characters;

import Weapons.IUseWeapon;

public class Knight extends Fighter {

    private int armour;

    public Knight(String name, int health, IUseWeapon currentWeapon, int armour) {
        super(name, health, currentWeapon);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
