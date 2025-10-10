public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId){
        dogChar = PawesomeUtils.generateDogChar(dogId);
        dogTag = PawesomeUtils.generateDogTag(dogId, dogChar);
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
    }

    public Dog() {
        name = "Riley";
        ownerName = "Nick";
        age = 10;
        dogId = 123;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        stillInFacility = true;
        this.dogTag = PawesomeUtils.generateDogTag(dogId, dogChar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }
    
    public char getDogChar() {
        return dogChar;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
    }


    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
        PawesomeUtils.generateDogChar(dogChar);
    }

    public String getDogtag() {
        return dogTag;
    }

    public void setDogtag(String dogtag) {
        this.dogTag = dogtag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        if (
            stillInFacility == true
        ) {
        return name + "is " + ownerName + "'s dog. They are "  + age 
        + "years old. Their dog ID is " 
        + dogId + " their dogChar is " + dogChar 
        + " and their dog tag is " + dogTag 
        + " the dog is still in the facility"; } 
        else {
            return name + "is " + ownerName + "'s dog. They are "  
            + age + "years old. Their dog ID is " 
        + dogId + " their dogChar is " + dogChar 
        + " and their dog tag is " + dogTag 
        + " the dog is not in the facility ";
        }
        
    }

    public boolean equals(Dog otherdog) {
        if (
            this.name.equals(otherdog.name) 
            && this.ownerName.equals(otherdog.ownerName)
            && this.age == otherdog.age
            && this.dogId == otherdog.dogId
            && this.dogChar == otherdog.dogChar
            && this.dogTag.equals(otherdog.dogTag)
            && this.stillInFacility == otherdog.stillInFacility
        ) {
            return true;
        } else {
            return false;
        }
    }
}