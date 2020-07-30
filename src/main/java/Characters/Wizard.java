package Characters;

import Spells.ISpell;

import java.util.ArrayList;

public class Wizard extends MagicPlayers{

    public Wizard(String name, int health, ISpell currentSpell) {
        super(name, health, currentSpell);
    }
}
