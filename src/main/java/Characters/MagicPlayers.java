package Characters;


import Spells.ISpell;

import java.util.ArrayList;

public abstract class MagicPlayers extends Player{
    private ISpell currentSpell;
    private ArrayList<ISpell> spellCollection;

    public MagicPlayers(String name, int health, ISpell currentSpell) {
        super(name, health);
        this.currentSpell = currentSpell;
        spellCollection = new ArrayList<ISpell>();
    }

    public void addToSpellCollection(ISpell spell){
        this.spellCollection.add(spell);
    }

    public ISpell removeFromSpellCollection(int index){
        return this.spellCollection.remove(index);
    }

    public ISpell getCurrentSpell() {
        return currentSpell;
    }

    public void changeCurrentSpell(ISpell spell){
        if (spellCollection.contains(spell)){
            addToSpellCollection(this.currentSpell);
            int index = spellCollection.indexOf(spell);
            ISpell newSpell = removeFromSpellCollection(index);
            this.currentSpell = newSpell;
        }
    }

    public void attackEnemy(IEvil enemy){
        int damage = this.currentSpell.getSpellDamageForce();
        enemy.decreaseHealth(damage);
    }
}
