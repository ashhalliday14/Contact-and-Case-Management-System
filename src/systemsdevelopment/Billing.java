/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author ashleigh.halliday
 */
public class Billing {
    private int billingID;
    private int subscriptionID;
    private int customerID;
    private BigDecimal amount;
    private String paymentStatus;
    private String description;
    private Date paymentDate;

    //constructor
    public Billing(int billingID, int subscriptionID, int customerID, BigDecimal amount, String paymentStatus, String description, Date paymentDate) {
        this.billingID = billingID;
        this.subscriptionID = subscriptionID;
        this.customerID = customerID;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.description = description;
        this.paymentDate = paymentDate;
    }

    //getters and setters
    public int getBillingID() {
        return billingID;
    }

    public void setBillingID(int billingID) {
        this.billingID = billingID;
    }

    public int getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    
}
