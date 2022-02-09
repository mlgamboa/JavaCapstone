package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner appScanner = new Scanner(System.in);

        Phonebook myAddContacts = new Phonebook();
        int i = 0;
        while(i==0){
            System.out.println("Welcome to Phone Book Console App!");
            System.out.println("What would you like to do?");
            System.out.println("[1] Add Contact [2] Display all Contacts [3] Remove Contact");
            System.out.println("===============================");
            System.out.println("Pick a number: ");
            int n = Integer.parseInt(appScanner.nextLine());

            // [SECTION] Adding Contacts

            if(n == 1){
                Contacts myContacts = new Contacts();
                System.out.println("Please Input Contact Details: ");
                System.out.println("Enter the First Name: ");
                myContacts.setFirstName(appScanner.nextLine());
                System.out.println("Enter the Last Name: ");
                myContacts.setLastName(appScanner.nextLine());
                System.out.println("Enter the Phone No. : ");
                myContacts.setPhoneNumber(Long.parseLong(appScanner.nextLine()));
                System.out.println("Enter Email Address: ");
                myContacts.setEmailId(appScanner.nextLine());
                System.out.println("Enter Address");
                myContacts.setAddress(appScanner.nextLine());

                myAddContacts.addContact(myContacts);
                System.out.println("");

                // [SECTION] Viewing Contacts
            } else if (n==2){
                System.out.println("Contact List:");
                System.out.println("");
                List<Contacts> myViewContacts = myAddContacts.viewContacts();
                for(Contacts name: myViewContacts){
                    System.out.println("First Name: "+name.getFirstName());
                    System.out.println("Last Name: "+name.getLastName());
                    System.out.println("Email Address: "+name.getEmailId());
                    System.out.println("Phone No.: " +name.getPhoneNumber());
                    System.out.println("Address: "+ name.getAddress());
                    System.out.println("");
                }

                // [SECTION] Removing Contacts
            } else if (n==3){

            }
        }
    }
}
