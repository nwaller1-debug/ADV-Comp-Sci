public class NPC {
    
    private String choice;


    public NPC () {
        choice = RPSGame.generateRandomChoice();
    }
    
    public String getChoice() {
        return choice;
    }
    
    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String toString(){
        return "opponent chose " + choice;
    }


}
