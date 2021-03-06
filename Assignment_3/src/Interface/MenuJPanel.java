/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dedhi
 */
public class MenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    JPanel jPanelBottom;
    CarCatalog carCatalog;
    public MenuJPanel(JPanel jPanelBottom, CarCatalog carCatalog) {
        initComponents();
        this.jPanelBottom = jPanelBottom;
        this.carCatalog = carCatalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonManageCars = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();

        jButtonManageCars.setText("Manage Cars");
        jButtonManageCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageCarsActionPerformed(evt);
            }
        });

        jButtonCreate.setText("Create your Car");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButtonManageCars, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonManageCars, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(553, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Addition of CreateJPanel in the Card layout on ButtonClick event and displaying of CreateJPanel
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createJPanel = new CreateJPanel(jPanelBottom, carCatalog);
        jPanelBottom.add("CreateJPanel",createJPanel);
        CardLayout layout = (CardLayout) jPanelBottom.getLayout();
        layout.next(jPanelBottom);
    }//GEN-LAST:event_jButtonCreateActionPerformed

     //Addition of ManageJPanel in the Card layout on ButtonClick event and displaying of ManageJPanel
    private void jButtonManageCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageCarsActionPerformed
        // TODO add your handling code here:
        ManageJPanel manageJPanel = new ManageJPanel(jPanelBottom, carCatalog);
        jPanelBottom.add("ManageJPanel",manageJPanel);
        CardLayout layout = (CardLayout) jPanelBottom.getLayout();
        layout.next(jPanelBottom);
    }//GEN-LAST:event_jButtonManageCarsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonManageCars;
    // End of variables declaration//GEN-END:variables
}
