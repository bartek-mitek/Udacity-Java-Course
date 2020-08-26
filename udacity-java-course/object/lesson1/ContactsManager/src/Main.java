public class Main {

    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact myContact = new Contact("Maciek" , "maciek@maciek.com" , "999 999 999");
        myContactsManager.addContact(myContact);


        Contact myContact2 = new Contact("Grzesiek" , "grzesiek@maciek.com" , "888 888 888");
        myContactsManager.addContact(myContact2);


        Contact myContact3 = new Contact("Bożydar" , "bozydar@maciek.com" , "777 777 777");
        myContactsManager.addContact(myContact3);

        Contact result = myContactsManager.searchContact("Grzesiek");
        System.out.println(result.phoneNumber);

    }

}
