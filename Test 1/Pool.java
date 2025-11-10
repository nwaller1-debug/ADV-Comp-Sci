public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChecmicalCheck;

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);;
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        needsChecmicalCheck = false;
        username = PoolUtils.generateUsername(ownerName);
    }

    public Pool() {
        name = "pool 12";
        ownerName = "Nick waller";
        cleanlinessLevel = PoolUtils.validateCleanlinessLevel(-5);
        needsChecmicalCheck = false;
        username = PoolUtils.generateUsername(ownerName);
    }
    
    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getUsername() {
        return username;
    }
    
    public boolean isNeedsChecmicalCheck() {
        return needsChecmicalCheck;
    }
    
    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = cleanlinessLevel;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNeedsChecmicalCheck(boolean needsChecmicalCheck) {
        this.needsChecmicalCheck = needsChecmicalCheck;
    }
   
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }


    public String toString() {
        String chem = "";
        if (needsChecmicalCheck) {
            chem = "no";
        } else {
            chem = "yes";
        }
        
        return "==ABOUT POOL ===" + "\n" + "Owner: " + ownerName + 
            "\n" + "username: " + username 
            + "\n"
            + "Cleanliness level: " + cleanlinessLevel + "\n" 
            + "Does pool need chemical check? " + chem;
    }

    public boolean equals(Pool other) {
        if (
            this.ownerName.equals(other.ownerName) 
            && this.name.equals(other.name)
                && this.cleanlinessLevel == other.cleanlinessLevel
                && this.needsChecmicalCheck == other.needsChecmicalCheck
                && this.username.equals(other.username)
        ) {
            return true;
        } else {
            return false;
        }
    }
    
}
