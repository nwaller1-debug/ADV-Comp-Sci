public class Animal {
    private int age;
    private int energy;
    private boolean isHungry;

    public Animal() {

    }

    public void getOlder() {
        age++;
    }

    public void eat() {
        isHungry = false;
        energy++;
    }
}
