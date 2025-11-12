public class Player {
    private String name;
    private String choice;


    public String getChoice() {
        return choice;
    }
    
    public String getName() {
        return name;
    }

    public void setChoice(String choice) {
        String choice1 = choice.toLowerCase();
        if (
            RPSGame.validateChoice(choice1) == false
        ) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice1;
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
