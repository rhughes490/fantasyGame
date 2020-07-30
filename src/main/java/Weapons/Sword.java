package Weapons;

public class Sword extends Weapon {

    public Sword(String name, int damageForce) {
        super(name, damageForce);
    }

    public int getWeaponForce(){
        return damageForce;
    }

}
