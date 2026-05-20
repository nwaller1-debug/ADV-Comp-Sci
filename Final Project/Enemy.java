public class Enemy extends Creature {

    private double buff;
    private int amount;
    private boolean canBreakArmour;

    public Enemy(int health, int damadge, double buff, boolean canCave, boolean canFly, int amount,
            boolean armour) {

        super(health, damadge, canCave, canFly);
        this.buff = buff;
        this.amount = amount;
        this.canBreakArmour = armour;

    }
}
