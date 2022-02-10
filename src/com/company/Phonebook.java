package com.company;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<Contacts> contactList = new ArrayList<Contacts>();

    // [SECTION] Getter and Setter
    public List<Contacts> getContactList() {
        return contactList;
    }
    public void setContactList(List<Contacts> contactList) {
        this.contactList = contactList;
    }


    // [SECTION] Adding Contacts Method
    public void addContact(Contacts contactInfo) {
        contactList.add(contactInfo);
    }



    // [SECTION] Viewing Contacts Method
    public List<Contacts> viewContacts() {
        return contactList;
    }


    // [SECTION] Removing Contacts Method
    public Contacts removeContact(String firstName) {
        Contacts remove = new Contacts();
        for (Contacts name : contactList) {
            if (name.getFirstName().equals(firstName)) {
                contactList.remove(name);
                break;
            } /*else
                remove = null;*/
        }
        return remove;
    }


    // [SECTION] Update Contacts Method
    public Contacts updateContacts (String firstName){
       Contacts update = new Contacts();
       for (Contacts edit: contactList){
           if (edit.getFirstName().equals(firstName)){
               int i = contactList.indexOf(edit);
               contactList.set(i,update);
           } /*else
               update = null;*/

       }
       return update;
    }



    // [SECTION] Search Contacts Method
    public Contacts searchContact(String firstName){
        Contacts name = new Contacts();
        for (Contacts name1:contactList){
            if (name1.getFirstName().equals(firstName)){
                name = name1;
            } /*else
                name = null;*/
        }
        return name;
    }


    // [SECTION] for existing contacts checking
    public boolean isExisting (String firstName){
        boolean existing = false;
        for (Contacts name: contactList){
            if(name.getFirstName().equalsIgnoreCase(firstName)){
                existing = true;
            }
        }
        return existing;
    }
}
