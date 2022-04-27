/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemsdevelopment;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author ashleigh.halliday
 */
public class admin_customers_update extends javax.swing.JFrame {
    
    int currentCustomer = 0;
    ArrayList<Customer> customers = new ArrayList<Customer>();
    DefaultComboBoxModel genderTypeModel = new DefaultComboBoxModel();

    /**
     * Creates new form admin_customers_update
     */
    public admin_customers_update() {
        initComponents();
        refreshData();
    }
    
    //refresh data from database
    public void refreshData(){
        try {
            admin_customers ac = new admin_customers();
            String customerID = (ac.txtCustomerID.getText());
            JOptionPane.showMessageDialog(null, "cus id " + customerID);
            //JOptionPane.showMessageDialog(null, "clear array");
            customers.clear(); //clear users array list
            
            //JOptionPane.showMessageDialog(null, "string sql get types");
            String sqlGetTypes = "SELECT * FROM tbl_customer WHERE customerID = ?"; //select all data from db 
            
            //JOptionPane.showMessageDialog(null, "connection");
            Connection conn = db.Connect(); //connection to db
            
            //JOptionPane.showMessageDialog(null, "ps");
            PreparedStatement ps = conn.prepareStatement(sqlGetTypes);
            
            ps.setString(1, customerID);
            
            ResultSet rs = ps.executeQuery();
            
            //JOptionPane.showMessageDialog(null, "while loop");
            while (rs.next()){ //filter through users
                Customer c = new Customer(rs.getInt("customerID"), rs.getString("firstName"), rs.getString("surname"), rs.getString("dob"),
                            rs.getString("gender"), rs.getString("addressLine1"), rs.getString("town"), rs.getString("county"), rs.getString("postcode"),
                            rs.getString("phoneNumber"), rs.getString("emailAddress"), rs.getString("nameOnCard"), rs.getString("cardNumber"), rs.getString("expiryDate"), rs.getInt("CVVNumber"));
                customers.add(c);
                //JOptionPane.showMessageDialog(null, c);
            }
            
            //JOptionPane.showMessageDialog(null, "execute query");
            rs = ps.executeQuery();
            
            this.comboBoxGender.removeAllItems();
            
            //JOptionPane.showMessageDialog(null, "while 2.0");
            while(rs.next()){
                genderTypeModel.addElement(new ComboBoxItem(rs.getInt("customerID"), rs.getString("gender")));
            }
            //JOptionPane.showMessageDialog(null, "for loop");
            JOptionPane.showMessageDialog(null, genderTypeModel);
            for (int i = 0; i < genderTypeModel.getSize(); i++){
                //JOptionPane.showMessageDialog(null, i);
                ComboBoxItem cbi = (ComboBoxItem)genderTypeModel.getElementAt(i); //create object of type combo box item
                if (cbi.getId() == customers.get(currentCustomer).getCustomerID()){
                    genderTypeModel.setSelectedItem(cbi);
                }
            }
            
            this.comboBoxGender.setModel(genderTypeModel);
            
            //admin_customers ac = new admin_customers();
            //this.txtCustomerID.setText(String.valueOf(customers.get(currentCustomer).getCustomerID()));
            //this.txtEnterFirstName.setText(ac.txtFirstName.getText());
            //this.txtEnterSurname.setText(ac.txtSurname.getText());
            //this.txtEnterDOB.setText(ac.txtDOB.getText());
            //this.txtEnterAddressLine1.setText(ac.txtAddressLine1.getText());
            //this.txtEnterTown.setText(ac.txtTown.getText());
            //this.txtEnterCounty.setText(ac.txtCounty.getText());
            //this.txtEnterPostcode.setText(ac.txtPostcode.getText());
            //this.txtEnterPhoneNumber.setText(ac.txtPhoneNumber.getText());
            //this.txtEnterEmailAddress.setText(ac.txtEmailAddress.getText());
            //this.txtEnterNameOnCard.setText(String.valueOf(customers.get(currentCustomer).getNameOnCard()));
            //this.txtEnterCardNumber.setText(String.valueOf(customers.get(currentCustomer).getCardNumber()));
            //this.txtEnterExpiryDate.setText(String.valueOf(customers.get(currentCustomer).getExpiryDate()));
            //this.txtEnterCVVNumber.setText(String.valueOf(customers.get(currentCustomer).getCVVNumber()));
            
            //this.txtCustomerID.setText(String.valueOf(customers.get(currentCustomer).getCustomerID()));
            this.txtEnterFirstName.setText(String.valueOf(customers.get(currentCustomer).getFirstName()));
            this.txtEnterSurname.setText(String.valueOf(customers.get(currentCustomer).getSurname()));
            this.txtEnterDOB.setText(String.valueOf(customers.get(currentCustomer).getDob()));
            this.txtEnterAddressLine1.setText(String.valueOf(customers.get(currentCustomer).getAddressLine1()));
            this.txtEnterTown.setText(String.valueOf(customers.get(currentCustomer).getTown()));
            this.txtEnterCounty.setText(String.valueOf(customers.get(currentCustomer).getCounty()));
            this.txtEnterPostcode.setText(String.valueOf(customers.get(currentCustomer).getPostcode()));
            this.txtEnterPhoneNumber.setText(String.valueOf(customers.get(currentCustomer).getPhoneNumber()));
            this.txtEnterEmailAddress.setText(String.valueOf(customers.get(currentCustomer).getEmailAddress()));
            this.txtEnterNameOnCard.setText(String.valueOf(customers.get(currentCustomer).getNameOnCard()));
            this.txtEnterCardNumber.setText(String.valueOf(customers.get(currentCustomer).getCardNumber()));
            this.txtEnterExpiryDate.setText(String.valueOf(customers.get(currentCustomer).getExpiryDate()));
            this.txtEnterCVVNumber.setText(String.valueOf(customers.get(currentCustomer).getCVVNumber()));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get customer information at this time. Error: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdateCustomerInformation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        lblCustomerDetails = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblCounty = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtEnterFirstName = new javax.swing.JTextField();
        txtEnterSurname = new javax.swing.JTextField();
        txtEnterDOB = new javax.swing.JTextField();
        txtEnterAddressLine1 = new javax.swing.JTextField();
        txtEnterTown = new javax.swing.JTextField();
        txtEnterCounty = new javax.swing.JTextField();
        txtEnterPostcode = new javax.swing.JTextField();
        txtEnterPhoneNumber = new javax.swing.JTextField();
        txtEnterEmailAddress = new javax.swing.JTextField();
        comboBoxGender = new javax.swing.JComboBox<>();
        lblPaymentInformation = new javax.swing.JLabel();
        lblNameOnCard = new javax.swing.JLabel();
        lblCVVNumber = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        lblExpiryDate = new javax.swing.JLabel();
        txtEnterNameOnCard = new javax.swing.JTextField();
        txtEnterCardNumber = new javax.swing.JTextField();
        txtEnterCVVNumber = new javax.swing.JTextField();
        txtEnterExpiryDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUpdateCustomerInformation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblUpdateCustomerInformation.setText("Update Customer Information");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setText("Update Customer");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        lblCustomerDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCustomerDetails.setText("Customer Details:");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");

        lblSurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSurname.setText("Surname:");

        lblDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDOB.setText("DOB:");

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGender.setText("Gender:");

        lblAddressLine1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddressLine1.setText("Address Line 1:");

        lblTown.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTown.setText("Town:");

        lblCounty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCounty.setText("County:");

        lblPostcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPostcode.setText("Postcode:");

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailAddress.setText("Email Address:");

        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        lblPaymentInformation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPaymentInformation.setText("Payment Information:");

        lblNameOnCard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNameOnCard.setText("Name on Card:");

        lblCVVNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCVVNumber.setText("CVV Number:");

        lblCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCardNumber.setText("Card Number:");

        lblExpiryDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExpiryDate.setText("Expiry Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerDetails)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFirstName)
                                            .addComponent(lblSurname)
                                            .addComponent(lblDOB)
                                            .addComponent(lblGender)
                                            .addComponent(lblAddressLine1)
                                            .addComponent(lblTown)
                                            .addComponent(lblCounty)
                                            .addComponent(lblPostcode)
                                            .addComponent(lblPhoneNumber)
                                            .addComponent(lblEmailAddress))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEnterFirstName)
                                            .addComponent(txtEnterSurname)
                                            .addComponent(txtEnterDOB)
                                            .addComponent(txtEnterAddressLine1)
                                            .addComponent(txtEnterTown)
                                            .addComponent(txtEnterCounty)
                                            .addComponent(txtEnterPostcode)
                                            .addComponent(txtEnterPhoneNumber)
                                            .addComponent(txtEnterEmailAddress)
                                            .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNameOnCard)
                                        .addGap(57, 57, 57)
                                        .addComponent(txtEnterNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCVVNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPaymentInformation)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCardNumber)
                                                    .addComponent(lblExpiryDate))
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEnterExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEnterCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEnterCVVNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(btnUpdateCustomer)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblUpdateCustomerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addGap(5, 5, 5)
                .addComponent(lblUpdateCustomerInformation)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaymentInformation, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCustomerDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtEnterFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameOnCard)
                    .addComponent(txtEnterNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtEnterSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCardNumber)
                    .addComponent(txtEnterCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtEnterDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpiryDate)
                    .addComponent(txtEnterExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCVVNumber)
                    .addComponent(txtEnterCVVNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtEnterAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtEnterTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCounty)
                    .addComponent(txtEnterCounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostcode)
                    .addComponent(txtEnterPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtEnterPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEnterEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnUpdateCustomer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //return back to users page
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        new admin_customers().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        try{
            JOptionPane.showMessageDialog(null, "cbi");
            //ComboBoxItem gender = (ComboBoxItem)genderTypeModel.getSelectedItem(); //get the users role from combo box

            JOptionPane.showMessageDialog(null, "conn");
            Connection conn = db.Connect();

            JOptionPane.showMessageDialog(null, "sql UPDATE");
            String sqlInsertUser = "UPDATE tbl_customer "
                    + "             SET    (firstName, surname, dob, gender, addressLine1, town, county, postcode, phoneNumber, emailAddress, nameOnCard, cardNumber, expiryDate, cvvNumber)"
                    + "             VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            JOptionPane.showMessageDialog(null, "ps");
            PreparedStatement ps = conn.prepareStatement(sqlInsertUser);
            ps.setString(1, this.txtEnterFirstName.getText());
            ps.setString(2, this.txtEnterSurname.getText());
            ps.setString(3, this.txtEnterDOB.getText());
            //ps.setString(4, String.valueOf(gender));
            ps.setString(5, this.txtEnterAddressLine1.getText());
            ps.setString(6, this.txtEnterTown.getText());
            ps.setString(7, this.txtEnterCounty.getText());
            ps.setString(8, this.txtEnterPostcode.getText());
            ps.setString(9, this.txtEnterPhoneNumber.getText());
            ps.setString(10, this.txtEnterEmailAddress.getText());
            ps.setString(11, this.txtEnterNameOnCard.getText());
            ps.setString(12, this.txtEnterCardNumber.getText());
            ps.setString(13, this.txtEnterExpiryDate.getText());
            ps.setString(14, this.txtEnterCVVNumber.getText());

            JOptionPane.showMessageDialog(null, sqlInsertUser);

            JOptionPane.showMessageDialog(null, "execute me pls");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Customer has been successfully created");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Customer could not be created. Please try again. Error: " + e);
        }

        admin_customers ac = new admin_customers();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_customers_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_customers_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_customers_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_customers_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_customers_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateCustomer;
    protected javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblCVVNumber;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblCounty;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblExpiryDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblNameOnCard;
    private javax.swing.JLabel lblPaymentInformation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUpdateCustomerInformation;
    protected javax.swing.JTextField txtEnterAddressLine1;
    private javax.swing.JTextField txtEnterCVVNumber;
    private javax.swing.JTextField txtEnterCardNumber;
    protected javax.swing.JTextField txtEnterCounty;
    protected javax.swing.JTextField txtEnterDOB;
    protected javax.swing.JTextField txtEnterEmailAddress;
    private javax.swing.JTextField txtEnterExpiryDate;
    protected javax.swing.JTextField txtEnterFirstName;
    private javax.swing.JTextField txtEnterNameOnCard;
    protected javax.swing.JTextField txtEnterPhoneNumber;
    protected javax.swing.JTextField txtEnterPostcode;
    protected javax.swing.JTextField txtEnterSurname;
    protected javax.swing.JTextField txtEnterTown;
    // End of variables declaration//GEN-END:variables
}
