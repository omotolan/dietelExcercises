package Chapter7.Phon;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public void createContact(String contactName, String phoneNumber) {
        Contacts contacts = new Contacts(contactName, phoneNumber);
        addNewContact(contacts, phoneNumber);

    }

    private void addNewContact(Contacts contact, String phoneNumber) {
        if (validateDuplicateNumber(phoneNumber)) {
            System.out.println("contact already exists");
        } else {
            myContacts.add(contact);
        }

    }

    private boolean validateDuplicateNumber(String phoneNumber) {
        for (Contacts contacts : myContacts) {
            if (contacts.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;

    }

//    private boolean validateContactName(String contactName) {
//        for (int i = 0; i < myContacts.size(); i++) {
//            Contacts contacts = myContacts.get(i);
//            if (contacts.getContactName().equals(contactName)) {
//                return true;
//            }
//        }
//        return false;
//
//    }

    public void findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contact = myContacts.get(i);
            if (contact.getContactName().equals(contactName)){
                System.out.println(contact.getContactName() + " " + contact.getPhoneNumber());
            }
        }

    }
//    public void updateContact(String oldContactName, Contacts newContact){
//        for (int i = 0; i < myContacts.size(); i++) {
//            Contacts contact = myContacts.get(i);
//            if (contact.getContactName().equals(oldContactName)){
//                myContacts.set(oldContactName,newContact)
//            }
//        }
//
//    }

    public int numberOfContacts() {
        return myContacts.size();
    }
}
