public class ContactListTester {

    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Contact jeff = new Contact("Jeff", "epp", "123-4567-890");
        Contact mitch = new Contact("Mitch", "ape", "012-3456-789");
        Contact zeke = new Contact("Zeke", "zell", "987-6543-210");
        Contact abe = new Contact("Abe", "dick", "999-9999-999");

        contactList.add(abe);
        contactList.add(zeke);
        contactList.add(mitch);
        contactList.add(jeff);
        contactList.sortByFirstName();
        System.out.println(contactList.toString());
        contactList.sortByLastName();
        System.out.println(contactList.toString());
        contactList.sortByTelephoneNumber();
        System.out.println(contactList.toString());

    }
}