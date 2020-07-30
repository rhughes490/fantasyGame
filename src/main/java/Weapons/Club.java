package Weapons;

public class Club extends Weapon{

    public Club(String name, int damageForce) {
        super(name, damageForce);
    }

    public int getWeaponForce(){
        return damageForce;
    }

}
