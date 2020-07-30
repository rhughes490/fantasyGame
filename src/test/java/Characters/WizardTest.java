package Characters;

import Spells.Fireball;
import Spells.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    ISpell currentSpell;
    IEvil enemy;
    
    @Before
    public void before() {
        currentSpell = new Fireball("Big Fireball", 10);
        wizard = new Wizard("Gandalf", 100, currentSpell);
        enemy = new Orc("Simon", 100);
    }
    
    @Test
    public void attackTest(){
        wizard.attackEnemy(enemy);
        assertEquals(90, enemy.getHealth());
    }
}
