public abstract class Animal {
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

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public abstract void makeNoise();
}
