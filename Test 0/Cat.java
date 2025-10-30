public class Cat {
	
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) {
		this.breed = breed;
		this.name = name;
		this.isHungry = true;
		livesRemaining = 9;
	}

	public Cat() {
        //TODO Auto-generated constructor stub
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry() {
		return isHungry;
	}

	public boolean feed() {
		return this.isHungry = false;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean equals(Cat other) {
		if(
			this.name.equals(other.name) && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining
		) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}

    public int getMoodLevel() {
        throw new UnsupportedOperationException("Unimplemented method 'getMoodLevel'");
    }

    public void setMoodLevel(int newMood) {

        throw new UnsupportedOperationException("Unimplemented method 'setMoodLevel'");
    }

    public void setIsHungry(boolean b) {
        throw new UnsupportedOperationException("Unimplemented method 'setIsHungry'");
    }

    public Object getCatId() {
        throw new UnsupportedOperationException("Unimplemented method 'getCatId'");
    }
}