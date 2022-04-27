/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

/**
 *
 * @author ashleigh.halliday
 */
public class Case {
    private int caseID;
    private int customerID;
    private int contactID;
    private String actionRequired;
    private String notes;
    private int loginID;

    //constructor
    public Case(int caseID, int customerID, int contactID, String actionRequired, String notes, int loginID) {
        this.caseID = caseID;
        this.customerID = customerID;
        this.contactID = contactID;
        this.actionRequired = actionRequired;
        this.notes = notes;
        this.loginID = loginID;
    }

    //getters and setters
    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
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
