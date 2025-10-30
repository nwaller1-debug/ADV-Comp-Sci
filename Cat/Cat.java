public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Rain";
        this.ownerName = "Nick";
        this.moodLevel = PurrfectUtils.validateMoodLevel(5);
        this.catId = PurrfectUtils.validateCatId("1000");
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }
    

    public boolean getHungry() {
        return isHungry;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public int getMoodLevel() {
        return moodLevel;
    }
    
    public String getCatId() {
        return catId;
    }
    
    public char getCatChar() {
        return catChar;
    }
    
    public boolean isHungry() {
        return isHungry;
    }

    public void setName(String name) { 
        this.name = name; 
    }
    public void setOwnerName(String ownerName) { 
        this.ownerName = ownerName; 
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
    }

    public void setHungry(boolean isHungry) { 
        this.isHungry = isHungry; 
    }


    public String generateCatTag() {
        return catId + catChar;
    }
   

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);

        String line1 = "== ABOUT " + name.toUpperCase() + " ==";
        String line2 = name + " is a cat.";
        String line3 = "Their tag is " + generateCatTag() + ".";
        String line4 = catMoodMessage;

        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4;
    }

    public boolean equals(Cat other) {
        return this.name.equals(other.name) &&
               this.ownerName.equals(other.ownerName) &&
               this.moodLevel == other.moodLevel &&
               this.generateCatTag().equals(other.generateCatTag()) &&
               this.isHungry == other.isHungry;
    }
}