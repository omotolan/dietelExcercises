package Chapter7;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
   private ArrayList<Contacts> myContacts;

   public MobilePhone(String myNumber){
       this.myNumber = myNumber;
       this.myContacts = new ArrayList<Contacts>();
   }
    public Contacts createContact(String contactName, String phoneNumber) {
        return new Contacts(contactName, phoneNumber);
    }
   public boolean addNewContact(Contacts contacts){
       if (findContacts(contacts.getContactName()) >= 0){
       System.out.println("contact already saved");
       return false;
       }
       else
           myContacts.add(contacts);
       return true;
   }
//   private  int findContacts(Contacts contacts){
//       return this.myContacts.indexOf(contacts);
//   }

    private int findContacts(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contacts = myContacts.get(i);
            if (contacts.getContactName().equals(contactName)) {
                return (i + 1);
            }
        }
        return -1;
    }
}
