package Characters;

import Weapons.Axe;
import Weapons.IUseWeapon;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    IUseWeapon axe;

    @Before
    public void before(){
        axe = new Axe("Test", 60);

    }

    @Test
    public void hasdamageForce(){
        assertEquals(60, axe.getWeaponForce());
    }



}
