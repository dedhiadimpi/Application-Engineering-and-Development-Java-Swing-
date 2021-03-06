/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarCatalog;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.concurrent.ExecutionException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dedhi
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private JPanel jPanelBottom;
    private String maintanenceCertificate;
    private String availability;
    private CarCatalog carCatalog;
    public CreateJPanel(JPanel jPanelBottom, CarCatalog carCatalog) {
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

        jButtonGroupMainCerti = new javax.swing.ButtonGroup();
        jButtonGroupAvail = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jLblTitle = new javax.swing.JLabel();
        jLblManufacturerName = new javax.swing.JLabel();
        jTxtManufacturerName = new javax.swing.JTextField();
        jLblModelNum = new javax.swing.JLabel();
        jTxtModelNum = new javax.swing.JTextField();
        jTxtSerialNum = new javax.swing.JTextField();
        jLblManufacturerName2 = new javax.swing.JLabel();
        jTxtYearOfManufacture = new javax.swing.JTextField();
        jLblYearOfManufacture = new javax.swing.JLabel();
        jLblCity = new javax.swing.JLabel();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jLblNoOfSeats = new javax.swing.JLabel();
        jTxtNoOfSeats = new javax.swing.JTextField();
        jLblColor = new javax.swing.JLabel();
        jTxtColor = new javax.swing.JTextField();
        jRadioButtonNotExpired = new javax.swing.JRadioButton();
        jRadioButtonExpired = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLblDriverName = new javax.swing.JLabel();
        jTxtDriverName = new javax.swing.JTextField();
        jLblAvailability = new javax.swing.JLabel();
        jRadioButtonAvailYes = new javax.swing.JRadioButton();
        jRadioButtonAvailNo = new javax.swing.JRadioButton();
        jBtnCreate = new javax.swing.JButton();
        jLblBrand = new javax.swing.JLabel();
        jTxtBrand = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();

        jLblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLblTitle.setText("Create you Car");

        jLblManufacturerName.setText("Manufacturer Name");

        jLblModelNum.setText("Model Number");

        jLblManufacturerName2.setText("Serial Number");

        jLblYearOfManufacture.setText("Year of Manufacture");

        jLblCity.setText("City");

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Cambridge", "Quincy", "Framingham", "Somerville" }));

        jLblNoOfSeats.setText("Number of Seats");

        jLblColor.setText("Color");

        jButtonGroupMainCerti.add(jRadioButtonNotExpired);
        jRadioButtonNotExpired.setText("Not Expired");

        jButtonGroupMainCerti.add(jRadioButtonExpired);
        jRadioButtonExpired.setText("Expired");

        jLabel1.setText("Maintenance Certificate");

        jLblDriverName.setText("Driver Name");

        jLblAvailability.setText("Is your car currently available?");

        jButtonGroupAvail.add(jRadioButtonAvailYes);
        jRadioButtonAvailYes.setText("Yes");

        jButtonGroupAvail.add(jRadioButtonAvailNo);
        jRadioButtonAvailNo.setText("No");

        jBtnCreate.setText("CREATE");
        jBtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateActionPerformed(evt);
            }
        });

        jLblBrand.setText("Brand");

        jButtonBack.setText("<<Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLblDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLblAvailability)
                                .addGap(62, 62, 62)))
                        .addComponent(jTxtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack)
                        .addGap(286, 286, 286)
                        .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLblManufacturerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblManufacturerName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblYearOfManufacture, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(jLblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(jTxtYearOfManufacture)
                                    .addComponent(jTxtSerialNum)
                                    .addComponent(jTxtModelNum)
                                    .addComponent(jTxtManufacturerName)
                                    .addComponent(jTxtBrand)
                                    .addComponent(jTxtColor)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonNotExpired)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButtonExpired))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonAvailYes)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonAvailNo))
                            .addComponent(jBtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblManufacturerName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jTxtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtYearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblYearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonNotExpired)
                        .addComponent(jRadioButtonExpired))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDriverName)
                    .addComponent(jTxtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonAvailYes)
                            .addComponent(jRadioButtonAvailNo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLblAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateActionPerformed
        // TODO add your handling code here:
        //Validation of data entered by user
        String brand = jTxtBrand.getText();
        if(brand==null || brand.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid Brand Name!");
            return;
        }
        String manufacturerName = jTxtManufacturerName.getText();
        if(manufacturerName==null || manufacturerName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid Manufacturer Name!");
            return;
        }
        try{
            Integer.parseInt(jTxtModelNum.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid Model Number!");
            return;
        }
        
        try{
            Integer.parseInt(jTxtSerialNum.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid Serial Number!");
            return;
        }
        
        try{
            Integer.parseInt(jTxtYearOfManufacture.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid Year!");
            return;
        }
        
        String city = jComboBoxCity.getSelectedItem().toString();
        
        try{
            Integer.parseInt(jTxtNoOfSeats.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid Number of Seats!");
            return;
        }
        
        String color = jTxtColor.getText();
        if(color==null || color.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid Color!");
            return;
        }
        String maintenanceCertificate;
        if(jRadioButtonNotExpired.isSelected()){
            maintenanceCertificate = "notexpired";
        }else if(jRadioButtonExpired.isSelected()){
            maintenanceCertificate = "expired";
        }else{
            JOptionPane.showMessageDialog(null, "Please select an option for Maintenance Certificate!");
            return;
        }
        String driverName = jTxtDriverName.getText();
        if(driverName==null || driverName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid Driver Name!");
            return;
        }
        boolean availability = false;
        if(jRadioButtonAvailYes.isSelected()){
            availability = true;
        }else if(jRadioButtonAvailNo.isSelected()){
            availability = false;
        }else{
            JOptionPane.showMessageDialog(null, "Please select an option for Availability!");
            return;
        }
        //Addition of Car object to the Car Catalog
        Car car = carCatalog.addCar();
        //Setting the attributes of car object as per input given by the user
        car.setBrand(brand);
        car.setManufacturerName(manufacturerName);
        car.setModelNumber(Integer.parseInt(jTxtModelNum.getText()));
        car.setSerialNumber(Integer.parseInt(jTxtSerialNum.getText()));
        car.setYearOfManufacture(Integer.parseInt(jTxtYearOfManufacture.getText()));
        car.setCity(city);
        car.setNumberOfSeats(Integer.parseInt(jTxtNoOfSeats.getText()));
        car.setColor(color);
        car.setMaintenanceCertificate(maintenanceCertificate);
        car.setDriverName(driverName);
        car.setAvailability(availability);
        
        //Displaying success message
        JOptionPane.showMessageDialog(null, "Car created successfully!","information",JOptionPane.INFORMATION_MESSAGE);
        
        //Clearing all text fields after successful creation of car object
        jTxtBrand.setText("");
        jTxtManufacturerName.setText("");
        jTxtModelNum.setText("");
        jTxtSerialNum.setText("");
        jTxtYearOfManufacture.setText("");
        jTxtNoOfSeats.setText("");
        jTxtColor.setText("");
        jButtonGroupMainCerti.clearSelection();
        jTxtDriverName.setText("");
        jButtonGroupAvail.clearSelection();
        
        Calendar now = Calendar.getInstance(); 
        CarCatalog.setLastUpdate(now.getTime());
       
    }//GEN-LAST:event_jBtnCreateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        //Code for back button. 
        //remove the current panel and displaying the previous Panel
        this.jPanelBottom.remove(this);
        CardLayout layout = (CardLayout)this.jPanelBottom.getLayout();
        layout.previous(jPanelBottom);
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton jBtnCreate;
    private javax.swing.JButton jButtonBack;
    private javax.swing.ButtonGroup jButtonGroupAvail;
    private javax.swing.ButtonGroup jButtonGroupMainCerti;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblAvailability;
    private javax.swing.JLabel jLblBrand;
    private javax.swing.JLabel jLblCity;
    private javax.swing.JLabel jLblColor;
    private javax.swing.JLabel jLblDriverName;
    private javax.swing.JLabel jLblManufacturerName;
    private javax.swing.JLabel jLblManufacturerName2;
    private javax.swing.JLabel jLblModelNum;
    private javax.swing.JLabel jLblNoOfSeats;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JLabel jLblYearOfManufacture;
    private javax.swing.JRadioButton jRadioButtonAvailNo;
    private javax.swing.JRadioButton jRadioButtonAvailYes;
    private javax.swing.JRadioButton jRadioButtonExpired;
    private javax.swing.JRadioButton jRadioButtonNotExpired;
    private javax.swing.JTextField jTxtBrand;
    private javax.swing.JTextField jTxtColor;
    private javax.swing.JTextField jTxtDriverName;
    private javax.swing.JTextField jTxtManufacturerName;
    private javax.swing.JTextField jTxtModelNum;
    private javax.swing.JTextField jTxtNoOfSeats;
    private javax.swing.JTextField jTxtSerialNum;
    private javax.swing.JTextField jTxtYearOfManufacture;
    // End of variables declaration//GEN-END:variables
}
