import java.util.ArrayList;

public class ParkingGarage {
    // instance variables
    private Car[][] spots;

    // constructors
    public ParkingGarage(int levels, int spacesPerLevel) {
        if (levels <= 0 || spacesPerLevel <= 0) {
            throw new IllegalArgumentException("variables can not be less than 0.");
        }
        spots = new Car[levels][spacesPerLevel];
    }

    /* initializes spots as a 3x3 2D array */
    public ParkingGarage() {
        spots = new Car[3][3];
    }

    // getters and setters
    public Car[][] getSpots() {
        return spots;
    }

    public void setSpots(Car[][] spots) {
        this.spots = spots;
    }

    // methods

    /*
     * prints out the 2D array 'spots', displaying the car's info if the space is
     * occupied, or
     * '[Empty]' if the space is empty
     */
    public void displayStatus() {
        for (Car[] level : spots) {
            for (Car vehicle : level) {
                if (vehicle != null) {
                    System.out.print(vehicle);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void park(Car vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("veichle can not be null.");
        }
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots[i].length; j++) {
                if (spots[i][j] == null) {
                    spots[i][j] = vehicle;
                    return;
                }
            }
        }
        System.out.println("No empty spots");
    }

    public void park(Car vehicle, int level, int space) {
        if (vehicle == null) {
            throw new IllegalArgumentException("veichle can not be null.");
        }
        if (level <= 0 || space <= 0) {
            throw new IllegalArgumentException("variables can not be less than 0.");
        }
        if (level > spots.length || space > spots[0].length) {
            throw new IllegalArgumentException("Invalid space");
        }
        if (spots[level][space] == null) {
            spots[level][space] = vehicle;
        } else {
            park(vehicle);
        }
    }

    public void park(ArrayList<Car> vehicles) {
        if (vehicles == null) {
            throw new IllegalArgumentException("veichles can not be null.");
        }

        for (Car vehicle : vehicles) {
            park(vehicle);
        }
    }

    public Car depart(int level, int space) {
        if (level < 0 || space < 0) {
            throw new IllegalArgumentException("variables can not be less than 0.");
        }
        if (level >= spots.length || space >= spots[0].length) {
            throw new IllegalArgumentException("Invalid space");
        }
        if (spots[level][space] == null) {
            throw new IllegalArgumentException("There is no car in that space");
        }
        Car left = spots[level][space];

        spots[level][space] = null;
        return left;
    }

    public ArrayList<Car> search(String plate) {
        if (plate == null) {
            throw new IllegalArgumentException("plate can not be null.");
        }
        ArrayList<Car> cart = new ArrayList<Car>();
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots[i].length; j++) {
                if (spots[i][j].getPlate() == plate) {
                    cart.add(spots[i][j]);
                }
            }
        }
        return cart;
    }

    public ArrayList<Car> search(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("year can not be null.");
        }
        ArrayList<Car> cart = new ArrayList<Car>();
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots[i].length; j++) {
                if (spots[i][j].getYear() == year) {
                    cart.add(spots[i][j]);
                }
            }
        }
        return cart;
    }
}
