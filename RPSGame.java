import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;


    public RPSGame(Player player, NPC opponent) {

    }

    
    public void start() {
        Scanner scan2 = new Scanner(System.in);
        String tempName = scan2.nextLine();
        scan2.close();
        String tempchoice = "";
        int i = 0;
        while (
            validateChoice(tempchoice) == false & i > 3
        ) {
            Scanner scan = new Scanner(System.in);
            tempchoice = scan.nextLine();
            scan.close();
            i++;
        }
        
        setPlayerValues(tempName, tempchoice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public boolean didPlayerWIn() {
        if (
            player.getChoice() == "rock" & opponent.getChoice() == "scissors"
        ) {
            return true;
        } else if (
            player.getChoice() == "paper" & opponent.getChoice() == "rock"
        ) {
            return true;
        } else if (
            player.getChoice() == "scissors" & opponent.getChoice() == "paper"
        ) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean validateChoice(String choice) {
        if (
            choice.equals("paper") || choice.equals("scissors") || choice.equals("rock")
        ) {
            return true;
        } else {
            return false;
        }
        
    }

    public static String generateRandomChoice(){
        int tempNum = (int) (Math.random() * 3);
        if (
            tempNum == 0
        ) {
            return "rock";
        } else if (
            tempNum == 1
        ) {
            return "paper";
        } else {
            return "rock";
        }
    }

    public String toString() {
        if(
            didPlayerWIn()
        ) {
            return player.getName() + " won!\n" + "Congratulations!";
        } else {
            return "Opponent won! \nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== Game Results ==\n" + player.getName() + "chose" + player.getChoice() + ".\n"
        + "Opponent chose" + opponent.getChoice() + ".\n" + toString();
    }
    
}
