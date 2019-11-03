/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dedhi
 */
public class AccountMngWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountMngWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    /*public AccountMngWorkAreaJPanel() {
        initComponents();
    }*/
    AccountMngWorkAreaJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageAccount = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));

        btnManageAccount.setText("Manage Account");
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });

        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        CreateAccountJPanel createAccount = new CreateAccountJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("CreatedAccountJPanel",createAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        // TODO add your handling code here:
        ManageAccountJPanel manageAccount = new ManageAccountJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("ManageAccountJPanel",manageAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnManageAccount;
    // End of variables declaration//GEN-END:variables
}