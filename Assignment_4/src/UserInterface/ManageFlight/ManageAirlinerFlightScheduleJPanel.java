/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlight;

import Business.Abstract.User;
import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Flight.Flight;
import Business.Flight.FlightDirectory;
import UserInterface.LoginScreen;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahd
 */
public class ManageAirlinerFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirlinerFlightScheduleJPanel
     */
    private JPanel rightPanel;
    private FlightDirectory flightDir;
    private AirlinerDirectory airlineDir;
    private JPanel jPanelLeft;
    DefaultTableModel dtm;
    public ManageAirlinerFlightScheduleJPanel(JPanel rightPanel,JPanel jPanelLeft,FlightDirectory flightDir, AirlinerDirectory airlineDir) {
        this.rightPanel=rightPanel;
        this.flightDir=flightDir;
        this.airlineDir=airlineDir;
        this.jPanelLeft = jPanelLeft;        
        initComponents();
        Airliner a = (Airliner)airlinerComboBox.getSelectedItem();

        populate(a);
        initialize();
    }
    
    public void populate(){
         dtm = (DefaultTableModel)flightTable.getModel();
         dtm.setRowCount(0);
         
        for(Flight f : flightDir.getFlightList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=f;
            row[1]=f.getSource();
            row[2]=f.getDestination();
            row[3]=f.getFlightDuration();
            Date d = f.getDate_of_departure();
            DateFormat sd = new SimpleDateFormat("dd/MM/YYYY");    
            row[4]= sd.format(d);
            d = f.getDate_of_arrival();
            row[5] = sd.format(d);
            dtm.addRow(row);
            
        }
    }
    public void populate(Airliner result){
         dtm = (DefaultTableModel)flightTable.getModel();
         dtm.setRowCount(0);
         
        for(Flight f : flightDir.getFlightList()){
            if(f.getAirlinerName()==result){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=f;
            row[1]=f.getSource();
            row[2]=f.getDestination();
            row[3]=f.getFlightDuration();
            Date d = f.getDate_of_departure();
            DateFormat sd = new SimpleDateFormat("dd/MM/YYYY");    
            row[4]= sd.format(d);
            d = f.getDate_of_arrival();
            row[5] = sd.format(d);
            dtm.addRow(row);
            }
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

        flightScheduleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        btnViewFlight = new javax.swing.JButton();
        btnCreateFlight = new javax.swing.JButton();
        airlinerLabel = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox<Airliner>();
        btnDeleteFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut2 = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();

        flightScheduleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flightScheduleLabel.setText("Flight Schedule of Selected Airliner");

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightName", "Source", "Destination", "Flight Duration", "Date Of Departure", "Date of Arrival"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTable);
        if (flightTable.getColumnModel().getColumnCount() > 0) {
            flightTable.getColumnModel().getColumn(0).setResizable(false);
            flightTable.getColumnModel().getColumn(1).setResizable(false);
            flightTable.getColumnModel().getColumn(2).setResizable(false);
            flightTable.getColumnModel().getColumn(3).setResizable(false);
            flightTable.getColumnModel().getColumn(4).setResizable(false);
            flightTable.getColumnModel().getColumn(5).setResizable(false);
        }

        btnViewFlight.setText("View Flights");
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        btnCreateFlight.setText("Create New Flight");
        btnCreateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFlightActionPerformed(evt);
            }
        });

        airlinerLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        airlinerLabel.setText("Airliner Name");

        airlinerComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                airlinerComboBoxItemStateChanged(evt);
            }
        });

        btnDeleteFlight.setText("Delete Flights");
        btnDeleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFlightActionPerformed(evt);
            }
        });

        jLabel2.setText("admin");

        btnLogOut2.setText("Log Out");
        btnLogOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut2ActionPerformed(evt);
            }
        });

        backBtn1.setText("<<Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(flightScheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(airlinerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(airlinerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(flightScheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_airlinerComboBoxItemStateChanged
        // TODO add your handling code here:
       //String result=(String)airlinerComboBox.getSelectedItem();
        Airliner a = (Airliner)airlinerComboBox.getSelectedItem();
        populate(a);
        
        
    }//GEN-LAST:event_airlinerComboBoxItemStateChanged

    private void btnCreateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFlightActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner)airlinerComboBox.getSelectedItem();
        CreateAirlineFlightScheduleJPanel panel = new CreateAirlineFlightScheduleJPanel(rightPanel, jPanelLeft,flightDir, airliner);
        rightPanel.add("flightDir",panel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnCreateFlightActionPerformed

    private void btnDeleteFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFlightActionPerformed
        // TODO add your handling code here:
        int selectedRow = flightTable.getSelectedRow();
        System.out.println(selectedRow);
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Flight","Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Flight?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Flight flight = (Flight) flightTable.getValueAt(selectedRow, 0);
                flightDir.getFlightList().remove(flight);
                JOptionPane.showMessageDialog(null, "Airliner deleted successfully!","Information", JOptionPane.INFORMATION_MESSAGE);
                populate();
            }
        }
    }//GEN-LAST:event_btnDeleteFlightActionPerformed

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
        Airliner a = (Airliner)airlinerComboBox.getSelectedItem();
         int selectedRow = flightTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an Airliner","Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            Flight flight = (Flight) flightTable.getValueAt(selectedRow, 0);
            rightPanel.add(new ViewAirlinerFlightScheduleJPanel(rightPanel, jPanelLeft,flight ,flightDir,a));
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void btnLogOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut2ActionPerformed
        // TODO add your handling code here:
         for(Component comp : rightPanel.getComponents()){
            if(comp instanceof LoginScreen){
                
            } else{
                rightPanel.remove(comp);
            }
            CardLayout layout = (CardLayout)this.rightPanel.getLayout();
            layout.previous(rightPanel);
        }
        for(Component comp : jPanelLeft.getComponents()){
            if(comp instanceof JButton)
                comp.setVisible(false);
        }
    }//GEN-LAST:event_btnLogOut2ActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        this.rightPanel.remove(this);
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtn1ActionPerformed

    
   

    private void initialize(){
        if(!airlineDir.getAirlinerDirectory().isEmpty())
        airlinerComboBox.removeAllItems();
                for(Airliner a : airlineDir.getAirlinerDirectory()){
                    airlinerComboBox.addItem(a);
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Airliner> airlinerComboBox;
    private javax.swing.JLabel airlinerLabel;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton btnCreateFlight;
    private javax.swing.JButton btnDeleteFlight;
    private javax.swing.JButton btnLogOut2;
    private javax.swing.JButton btnViewFlight;
    private javax.swing.JLabel flightScheduleLabel;
    private javax.swing.JTable flightTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
