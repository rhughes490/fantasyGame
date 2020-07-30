package Characters;

public abstract class Enemy implements IEvil{
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int damage) {
        this.health -= damage;
    }

    public String taunt(){
        return "A non-reference reference?!?!?!?! PREPARE TO DIE! [sniff]";
    }
}
