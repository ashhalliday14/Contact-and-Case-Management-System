/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

/**
 *
 * @author ashleigh.halliday
 */
public class Contact {
    private int contactID;
    private int customerID;
    private String methodOfContact;
    private String notes;
    private int loginID;

    //constructor
    public Contact(int contactID, int customerID, String methodOfContact, String notes, int loginID) {
        this.contactID = contactID;
        this.customerID = customerID;
        this.methodOfContact = methodOfContact;
        this.notes = notes;
        this.loginID = loginID;
    }

    //getters and setters
    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getMethodOfContact() {
        return methodOfContact;
    }

    public void setMethodOfContact(String methodOfContact) {
        this.methodOfContact = methodOfContact;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }
    
    
}
