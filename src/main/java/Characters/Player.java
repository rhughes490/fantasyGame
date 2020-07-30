package Characters;

public abstract class Player {

    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int heal) {
        this.health += heal;
    }

    public void decreaseHealth(int damage) {
        this.health -= damage;
    }
}
