import java.util.ArrayList;
import java.util.Scanner;

public class Situations {

    private boolean inSky;
    private boolean inCave;
    private boolean isTaming;
    private Enemy enemy;
    private ArrayList<AllyTame> allyList;

    public Situations(Enemy enemy, ArrayList<AllyTame> ally) {
        inSky = isInSky();
        inCave = isInCave();
        isTaming = involveTaming();
        this.enemy = enemy;
        this.allyList = ally;
    }

    public boolean isInSky() {
        int finished = 0;
        while (finished == 0) {
            System.out.println("Will this situation be in the sky (y/n)");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine().toLowerCase();
            scan.close();
            if (temp.equals("y")) {
                return true;
            }
            if (temp.equals("n")) {
                return false;
            }
        }
        return true;
    }

    public boolean isInCave() {
        int finished = 0;
        while (finished == 0) {
            System.out.println("Will this situation be in a cave (y/n)");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine().toLowerCase();
            scan.close();
            if (temp.equals("y")) {
                return true;
            }
            if (temp.equals("n")) {
                return false;
            }
        }
        return true;
    }

    public boolean involveTaming() {
        int finished = 0;
        while (finished == 0) {
            System.out.println("Will this situation involve taming or stealth");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine().toLowerCase();
            scan.close();
            if (temp.equals("y")) {
                return true;
            }
            if (temp.equals("n")) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<AllyTame> recList() {

    }

}
