/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

import java.util.Date;

/**
 *
 * @author ashleigh.halliday
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String surname;
    private String dob;
    private String gender;
    private String addressLine1;
    private String town;
    private String county;
    private String postcode;
    private String phoneNumber;
    private String emailAddress;
    private String nameOnCard;
    private String cardNumber;
    private String expiryDate;
    private int CVVNumber;

    //constructor
    public Customer(int customerID, String firstName, String surname, String dob, String gender, String addressLine1, String town, String county, String postcode, String phoneNumber, String emailAddress, String nameOnCard, String cardNumber, String expiryDate, int CVVNumber) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.gender = gender;
        this.addressLine1 = addressLine1;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVVNumber = CVVNumber;
    }
    

    //getters and setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCVVNumber() {
        return CVVNumber;
    }

    public void setCVVNumber(int CVVNumber) {
        this.CVVNumber = CVVNumber;
    }
}

    