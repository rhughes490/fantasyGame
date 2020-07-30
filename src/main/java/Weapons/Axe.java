package Weapons;

public class Axe extends Weapon {
    public Axe(String name, int damageForce) {
        super(name, damageForce);
    }

    public int getWeaponForce(){
        return damageForce;
    }

}

