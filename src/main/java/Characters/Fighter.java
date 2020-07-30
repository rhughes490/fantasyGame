package Characters;

import Weapons.IUseWeapon;

import java.util.ArrayList;

public abstract class Fighter extends Player {
    private IUseWeapon currentWeapon;
    private ArrayList<IUseWeapon> armoury;

    public Fighter(String name, int health, IUseWeapon currentWeapon) {
        super(name, health);
        this.currentWeapon = currentWeapon;
        this.armoury = new ArrayList<IUseWeapon>();
    }

    public void addToArmoury(IUseWeapon weapon){
        this.armoury.add(weapon);
    }

    public IUseWeapon removeFromArmoury(int index){
        return this.armoury.remove(index);
    }

    public IUseWeapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void changeCurrentWeapon(IUseWeapon weapon){
        if (armoury.contains(weapon)){
            addToArmoury(this.currentWeapon);
            int index = armoury.indexOf(weapon);
            IUseWeapon newWeapon = removeFromArmoury(index);
            this.currentWeapon = newWeapon;
        }
    }

    public void attackEnemy(IEvil enemy){
        int damage = this.currentWeapon.getWeaponForce();
        enemy.decreaseHealth(damage);
    }

    public void attackEnemy(IEvil enemy, Barbarian barbarian){
        int rage = barbarian.getRage();
        int damage = this.currentWeapon.getWeaponForce();
        int totalDamage = rage*damage;
        enemy.decreaseHealth(totalDamage);
    }


}



