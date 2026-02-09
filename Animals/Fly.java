public class Fly {
    private String color = "black";
    private int numberOfEyes = 1000;
    private int numberOfwings = 4;
    private int age = 2;
    private boolean canFly = true;
    private int numberOfLegs = 4;
    private int energy = 5;
    private boolean isHungry = true;

    public Fly() {

    }

    public String toString() {
        if (canFly) {
            return "The fly is " + color + " with " + numberOfEyes + " eyes. "
                    + "It has " + numberOfwings + " wings and " + numberOfLegs + "legs. "
                    + " It is" + age + " days old and can fly";
        } else {
            return "The fly is " + color + " with " + numberOfEyes + " eyes. "
                    + "It has " + numberOfwings + " wings and " + numberOfLegs + "legs. "
                    + " It is" + age + " days old and can't fly";
        }

    }

    public void paintFly(String color) {
        this.color = color;
    }

    public void getOlder() {
        age++;
    }

    public void eat() {
        isHungry = false;
        energy++;
    }

    public void crash() {
        numberOfwings--;
        canFly = false;
    }
}
