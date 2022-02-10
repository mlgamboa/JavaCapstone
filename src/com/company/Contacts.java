package com.company;

public class Contacts {

    // Properties
    private String firstName;
    private String lastName;
    private long  phoneNumber;
    private String emailId;
    private String address;

    // Constructors
    public Contacts() {
    }
    public Contacts(String firstName, String lastName, long phoneNumber, String emailId, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
    }


    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
