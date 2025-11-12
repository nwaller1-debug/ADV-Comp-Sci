public class NPC {
    
    private String choice;


    public NPC () {
        choice = RPSGame.generateRandomChoice();
    }
    
    public String getChoice() {
        return choice;
    }
    
    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (
            RPSGame.validateChoice(choice) == false
        ) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice.toLowerCase();
        }
    }

    public String toString(){
        return "Opponent chose " + choice + ".";
    }


}
