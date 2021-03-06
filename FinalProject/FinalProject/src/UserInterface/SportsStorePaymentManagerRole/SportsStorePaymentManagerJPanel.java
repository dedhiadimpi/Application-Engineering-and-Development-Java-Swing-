/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SportsStorePaymentManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.SportsStorePaymentOrganization;
import Business.Organization.SportsStoreFinanceOrganization;
import Business.Organization.SportsStoreManagerOrganization;
import Business.Organization.SportsStorePaymentOrganization;
import Business.Organization.TrekPaymentOrganization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ConfirmPaymentWorkRequest;
import Business.WorkQueue.SportsStoreConfirmPaymentRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.TrekManagerRole.TrekManagerWorkAreaJPanel;
import java.text.SimpleDateFormat;

/**
 *
 * @author shahd
 */
public class SportsStorePaymentManagerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SportsStorePaymentOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
      private EcoSystem business;
      private Session mailSession;
      
    /**
     * Creates new form SportsStorePaymentManagerJPanel
     */
    public SportsStorePaymentManagerJPanel(JPanel userProcessContainer, UserAccount account, SportsStorePaymentOrganization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
         this.business = business;
         System.out.println("entrpi"+enterprise);
         populateAssignToMeTable();
         populateTaskCompletedTable();
         System.out.println("work"+organization.getWorkQueue().getWorkRequestList());
         
         
         
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        assignTaskTable = new javax.swing.JTable();
        confirmPaymentButton = new javax.swing.JButton();
        declinePayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taskCompletedTable = new javax.swing.JTable();

        jTabbedPane1.setBackground(new java.awt.Color(33, 108, 205));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(33, 108, 205));

        assignTaskTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        assignTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Brand", "Order Quantity", "Order Date", "Order Total Cost", "Credit Card Holder", "Credit Card Number", "Expiry Date", "CVV", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assignTaskTable.setRowHeight(22);
        jScrollPane1.setViewportView(assignTaskTable);

        confirmPaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/TrekPaymentManagerRole/confirmPaymentButton.png"))); // NOI18N
        confirmPaymentButton.setContentAreaFilled(false);
        confirmPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPaymentButtonActionPerformed(evt);
            }
        });

        declinePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/TrekPaymentManagerRole/declinePaymentButton.png"))); // NOI18N
        declinePayment.setContentAreaFilled(false);
        declinePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declinePaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmPaymentButton)
                .addGap(229, 229, 229)
                .addComponent(declinePayment)
                .addGap(148, 148, 148))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPaymentButton)
                    .addComponent(declinePayment))
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Pick a Task", jPanel1);

        jPanel2.setBackground(new java.awt.Color(33, 108, 205));

        taskCompletedTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        taskCompletedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Brand", "Order Quantity", "Order Date", "Order Total Cost", "Credit Card Holder", "Credit Card Number", "Expiry Date", "CVV", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taskCompletedTable.setRowHeight(22);
        jScrollPane2.setViewportView(taskCompletedTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1306, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("My Tasks", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateAssignToMeTable(){
        DefaultTableModel model = (DefaultTableModel) assignTaskTable.getModel();
        model.setRowCount(0);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        for(WorkRequest request: organization.getWorkQueue().getWorkRequestList()){
           SportsStoreConfirmPaymentRequest req = (SportsStoreConfirmPaymentRequest) request;
            
            if(req.getReceiver() == null && req.getStatus().equals("Payment pending for confirmation")){
                System.out.println("req name: "+req.getCustOrder().getProduct().getName());
                Object[] row = new Object[10];
                row[0] = req.getCustOrder().getProduct().getName();
                row[1] = req.getCustOrder().getProduct().getBrandName();
                row[2] = req.getCustOrder().getQuantity();
                row[3] = f.format(req.getCustOrder().getOrderDate());
                float totalCost = req.getCustOrder().getProduct().getSellingPrice()*req.getCustOrder().getQuantity();
                row[4] = totalCost;
                row[5] = req.getCardHolderName();
                row[6] = req.getCardNumber();
                row[7] = req.getExpiryDate();
                row[8] = req.getCvv();
                row[9] = req;
                model.addRow(row);
            }
        }
    }
    
    public void populateTaskCompletedTable(){
         DefaultTableModel model = (DefaultTableModel) taskCompletedTable.getModel();
        model.setRowCount(0);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof SportsStorePaymentOrganization){
                organization = (SportsStorePaymentOrganization) org;
                break;
            }
        }
        for(WorkRequest request: organization.getWorkQueue().getWorkRequestList()){
           SportsStoreConfirmPaymentRequest req = (SportsStoreConfirmPaymentRequest) request;
            if(req.getStatus().equals("Payment Confirmed")){
               Object[] row = new Object[10];
                row[0] = req.getCustOrder().getProduct().getName();
                row[1] = req.getCustOrder().getProduct().getBrandName();
                row[2] = req.getCustOrder().getQuantity();
                row[3] = f.format(req.getCustOrder().getOrderDate());
                float totalCost = req.getCustOrder().getProduct().getSellingPrice()*req.getCustOrder().getQuantity();
                row[4] = totalCost;
                row[5] = req.getCardHolderName();
                row[6] = req.getCardNumber();
                row[7] = req.getExpiryDate();
                row[8] = req.getCvv();
                row[9] = req;
                model.addRow(row);
            }
        }
    
    }
    
    private void setMailServerProperties()
    {
        Properties emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        mailSession = Session.getDefaultInstance(emailProperties, null);
    }
 
    private MimeMessage draftEmailMessageConfirm(String userName) throws AddressException, MessagingException
    {
        String[] toEmails = { userName };
        String emailSubject = "Sports Product Payment Received";
        String emailBody = "This is to notify that your payment for Sports product is received. The product is ready to be delivered<br><br>Regards,<br>"+enterprise.getName();
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }
    
    private MimeMessage draftEmailMessageDecline(String reason, String userName) throws AddressException, MessagingException
    {
        String[] toEmails = { userName };
        String emailSubject = "Sports Product Payment Declined";
        String emailBody = "This is to notify that your Sports Product payment is declined because of following reason:<br>"+reason+"<br><br>Please contact the store on (857)-800-23368 for further details.<br><br>Regards,<br>"+enterprise.getName();
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }
 
    private void sendEmailConfirm(String userName) throws AddressException, MessagingException
    {
        /**
         * Sender's credentials
         * */
        String fromUser = "dedhiadimpi@gmail.com";
        String fromUserEmailPassword = "dimpi@95";
 
        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessageConfirm(userName);
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
    
    private void sendEmailDecline(String reason,String userName) throws AddressException, MessagingException
    {
        /**
         * Sender's credentials
         * */
        String fromUser = "dedhiadimpi@gmail.com";
        String fromUserEmailPassword = "dimpi@95";
 
        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessageDecline(reason,userName);
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
    private void confirmPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPaymentButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = assignTaskTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a payment for confirmation","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SportsStoreConfirmPaymentRequest req = (SportsStoreConfirmPaymentRequest)assignTaskTable.getValueAt(selectedRow, 9);
        req.setReceiver(userAccount);
        req.setStatus("Payment Confirmed");
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof CustomerOrganization){
                CustomerOrganization customerOrganization = (CustomerOrganization) org;
                customerOrganization.getOrderDir().getOrderList().add(req.getCustOrder());
                System.out.println("customerOrg: "+customerOrganization);
                break;
            }
        }
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof SportsStoreManagerOrganization){
                SportsStoreManagerOrganization sportsStoreManagerOrganization = (SportsStoreManagerOrganization) org;
                for(Product prod : sportsStoreManagerOrganization.getProdDir().getProductList()){
                    if(req.getCustOrder().getProduct().equals(prod)){
                            prod.setRemainingQuantity(prod.getRemainingQuantity()-req.getCustOrder().getQuantity());
                    }
                }
                break;
            }
        }

        populateAssignToMeTable();
        populateTaskCompletedTable();
        JOptionPane.showMessageDialog(null, "Payment confirmed");
        try {
            System.out.println("SimpleEmail Start"); 
            setMailServerProperties();
            draftEmailMessageConfirm(req.getCustOrder().getCustAccount().getUsername());
              sendEmailConfirm(req.getCustOrder().getCustAccount().getUsername());
              JOptionPane.showMessageDialog(null, "Email sent successfully");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Email ID");
            Logger.getLogger(TrekManagerWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmPaymentButtonActionPerformed

    private void declinePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declinePaymentActionPerformed
        // TODO add your handling code here:
        int selectedRow = assignTaskTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a payment to decline","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        String reason = JOptionPane.showInputDialog("Please enter a reason for declining the payment");
         if(reason.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a valid reason");
            return;
        }
        SportsStoreConfirmPaymentRequest req = (SportsStoreConfirmPaymentRequest)assignTaskTable.getValueAt(selectedRow, 9);
        req.setReceiver(userAccount);
        req.setStatus("Payment Declined");
        populateAssignToMeTable();
        populateTaskCompletedTable();
        JOptionPane.showMessageDialog(null, "Payment Declined");
        try {
            System.out.println("SimpleEmail Start"); 
            setMailServerProperties();
            draftEmailMessageDecline(reason,req.getCustOrder().getCustAccount().getUsername());
              sendEmailDecline(reason,req.getCustOrder().getCustAccount().getUsername());
              JOptionPane.showMessageDialog(null, "Email sent successfully");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Email ID");
            Logger.getLogger(TrekManagerWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_declinePaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable assignTaskTable;
    private javax.swing.JButton confirmPaymentButton;
    private javax.swing.JButton declinePayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable taskCompletedTable;
    // End of variables declaration//GEN-END:variables
}
