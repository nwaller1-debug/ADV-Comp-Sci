public class Elephant extends Animal {
    private String color = "grey";
    private int numberOfTusks = 2;
    private double trunkLength = 5.5;

    public Elephant() {

    }

    public String toString() {
        if (super.getIsHungry()) {
            return "the elephant is " + color + " with " + numberOfTusks + " tusks. "
                    + "It is hungry and is " + super.getAge() + " years old. it's trunk is "
                    + trunkLength + "long";
        } else {
            return "the elephant is " + color + " with " + numberOfTusks + " tusks. "
                    + "It is not hungry and is " + super.getAge()
                    + " years old and it's trunk is " + trunkLength + "long";
        }

    }

    public void getBigger(int lengthIncrease) {
        trunkLength += lengthIncrease;
        super.getEnergy();
    }

    public void makeNoise() {

    }
}
