public class Plant {

    private int plants; // = 6;
    private String PlantLocation; // = "in a pot";
    private String PotExterior; // = "wool";
    private String PotInside; // = "soil";
    private String PlantDesc; // = "leaves on the plants";
    private double PlantHeight; // = 12.5f;
    private boolean isAlive; // = true;
    private char Plantgrade; // = 'b';
    private int Plantage;
    
    public Plant(int Plantage){
        plants = 6;
        PlantLocation = "in a pot";
        PotExterior = "wool";
        PotInside = "soil";
        PlantDesc = "leaves on plant";
        PlantHeight = 12.5f;
        isAlive = true;
        Plantgrade = 'b';
    }

    public Plant() {
        plants = 6;
        PlantLocation = "in a pot";
        PotExterior = "wool";
        PotInside = "soil";
        PlantDesc = "leaves on plant";
        PlantHeight = 12.5f;
        isAlive = true;
        Plantgrade = 'b';
        Plantage = 1;
    }

    public void eat(){
        Plantgrade = 'A';
        System.out.println("the plant grade is now " + Plantgrade);
        

    }
    
    public void die(){
        PlantDesc = "no leaves on plant";
        System.out.println(PlantDesc);

    }
    
    public void fall(){
        PlantHeight = 0.0f;
        System.out.println("the height of the plant is " + PlantHeight);

    }
    
    public void drink(){
        PotInside = "wet soil";
        System.out.println("the soil is now wet");

    }
    
    public void getolder(){
        Plantage = Plantage + 10;
        System.out.println("the plant is now " + Plantage + "years old");
        if (Plantage > 100)
            System.out.println("You're plant is very old");
    }
    
    public boolean equals(Plant otherPlant) {
        if (
            this.plants == otherPlant.plants &&
            this.PlantHeight == otherPlant.PlantHeight &&
            this.isAlive == otherPlant.isAlive &&
            this.PlantDesc.equals(otherPlant.PlantDesc) &&
            this.Plantage == otherPlant.Plantage
            ) {
                return true;
            }
        else{
            return false;
        }
        }

    public String toString() {
        return "This plant is " + Plantage + " years old and is " + PlantLocation
        + " and the plant is " + PlantHeight + " Inches tall ";
    }

    public static void main(){

    }

    // eat
    // die
    // fall
    // drink
}