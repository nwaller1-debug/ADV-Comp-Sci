import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;


    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    
    public void start() {
        System.out.println("Enter name");
        Scanner scan = new Scanner(System.in);
        String tempName = scan.nextLine();
        String tempchoice = "";
        int i = 0;
        boolean onward = false;
        while (
            onward == false
        ) {
            System.out.println("enter rock, paper, or sissors");
            tempchoice = scan.nextLine();
            i++;
            onward = validateChoice(tempchoice);
        }
        
        setPlayerValues(tempName, tempchoice);
        scan.close();
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public boolean didPlayerWin() {
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
            return "scissors";
        }
    }

    public String toString() {
        if(
            didPlayerWin()
        ) {
            return player.getName() + " won!\n" + "Congratulations!";
        } else {
            return "Opponent won! \nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== Game Results ==\n" + player.getName() + " chose " + player.getChoice() + ".\n"
        + "Opponent chose " + opponent.getChoice() + ".\n" + toString();
    }
    
}
