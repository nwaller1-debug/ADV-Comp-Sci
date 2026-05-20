import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList {

    private ArrayList<Contact> ContactList;

    public ContactList() {
        this.ContactList = new ArrayList<Contact>();
    }

    public Contact searchContacts(String telephoneNumber) {
        for (Contact contacts : ContactList) {
            if (telephoneNumber.equals(contacts.getTelephoneNumber())) {
                return contacts;
            }
        }
        return null;
    }
    private int findFirstInsertLocation(String name, ArrayList<Contact> temp) {
        for (int i = 0; i < temp.size(); i++) {
            if (name.compareTo(temp.get(i).getFirstName()) == 0) {
                return i;

            }
            if (name.compareTo(temp.get(i).getFirstName()) < 0) {
                return i;

            }
        }
        if (temp.size() == 0) {
            return 0;
        } else {
            return temp.size();
        }
    }

    private int findLastInsertLocation(String name, ArrayList<Contact> temp) {
        for (int i = 0; i < temp.size(); i++) {
            if (name.compareTo(temp.get(i).getLastName()) == 0) {
                return i;

            }
            if (name.compareTo(temp.get(i).getLastName()) < 0) {
                return i;

            }
        }
        if (temp.size() == 0) {
            return 0;
        } else {
            return temp.size();
        }
    }

    private int findTeleInsertLocation(String name, ArrayList<Contact> temp) {
        for (int i = 0; i < temp.size(); i++) {
            if (name.compareTo(temp.get(i).getTelephoneNumber()) == 0) {
                return i;

            }
            if (name.compareTo(temp.get(i).getTelephoneNumber()) < 0) {
                return i;

            }
        }
        if (temp.size() == 0) {
            return 0;
        } else {
            return temp.size();
        }
    }

    public boolean add(Contact contact) {
        for (Contact contacts : ContactList) {
            if (contacts.getTelephoneNumber().equals(contact.getTelephoneNumber())) {
                return false;
            }
        }
        ContactList.add(contact);
        return true;
    }

    public boolean remove(Contact contact) {
        int x = ContactList.size();
        ContactList.remove(contact);
        if (ContactList.size() == x) {
            return false;
        } else {
            return true;
        }
    }

    public void sortByFirstName() {
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for (Contact conta : ContactList) {
            temp.add(findFirstInsertLocation(conta.getFirstName(), temp), conta);
        }
        ContactList = new ArrayList<Contact>(temp);
    }

    public void sortByLastName() {
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for (Contact conta : ContactList) {
            temp.add(findLastInsertLocation(conta.getLastName(), temp), conta);
        }
        ContactList = new ArrayList<Contact>(temp);
    }

    public void sortByTelephoneNumber() {
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for (Contact conta : ContactList) {
            temp.add(findTeleInsertLocation(conta.getTelephoneNumber(), temp), conta);
        }
        ContactList = new ArrayList<Contact>(temp);
    }

    public ArrayList<Contact> getContactList() {
        return ContactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        ContactList = contactList;
    }

    public Contact get(int index) {
        return ContactList.get(index);
    }

    public int size() {
        return ContactList.size();
    }

    public String toString() {
        String y = "";
        for (Contact contacts : ContactList) {
            y += contacts.toString() + "\n";

        }
        return y;
    }

}
