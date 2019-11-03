/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dedhi
 */

public class SearchCar extends javax.swing.JPanel {

    /**
     * Creates new form SearchCar
     */
    private JPanel jPanelBottom;
    private CarCatalog carCatalog;
    //Creation of ArrayList to store the filter values added by the user
    private ArrayList<String> brandArr = new ArrayList<String>();
    private ArrayList<String> yearArr  = new ArrayList<String>();
    private ArrayList<String> modelArr  = new ArrayList<String>();
    private ArrayList<String> serialArr  = new ArrayList<String>();
    private ArrayList<String> cityArr  = new ArrayList<String>();
    private ArrayList<String> mainCertiArr  = new ArrayList<String>();
    private String availability = "all";
    private int minSeats = 0;
    private int maxSeats = 0;
    //For getting total number of available and not available cars
    private int totalAvailableCars;
    private int totalNotAvailableCars;
    
    public SearchCar(JPanel jPanelBottom, CarCatalog carCatalog) {
        initComponents();
        this.jPanelBottom = jPanelBottom;
        this.carCatalog = carCatalog;
        addCheckBox();
        jRadioButtonAll.setSelected(true);
        populateTable(); 
        //System.out.println("Catalog was last updated on: "+CarCatalog.getLastUpdate());

    }
    
    //Populating the table as per filters specified by the user
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)jTableResult.getModel();
        dtm.setRowCount(0);
        totalAvailableCars = 0;
        totalNotAvailableCars = 0;
        for(Car c : carCatalog.getCarCatalog())
        {
            //If the car object is available increase the counter of totalAvailableCars orelse increase the counter of totalNotAvailableCars
            if(c.isAvailability()){
                totalAvailableCars = totalAvailableCars + 1;
            } else if(!c.isAvailability()){
                totalNotAvailableCars = totalNotAvailableCars + 1;
            }
            //Displaying all the cars whether available or not as per other filters
            if(availability.equals("all")){
//              if(brandArr.contains(c.getBrand()) || yearArr.contains(String.valueOf(c.getYearOfManufacture()))
//              || modelArr.contains(String.valueOf(c.getModelNumber())) || serialArr.contains(String.valueOf(c.getSerialNumber()))
//              || cityArr.contains(c.getCity()) || mainCertiArr.contains(c.getMaintenanceCertificate())
//                      || (c.getNumberOfSeats() >= minSeats && c.getNumberOfSeats() <= maxSeats))

            if(true)
            {      
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = c;
            row[1] = c.getYearOfManufacture();
            row[2] = c.getModelNumber();
            row[3] = c.getSerialNumber();
            row[4] = c.getColor();
            row[5] = c.getCity();
            if(c.getMaintenanceCertificate().equals("expired")){
                row[6] = "Expired";
            }else if(c.getMaintenanceCertificate().equals("notexpired")){
                row[6] = "Not Expired";
            }
            row[7] = c.getNumberOfSeats();
            row[8] = c.isAvailability();
            dtm.addRow(row);
            
            }
            } else{
                //Displaying either available or not available cars also considering other filters applied by the user
              if(brandArr.contains(c.getBrand()) || yearArr.contains(String.valueOf(c.getYearOfManufacture()))
              || modelArr.contains(String.valueOf(c.getModelNumber())) || serialArr.contains(String.valueOf(c.getSerialNumber()))
              || cityArr.contains(c.getCity()) || mainCertiArr.contains(c.getMaintenanceCertificate())
              || c.isAvailability() == Boolean.parseBoolean(availability) 
                      || c.getNumberOfSeats() >= minSeats || c.getNumberOfSeats() <= maxSeats){
                
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = c;
            row[1] = c.getYearOfManufacture();
            row[2] = c.getModelNumber();
            row[3] = c.getSerialNumber();
            row[4] = c.getColor();
            row[5] = c.getCity();
            if(c.getMaintenanceCertificate().equals("expired")){
                row[6] = "Expired";
            }else if(c.getMaintenanceCertificate().equals("notexpired")){
                row[6] = "Not Expired";
            }
            row[7] = c.getNumberOfSeats();
            row[8] = c.isAvailability();
            dtm.addRow(row);
            
            }
                
            }

        }
        
        //displaying the last catalog update date
        jLabelLastUpdate.setText("Catalog was last updated on: "+CarCatalog.getLastUpdate());
        jLabelAvail.setText("(Cars: "+totalAvailableCars+")");
        jLabelNotAvail.setText("(Cars: "+totalNotAvailableCars+")");
        jLabelAll.setText("(Cars:"+(totalAvailableCars+totalNotAvailableCars)+")");
    }
    
    //Adding dynamic checkboxes as per car attributes
    private void addCheckBox(){
       // jPanel2.setVisible(true);
       //Filter for Brand Name
       //Check the car objects and display distinct brand names in checkboxes
       int i = 1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!brandArr.contains(c.getBrand()))
           {
               brandArr.add(c.getBrand());
               JCheckBox cb = new JCheckBox();
               //cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               cb.setText(c.getBrand());
               jPanelBrand.add(cb);
               cb.setName(c.getBrand()+i);
               i++;
               
           }  
       }
       //Filter for Year of Manufacture
       i=1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!yearArr.contains(String.valueOf(c.getYearOfManufacture())))
           {
               yearArr.add(String.valueOf(c.getYearOfManufacture()));
               JCheckBox cb = new JCheckBox();
              // cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               cb.setText(String.valueOf(c.getYearOfManufacture()));
               jPanelYear.add(cb);
               i++;
           }  
       }
       //Filter for Model No.
       i=1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!modelArr.contains(String.valueOf(c.getModelNumber())))
           {
               modelArr.add(String.valueOf(c.getModelNumber()));
               JCheckBox cb = new JCheckBox();
               //cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               cb.setText(String.valueOf(c.getModelNumber()));
               jPanelModelNumber.add(cb);
               i++;
           }  
       }
       //Filter for Serial No.
       i=1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!serialArr.contains(String.valueOf(c.getSerialNumber())))
           {
               serialArr.add(String.valueOf(c.getSerialNumber()));
               JCheckBox cb = new JCheckBox();
               //cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               cb.setText(String.valueOf(c.getSerialNumber()));
               jPanelSerialNumber.add(cb);
               i++;
           }  
       }
       //Filter for City
       i = 1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!cityArr.contains(c.getCity()))
           {
               cityArr.add(c.getCity());
               JCheckBox cb = new JCheckBox();
              // cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               cb.setText(c.getCity());
               jPanelCity.add(cb);
               cb.setName(c.getCity()+i);
               i++;
           }  
       }
       //Filter for Maintenance Certificate
       i = 1;
       for(Car c: carCatalog.getCarCatalog())
       {
           if(!mainCertiArr.contains(c.getMaintenanceCertificate()))
           {
               mainCertiArr.add(c.getMaintenanceCertificate());
               JCheckBox cb = new JCheckBox();
               //cb.setSelected(true);
               cb.setLocation(10,i*30);
               cb.setSize(100,30);
               String maintenanceCertificate;
               if(c.getMaintenanceCertificate().equals("expired")){
                   cb.setText("Expired");
               }else if(c.getMaintenanceCertificate().equals("notexpired")){
                   cb.setText("Not Expired");
               }
               //cb.setText(c.getMaintenanceCertificate());
               jPanelMaintenanceCertificate.add(cb);
               cb.setName(c.getMaintenanceCertificate()+i);
               i++;
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

        buttonGroupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelModelNumber = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelBrand = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanelYear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanelSerialNumber = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanelCity = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanelMaintenanceCertificate = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonAvail = new javax.swing.JRadioButton();
        jRadioButtonNotAvail = new javax.swing.JRadioButton();
        jRadioButtonAll = new javax.swing.JRadioButton();
        jTextFieldMinSeats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMaxSeats = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jLabelLastUpdate = new javax.swing.JLabel();
        jLabelAvail = new javax.swing.JLabel();
        jLabelNotAvail = new javax.swing.JLabel();
        jLabelAll = new javax.swing.JLabel();

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(327, 327));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 200));

        jPanelModelNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Model Number");

        javax.swing.GroupLayout jPanelModelNumberLayout = new javax.swing.GroupLayout(jPanelModelNumber);
        jPanelModelNumber.setLayout(jPanelModelNumberLayout);
        jPanelModelNumberLayout.setHorizontalGroup(
            jPanelModelNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModelNumberLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );
        jPanelModelNumberLayout.setVerticalGroup(
            jPanelModelNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModelNumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanelModelNumber);

        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 200));

        jPanelBrand.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBrand.setPreferredSize(new java.awt.Dimension(398, 398));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Brand Name");

        javax.swing.GroupLayout jPanelBrandLayout = new javax.swing.GroupLayout(jPanelBrand);
        jPanelBrand.setLayout(jPanelBrandLayout);
        jPanelBrandLayout.setHorizontalGroup(
            jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBrandLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanelBrandLayout.setVerticalGroup(
            jPanelBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBrandLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanelBrand);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(200, 200));

        jPanelYear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelYear.setPreferredSize(new java.awt.Dimension(398, 398));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Year of Manufacture");

        javax.swing.GroupLayout jPanelYearLayout = new javax.swing.GroupLayout(jPanelYear);
        jPanelYear.setLayout(jPanelYearLayout);
        jPanelYearLayout.setHorizontalGroup(
            jPanelYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelYearLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 225, Short.MAX_VALUE))
        );
        jPanelYearLayout.setVerticalGroup(
            jPanelYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelYearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanelYear);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(200, 200));

        jPanelSerialNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSerialNumber.setPreferredSize(new java.awt.Dimension(398, 398));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Serial Number");

        javax.swing.GroupLayout jPanelSerialNumberLayout = new javax.swing.GroupLayout(jPanelSerialNumber);
        jPanelSerialNumber.setLayout(jPanelSerialNumberLayout);
        jPanelSerialNumberLayout.setHorizontalGroup(
            jPanelSerialNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerialNumberLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );
        jPanelSerialNumberLayout.setVerticalGroup(
            jPanelSerialNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerialNumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanelSerialNumber);

        jPanelCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCity.setPreferredSize(new java.awt.Dimension(298, 298));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("City Name");

        javax.swing.GroupLayout jPanelCityLayout = new javax.swing.GroupLayout(jPanelCity);
        jPanelCity.setLayout(jPanelCityLayout);
        jPanelCityLayout.setHorizontalGroup(
            jPanelCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCityLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        jPanelCityLayout.setVerticalGroup(
            jPanelCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanelCity);

        jPanelMaintenanceCertificate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMaintenanceCertificate.setPreferredSize(new java.awt.Dimension(298, 298));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Maintenance Certificate");

        javax.swing.GroupLayout jPanelMaintenanceCertificateLayout = new javax.swing.GroupLayout(jPanelMaintenanceCertificate);
        jPanelMaintenanceCertificate.setLayout(jPanelMaintenanceCertificateLayout);
        jPanelMaintenanceCertificateLayout.setHorizontalGroup(
            jPanelMaintenanceCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaintenanceCertificateLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );
        jPanelMaintenanceCertificateLayout.setVerticalGroup(
            jPanelMaintenanceCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaintenanceCertificateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanelMaintenanceCertificate);

        buttonGroupRadio.add(jRadioButtonAvail);
        jRadioButtonAvail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonAvail.setText("Available");

        buttonGroupRadio.add(jRadioButtonNotAvail);
        jRadioButtonNotAvail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonNotAvail.setText("Not Available");

        buttonGroupRadio.add(jRadioButtonAll);
        jRadioButtonAll.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRadioButtonAll.setText("All");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<=  No. of Seats <=");

        jScrollPane9.setViewportView(jTableResult);

        jButtonBack.setText("<<Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonView.setText("VIEW");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelLastUpdate.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabelLastUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLastUpdate.setText("Hiiiii");

        jLabelAvail.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        jLabelNotAvail.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        jLabelAll.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jTextFieldMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jRadioButtonAvail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButtonNotAvail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelNotAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButtonAll)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 741, Short.MAX_VALUE)
                                .addComponent(jLabelLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jLabelLastUpdate))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonAvail)
                                .addComponent(jRadioButtonNotAvail)
                                .addComponent(jRadioButtonAll)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNotAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Checking the selected checkboxes, storing the selected values in respective arrayList and populating table according to the filters
    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        brandArr.clear();
        yearArr.clear();
        modelArr.clear();
        serialArr.clear();
        cityArr.clear();
        mainCertiArr.clear();
        
        //Checking the radio buttons for filtering availability
        if(jRadioButtonAvail.isSelected()){
            availability = "true";
        }else if(jRadioButtonNotAvail.isSelected()){
            availability = "false";
        }else{
            availability = "all";
        }
        
        //get the min and max seats entered by user
        if(!jTextFieldMinSeats.getText().equals("")){
           minSeats = Integer.parseInt(jTextFieldMinSeats.getText());
        }else{
             minSeats = 0;
        }
        
        if(!jTextFieldMaxSeats.getText().equals("")){
            maxSeats = Integer.parseInt(jTextFieldMaxSeats.getText());
        }else{
            maxSeats = 0;
        }
        
        //getting brand selected values in ArrayList
        Component[] brandComponents = jPanelBrand.getComponents();
        for (Component c : brandComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  brandArr.add(cb.getText());
              }  
            }
            }
        
        //getting year selected values in ArrayList
        Component[] yearComponents = jPanelYear.getComponents();
        for (Component c : yearComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  yearArr.add(cb.getText());
              }  
            }
        }
        
        //getting model number selected values in ArrayList
        Component[] modelComponents = jPanelModelNumber.getComponents();
        for (Component c : modelComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  modelArr.add(cb.getText());
              }  
            }
        }
                
        //getting serial number selected values in ArrayList
        Component[] serialComponents = jPanelSerialNumber.getComponents();
        for (Component c : serialComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  serialArr.add(cb.getText());
              }  
            }
        }
                        
        //getting city selected values in ArrayList
        Component[] cityComponents = jPanelCity.getComponents();
        for (Component c : cityComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  cityArr.add(cb.getText());
              }  
            }
        }
                                
        //getting maintenance certificate selected values in ArrayList
        Component[] mainCertiComponents = jPanelMaintenanceCertificate.getComponents();
        for (Component c : mainCertiComponents) {
            if(c instanceof JCheckBox){
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected()){
                  if(cb.getText().equals("Expired")){
                      mainCertiArr.add("expired");
                  }else if(cb.getText().equals("Not Expired")){
                      mainCertiArr.add("notexpired");
                  }
                 // mainCertiArr.add(cb.getText());
              }  
            }
        }
        
        populateTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.jPanelBottom.remove(this);
        CardLayout layout = (CardLayout)this.jPanelBottom.getLayout();
        layout.previous(jPanelBottom);
    }//GEN-LAST:event_jButtonBackActionPerformed

    //Displaying car object selected by the user
    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedRows = jTableResult.getSelectedRow();
        if(selectedRows >= 0){
        Car car = (Car) jTableResult.getValueAt(selectedRows, 0);
        ViewJPanel viewJPanel = new ViewJPanel(jPanelBottom, carCatalog, car);
        jPanelBottom.add("ViewJPanel",viewJPanel);
        CardLayout layout = (CardLayout) jPanelBottom.getLayout();
        layout.next(jPanelBottom);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Car","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    //deleting car object selected by the user
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRows = jTableResult.getSelectedRow();
        if(selectedRows >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Car?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Car car = (Car) jTableResult.getValueAt(selectedRows, 0);
                carCatalog.deleteCar(car);
                //populate(carCatalog.getProductDirectory(),"all");
                JOptionPane.showMessageDialog(null, "Car deleted successfully!","Information", JOptionPane.INFORMATION_MESSAGE);
                availability = "all";
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Car","Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRadio;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAll;
    private javax.swing.JLabel jLabelAvail;
    private javax.swing.JLabel jLabelLastUpdate;
    private javax.swing.JLabel jLabelNotAvail;
    private javax.swing.JPanel jPanelBrand;
    private javax.swing.JPanel jPanelCity;
    private javax.swing.JPanel jPanelMaintenanceCertificate;
    private javax.swing.JPanel jPanelModelNumber;
    private javax.swing.JPanel jPanelSerialNumber;
    private javax.swing.JPanel jPanelYear;
    private javax.swing.JRadioButton jRadioButtonAll;
    private javax.swing.JRadioButton jRadioButtonAvail;
    private javax.swing.JRadioButton jRadioButtonNotAvail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTextField jTextFieldMaxSeats;
    private javax.swing.JTextField jTextFieldMinSeats;
    // End of variables declaration//GEN-END:variables
}
