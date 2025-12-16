public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public String getName() {
        return name;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i > loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                break;
            }
        }
    }

    public int countLoyaltyCredits() {
        int x = 0;
        for (int i = 0; i > loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                x = x + 1;
            }
        }
        return x;
    }

    public String determineMembershipStatus() {
        int x = countLoyaltyCredits();
        if (x >= 6) {
            return "Gold Member";
        } else if (x > 3 && x <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }

    }

    public String loyaltyHistory() {
        int x = countLoyaltyCredits();
        String y = "[";
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (i < x) {
                y = y + "x, ";
            } else if (i == loyaltyCredits.length - 1) {
                y = y + "-]";
            } else {
                y = y + "-, ";
            }

        }
        return y;
    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), "
                + "Loyalty History: " + loyaltyHistory();
    }

    public boolean equals(TheaterMember oTheaterMember) {
        boolean isame = true;
        for (int i = 0; i > loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] != oTheaterMember.loyaltyCredits[i]) {
                isame = false;
            }
        }
        if (name.equals(oTheaterMember.name) && isame) {
            return true;
        } else {
            return false;
        }
    }

}
