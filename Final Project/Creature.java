import java.util.ArrayList;

public abstract class Creature {
    private int health;
    private int damadge;
    private boolean canCave;
    private boolean canFly;

    public Creature(int health, int damadge, boolean canCave, boolean canFly) {
        this.health = health;
        this.damadge = damadge;
        this.canCave = canCave;
        this.canFly = canFly;

    }

    public int getDamadge() {
        return damadge;
    }

    public int getHealth() {
        return health;
    }

    public void setDamadge(int damadge) {
        this.damadge = damadge;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
