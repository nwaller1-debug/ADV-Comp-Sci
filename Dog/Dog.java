public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogtag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId){
        this.dogChar = generateDogChar(this.dogId);
    }

    public Dog() {
        name = "Riley";
        ownerName = "Nick";
        age = 10;
        dogId = 237;
        this.dogChar = generateDogChar(this.dogId);
        stillInFacility = true;
        dogtag = generateDogTage();
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }


    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogtag() {
        return dogtag;
    }

    public void setDogtag(String dogtag) {
        this.dogtag = dogtag;
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
        + " and their dog tag is " + dogtag 
        + " the dog is still in the facility"; } 
        else {
            return name + "is " + ownerName + "'s dog. They are "  
            + age + "years old. Their dog ID is " 
        + dogId + " their dogChar is " + dogChar 
        + " and their dog tag is " + dogtag 
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
            && this.dogtag.equals(otherdog.dogtag)
            && this.stillInFacility == otherdog.stillInFacility
        ) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void checkIn(Dog dog, String personName) {
        dog.ownerName = personName;
        dog.stillInFacility = true;
    }

    public static String pickup(Dog dog, String personName) {
        if (
            dog.ownerName.equals(personName)
        ) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + dog.ownerName;
        }
        else {
            return "You cannot take the dog because you are not its owner";
        }
    }

    public static char generateDogChar(int dogId) {
        return (char) ('f' + (dogId / 100) + ((dogId % 100) / 10) + ((dogId % 100) % 10));
    }

    public String generateDogTage() {
        return dogChar + (char) dogId + " ";
    }
}