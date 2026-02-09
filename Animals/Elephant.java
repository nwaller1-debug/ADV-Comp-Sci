public class Elephant {
    private String color = "grey";
    private int numberOfTusks = 2;
    private double trunkLength = 5.5;
    private boolean isHungry = true;
    private int age = 4;
    private int energy = 5;

    public Elephant() {

    }

    public String toString() {
        if (isHungry) {
            return "the elephant is " + color + " with " + numberOfTusks + " tusks. "
                    + "It is hungry and is " + age + " years old. it's trunk is "
                    + trunkLength + "long";
        } else {
            return "the elephant is " + color + " with " + numberOfTusks + " tusks. "
                    + "It is not hungry and is " + age
                    + " years old and it's trunk is " + trunkLength + "long";
        }

    }

    public void eat() {
        isHungry = true;
        energy++;
    }

    public void getOlder() {
        age++;
    }

    public void getBigger(int lengthIncrease) {
        trunkLength += lengthIncrease;
        energy--;
    }
}
