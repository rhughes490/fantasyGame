package Characters;

import Weapons.Axe;
import Weapons.IUseWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    IUseWeapon currentWeapon;
    IEvil enemy;


    @Before
    public void before() {
        currentWeapon = new Axe("Thor's Axe", 60);
        knight = new Knight("John", 100, currentWeapon, 2);
        enemy = new Orc("Stalin", 100);
    }


    @Test
    public void setArmour() {
    assertEquals("John", knight.getName());
    }


    @Test
    public void getHealth() {
    assertEquals(100, knight.getHealth());
    }

    @Test
    public void getAmour() {
    assertEquals(2, knight.getArmour());
    }

    @Test
    public void attack() {
        knight.attackEnemy(enemy);
        assertEquals(40, enemy.getHealth());
    }
}