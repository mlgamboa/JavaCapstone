package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner appScanner = new Scanner(System.in);

        Phonebook contactList = new Phonebook();
        int i = 0;
        while(i==0){
            System.out.println("Welcome to Phone Book Console App!");
            System.out.println("What would you like to do?");
            System.out.println("[1] Add Contact(s) [2] Display all Contact(s) [3] Remove Contact(s) [4] Update Contact(s) [5] Search Contact(s) [6] Exit");
            System.out.println("===============================");
            System.out.println("Pick a number: ");
            int n = Integer.parseInt(appScanner.nextLine());

            // [SECTION] Adding Contacts

            if(n == 1){
                Contacts myContacts = new Contacts();
                System.out.println("Please Input Contact Details: ");
                System.out.println("Enter the First Name: ");
                myContacts.setFirstName(appScanner.nextLine().trim());
                System.out.println("Enter the Last Name: ");
                myContacts.setLastName(appScanner.nextLine().trim());
                System.out.println("Enter the Phone No. : ");
                myContacts.setPhoneNumber(Long.parseLong(appScanner.nextLine().trim()));
                System.out.println("Enter Email Address: ");
                myContacts.setEmailId(appScanner.nextLine().trim());
                System.out.println("Enter Address");
                myContacts.setAddress(appScanner.nextLine().trim());

                contactList.addContact(myContacts);
                System.out.println("");

                // [SECTION] Viewing Contacts
            } else if (n==2){
                System.out.println("Contact List:");
                System.out.println("");
                List<Contacts> myViewContacts = contactList.viewContacts();
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
                System.out.println("Enter first name of contact(s) you want to remove:");
                String firstName = appScanner.nextLine();
                System.out.println("Are you sure you want to remove "+firstName+" from the contact list? (Y/N)");
                char choice = appScanner.nextLine().charAt(0);
                if(choice == 'Y'){
                    boolean name = contactList.removeContact(firstName);
                    if (name){
                        System.out.println("Successfully removed contact");
                    } else
                        System.out.println("No contact(s) found");
                }else if(choice =='N'){
                    System.out.println("Contact removal cancelled");
                }else
                    System.out.println("Invalid input");

                // [SECTION] Updating Contacts
            } else if (n == 4){

            }else if (n == 6){
                System.out.println("Thank you. Goodbye!");
                System.exit(0);



            }
        }
    }
}
