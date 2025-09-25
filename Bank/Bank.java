public class Bank {
    private int numberOfTellers;
    private int numberOfLoanOfficers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }
    
    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "this bank has " + numberOfLoanOfficers + " loan officers "
            + "and " + numberOfTellers + " tellers.";
    }


    public boolean equals(Bank otherbank) {
        if (
            this.numberOfLoanOfficers == otherbank.numberOfLoanOfficers
                && this.numberOfTellers == otherbank.numberOfTellers
        ) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberTohire, boolean isLoanOfficer) {
        if (
            isLoanOfficer == true
        ) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberTohire;
        } else {
            numberOfTellers = numberOfTellers + numberTohire;
        }
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

}
