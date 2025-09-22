public class Unit0Exercises {

    private boolean weekday;
    private boolean vacation;

    public Unit0Exercises() {
        weekday = false;
        vacation = true;
    }   

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }

    public int diff21(int n) {
        if (
            n < 21
        ) {
            return 21 - n;
        } else {
            return -2 * (21 - n);
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        double price = sqft * pricePerSqft;
        if (
            price < 0
        ) {
            price = 0;
        }
        return price;
    }
}