import java.util.ArrayList;

public class AllyTame extends Creature {

    private double saddleArmour;
    private int speed;
    private int agression;
    private ArrayList<String> food;

    public AllyTame(int health, int damadge, ArrayList<String> food,
            int speed, double saddleArmour, boolean canCave, boolean canFly, int agression) {

        super(health, damadge, canCave, canFly);
        this.food = food;
        this.speed = speed;
        this.saddleArmour = saddleArmour;
    }

    public double getSaddleArmour() {
        return saddleArmour;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAgression() {
        return agression;
    }

    public ArrayList<String> getFood() {
        return food;
    }
}
