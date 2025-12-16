public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String name, TheaterMember[] registeredMembers) {
        theaterName = name;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String name, int initialCapacity) {
        theaterName = name;
        registeredMembers = new TheaterMember[initialCapacity];
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        int x = registeredMembers.length;
        TheaterMember[] ogArray = registeredMembers.clone();
        this.registeredMembers = new TheaterMember[ogArray.length * 2];
        for (int i = 0; i < x; i++) {
            registeredMembers[i] = ogArray[i];
        }

    }

    public void registerMember(TheaterMember member) {
        if (!isFull()) {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    return;
                }
            }
        } else {
            int x = registeredMembers.length;
            TheaterMember[] ogArray = registeredMembers.clone();
            registeredMembers = new TheaterMember[x + 1];
            for (int i = 0; i < x; i++) {
                registeredMembers[i] = ogArray[i];
            }
            registeredMembers[x] = member;
        }
    }

    public String toString() {
        String output = "== " + theaterName + " ==\n";

        for (int i = 0; i < registeredMembers.length; i++) {
            output += (i + 1) + ".) " + registeredMembers[i].toString();
            output += "\n";
        }
        return output;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                if (registeredMembers[i].equals(member)) {
                    registeredMembers[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
