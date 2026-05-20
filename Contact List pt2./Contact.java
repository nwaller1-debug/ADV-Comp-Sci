public class Contact {

    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public Contact(String firstname, String lastName, String telephonenumber) {
        this.firstName = firstname;
        this.lastName = lastName;
        if (!validateNumb(telephonenumber)) {
            throw new IllegalArgumentException("Phone number is invalid");
        }
        this.telephoneNumber = telephonenumber;

    }

    public String toString() {
        String y = "";
        y += firstName + ", " + lastName + ", " + telephoneNumber;
        return y;
    }

    public boolean validateNumb(String teleNumb) {
        if (teleNumb.length() != 12) {
            System.out.print(teleNumb.length());
            return false;
        }
        for (int i = 0; i < teleNumb.length(); i++) {
            System.out.print(teleNumb.charAt(i));
            if (teleNumb.charAt(i) != 45 && teleNumb.charAt(i) > 57 && teleNumb.charAt(i) < 48) {
                return false;
            }
        }
        return true;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephoneNumber(String teleNumb) {
        this.telephoneNumber = teleNumb;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int compareTo(Contact other) {
        if (!firstName.equals(other.firstName)) {
            return firstName.compareTo(other.firstName);
        } else if (!lastName.equals(other.lastName)) {
            return lastName.compareTo(other.lastName);
        } else if (!telephoneNumber.equals(other.telephoneNumber)) {
            return telephoneNumber.compareTo(other.telephoneNumber);
        } else {
            return 0;
        }

    }
}