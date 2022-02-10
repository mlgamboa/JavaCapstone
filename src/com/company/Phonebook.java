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
    public boolean removeContact(String firstName) {
        boolean i = false;
        for (Contacts name : contactList) {
            if (name.getFirstName().equals(firstName)) {
                i = true;
                contactList.remove(name);
                break;
            }
        }
        return i;
    }


    // [SECTION] Update Contacts Method
    public Contacts updateContacts (String firstName){
       Contacts update = new Contacts();
       for (Contacts edit: contactList){
           if (edit.getFirstName().contains(firstName)){
               int i = contactList.indexOf(edit);
               contactList.set(i,update);
           }
       }
       return update;
    }



    // [SECTION] Search Contacts Method
    public Contacts searchContact(String firstName){
        Contacts name = new Contacts();
        for (Contacts name1:contactList){
            if (name1.getFirstName().equals(firstName)){
                name = name1;
            }
        }
        return name;
    }
}