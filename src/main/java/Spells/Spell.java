package Spells;

public abstract class Spell implements ISpell {

    String name;
    int damageForce;

    public Spell(String name, int damageForce) {
        this.name = name;
        this.damageForce = damageForce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageForce() {
        return damageForce;
    }

    public void setDamageForce(int damageForce) {
        this.damageForce = damageForce;
    }

    public int getSpellDamageForce() {
        return this.damageForce;
    }
}
