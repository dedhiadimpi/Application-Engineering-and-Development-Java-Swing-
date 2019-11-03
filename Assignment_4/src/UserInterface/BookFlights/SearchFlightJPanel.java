/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BookFlights;

import Business.Abstract.User;
import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Flight.Flight;
import Business.Flight.FlightDirectory;
import Business.FlightBooking.BookingDirectory;
import Business.User.Customer;
import UserInterface.LoginScreen;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shahd
 */
public class SearchFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchFlightJPanel
     */
    private JPanel rightPanel;
    private FlightDirectory flightdir;
    private Flight flight;
    private AirlinerDirectory airlineDir;
    private User userName;
    private BookingDirectory bookingDir;
    private JPanel jPanelLeft;
    public SearchFlightJPanel(JPanel rightPanel,JPanel jPanelLeft,FlightDirectory flightDirectory,AirlinerDirectory airlinerDirectory, User userName,BookingDirectory bookingDir) {
        initComponents();
        this.rightPanel=rightPanel;
        this.flight=flight;
        this.airlineDir=airlinerDirectory;
        this.flightdir=flightDirectory;
        this.userName = userName;
        this.bookingDir = bookingDir;
        this.jPanelLeft = jPanelLeft;
        initialize();
        lblUserName.setText(userName.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timeFrameCombo = new javax.swing.JComboBox<>();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        destinationCombo = new javax.swing.JComboBox<>();
        sourceCombo = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Search Flights to Book");

        jLabel2.setText("Select Source");

        jLabel3.setText("Select Destination");

        jLabel4.setText("Date you want to Fly");

        jLabel5.setText("Preffered TimeFrame");

        timeFrameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Morning Flight", "Evening Flight", "Overnight Flight" }));

        destinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sourceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search Flights");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeFrameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sourceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(sourceCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeFrameCombo))
                .addGap(55, 55, 55)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String source=(String)sourceCombo.getSelectedItem();
        String destination=(String)destinationCombo.getSelectedItem();
        String timeFrame=(String)timeFrameCombo.getSelectedItem();
        
        if(source.equalsIgnoreCase(destination)){
            JOptionPane.showMessageDialog(null,"Source and Destination cannot be same","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            datePicker.getDate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter Date of Travel","Warning",JOptionPane.WARNING_MESSAGE);
            return; 
        }   
       
        Date dateOfFlight= datePicker.getDate();
        FlightFoundJPanel panel = null;
        try {
            panel = new FlightFoundJPanel(rightPanel,jPanelLeft,flightdir,airlineDir,source,destination,timeFrame,dateOfFlight,userName, bookingDir);
        } catch (ParseException ex) {
            Logger.getLogger(SearchFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        rightPanel.add("FlightFoundJPanel",panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        MainJFrame.setUserName(null);
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
    }//GEN-LAST:event_btnLogoutActionPerformed

 private void initialize(){
        ArrayList<String> temp = new ArrayList<String>();
        if(!flightdir.getFlightList().isEmpty())
        sourceCombo.removeAllItems();
                for(Flight f : flightdir.getFlightList()){
                    if(!temp.contains(f.getSource()))
                        temp.add(f.getSource());
                }
                for(String s : temp){
                    sourceCombo.addItem(s);
                }
                
        temp.clear();
        if(!flightdir.getFlightList().isEmpty())
        destinationCombo.removeAllItems();
                for(Flight f : flightdir.getFlightList()){
                    
                    if(!temp.contains(f.getDestination()))
                        temp.add(f.getDestination());
                }
                
                for(String d : temp){
                    destinationCombo.addItem(d);
                }                   
                  
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JComboBox<String> destinationCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JComboBox<String> sourceCombo;
    private javax.swing.JComboBox<String> timeFrameCombo;
    // End of variables declaration//GEN-END:variables
}


    