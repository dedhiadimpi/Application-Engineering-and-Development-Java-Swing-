/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shahd
 */
public class SuccessScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    private JPanel jPanelRight;
    private JPanel jPanelLeft;
    private String userName;
    public SuccessScreen(JPanel jPanelRight, JPanel jPanelLeft, String userName) {
        initComponents();
        this.jPanelRight = jPanelRight;
        this.jPanelLeft = jPanelLeft;
        lblUserName.setText("Welcome "+userName+"!!!!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Welcome");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        MainJFrame.setUserName(null);
        for(Component comp : jPanelRight.getComponents()){
            if(comp instanceof LoginScreen){
                
            } else{
                jPanelRight.remove(comp);
            }
            CardLayout layout = (CardLayout)this.jPanelRight.getLayout();
            layout.previous(jPanelRight);
        }
        for(Component comp : jPanelLeft.getComponents()){
            if(comp instanceof JButton)
                comp.setVisible(false);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
