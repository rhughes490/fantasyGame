package Weapons;

public abstract class Weapon implements IUseWeapon  {

    String name;
    int damageForce;

    public Weapon(String name, int damageForce) {
        this.name = name;
        this.damageForce = damageForce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
