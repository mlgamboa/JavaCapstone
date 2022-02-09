package com.company;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contacts> myAddContacts = new ArrayList<Contacts>();


    public List<Contacts> getMyAddContacts() {
        return myAddContacts;
    }

    public void setMyAddContacts(List<Contacts> myAddContacts) {
        this.myAddContacts = myAddContacts;
    }

    public void addContact(Contacts contactInfo){
        myAddContacts.add(contactInfo);
    }

    public List<Contacts> viewContacts(){
        return myAddContacts;
    }
}
