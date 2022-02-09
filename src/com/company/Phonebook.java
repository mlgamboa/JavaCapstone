package com.company;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contacts> contactList = new ArrayList<Contacts>();


    public List<Contacts> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contacts> contactList) {
        this.contactList = contactList;
    }



    public void addContact(Contacts contactInfo){
        contactList.add(contactInfo);
    }



    public List<Contacts> viewContacts(){
        return contactList;
    }



    public boolean removeContact (String firstName){
        boolean i = false;
        for(Contacts name: contactList){
            if(name.getFirstName().equals(firstName)){
                i = true;
                contactList.remove(name);
                break;
            }
        }
        return i;
    }

}
