/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.SportsStoreManagerOrganization;
import Business.Organization.TrekManagerOrganization;
import Business.Products.CustomerItems;
import Business.Products.CustomerOrders;
import Business.Products.MyCartDirectory;
import Business.Products.Product;
import Business.Trek.Trek;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.SportsStoreManagerRole.ViewProductJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahd
 */
public class CustomerSportsStoreWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSportsStoreWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private UserAccount account;
    private CustomerOrganization customerOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private SportsStoreManagerOrganization sportsStoreManagerOrganization;
    public CustomerSportsStoreWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization customerOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.customerOrganization = customerOrganization;
        this.enterprise = enterprise;
        this.business = business;
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof SportsStoreManagerOrganization){
                sportsStoreManagerOrganization = (SportsStoreManagerOrganization) org;
                break;
            }
        }
        System.out.println("sport"+sportsStoreManagerOrganization);
//        populateTrekLocationTable();
//        populateMyTreks();
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        displayCategory();
        populateProductTable();
        populateOrderTable();
        System.out.println("Order"+customerOrganization.getOrderDir().getOrderList());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        browseJPanel = new javax.swing.JPanel();
        Cycling = new javax.swing.JLabel();
        backPackingLabel = new javax.swing.JLabel();
        exerciseLabel = new javax.swing.JLabel();
        hikingLabel = new javax.swing.JLabel();
        winterSports = new javax.swing.JLabel();
        runningLabel = new javax.swing.JLabel();
        camping = new javax.swing.JLabel();
        walkingJLabel = new javax.swing.JLabel();
        extremeSports = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        myOrdersJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        cartJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        removeFromCart = new javax.swing.JButton();
        buyItemsInCartButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 108, 205));

        jScrollPane1.setBackground(new java.awt.Color(33, 108, 205));

        jTabbedPane1.setBackground(new java.awt.Color(33, 108, 205));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTabbedPane1.setOpaque(true);

        browseJPanel.setBackground(new java.awt.Color(33, 108, 205));

        Cycling.setBackground(new java.awt.Color(255, 51, 0));
        Cycling.setForeground(new java.awt.Color(102, 0, 255));
        Cycling.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Cycling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cycling.setName(""); // NOI18N
        Cycling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CyclingMouseClicked(evt);
            }
        });

        backPackingLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPackingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPackingLabelMouseClicked(evt);
            }
        });

        exerciseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exerciseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exerciseLabelMouseClicked(evt);
            }
        });

        hikingLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hikingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hikingLabelMouseClicked(evt);
            }
        });

        winterSports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        winterSports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                winterSportsMouseClicked(evt);
            }
        });

        runningLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        runningLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                runningLabelMouseClicked(evt);
            }
        });

        camping.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campingMouseClicked(evt);
            }
        });

        walkingJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        walkingJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                walkingJLabelMouseClicked(evt);
            }
        });

        extremeSports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        extremeSports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extremeSportsMouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/CustomerRole/backButton.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout browseJPanelLayout = new javax.swing.GroupLayout(browseJPanel);
        browseJPanel.setLayout(browseJPanelLayout);
        browseJPanelLayout.setHorizontalGroup(
            browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browseJPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(browseJPanelLayout.createSequentialGroup()
                        .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hikingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cycling, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camping, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(browseJPanelLayout.createSequentialGroup()
                                .addComponent(exerciseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(backPackingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(browseJPanelLayout.createSequentialGroup()
                                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(winterSports, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(extremeSports, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(runningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(walkingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        browseJPanelLayout.setVerticalGroup(
            browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browseJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cycling, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exerciseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backPackingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(camping, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(extremeSports, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(walkingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(browseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(winterSports, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hikingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shop", browseJPanel);

        myOrdersJPanel.setBackground(new java.awt.Color(33, 108, 205));

        orderTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductName", "Quantity", "Price", "Date of Order"
            }
        ));
        orderTable.setGridColor(new java.awt.Color(204, 0, 204));
        orderTable.setRowHeight(22);
        jScrollPane3.setViewportView(orderTable);

        javax.swing.GroupLayout myOrdersJPanelLayout = new javax.swing.GroupLayout(myOrdersJPanel);
        myOrdersJPanel.setLayout(myOrdersJPanelLayout);
        myOrdersJPanelLayout.setHorizontalGroup(
            myOrdersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myOrdersJPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2107, Short.MAX_VALUE))
        );
        myOrdersJPanelLayout.setVerticalGroup(
            myOrdersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myOrdersJPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Orders", myOrdersJPanel);

        cartJPanel.setBackground(new java.awt.Color(33, 108, 205));

        cartTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Brand Name", "Quanity", "Price"
            }
        ));
        jScrollPane2.setViewportView(cartTable);

        removeFromCart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeFromCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/removeCart.png"))); // NOI18N
        removeFromCart.setContentAreaFilled(false);
        removeFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCartActionPerformed(evt);
            }
        });

        buyItemsInCartButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buyItemsInCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/chechoutAll.png"))); // NOI18N
        buyItemsInCartButton.setContentAreaFilled(false);
        buyItemsInCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyItemsInCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartJPanelLayout = new javax.swing.GroupLayout(cartJPanel);
        cartJPanel.setLayout(cartJPanelLayout);
        cartJPanelLayout.setHorizontalGroup(
            cartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartJPanelLayout.createSequentialGroup()
                .addGroup(cartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartJPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(removeFromCart)
                        .addGap(18, 18, 18)
                        .addComponent(buyItemsInCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartJPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2303, 2303, 2303))
        );
        cartJPanelLayout.setVerticalGroup(
            cartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartJPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(cartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeFromCart, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(buyItemsInCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(682, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Cart", cartJPanel);

        jScrollPane1.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateOrderTable(){
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        model.setRowCount(0);
        System.out.println("size of order dir: "+customerOrganization.getOrderDir().getOrderList().size());
        for (CustomerOrders req : customerOrganization.getOrderDir().getOrderList()){
            System.out.println(req.getCustAccount()+"cust");
            System.out.println("login"+account);
            System.out.println(req.getProduct().getName());
            if(req.getCustAccount().equals(account)){
            Object[] row = new Object[4];
            row[0] = req.getProduct().getName();
            row[1] = req.getQuantity();
            row[2] = (req.getProduct().getSellingPrice()*req.getQuantity())+( 0.0625*(req.getProduct().getSellingPrice()*req.getQuantity()));
            row[3] = f.format(req.getOrderDate());
                    
            model.addRow(row);
            }
        }
    }
    
     public void populateProductTable(){
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
         System.out.println("order"+customerOrganization.getCartDir().getCartList());
        model.setRowCount(0);
        for (CustomerItems req : customerOrganization.getCartDir().getCartList()){
            if(req.getCustAccount().equals(account)){
            Object[] row = new Object[4];
            row[0] = req;
            row[1] = req.getProduct().getBrandName();
            row[2] = req.getQuantity();
            row[3] = req.getProduct().getSellingPrice();
                    
            model.addRow(row);
            }
          }
    }
    private void exerciseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exerciseLabelMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new UserInterface.CustomerRole.CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Excersice and Fitness"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_exerciseLabelMouseClicked

    private void CyclingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CyclingMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Cycling"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_CyclingMouseClicked

    private void backPackingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPackingLabelMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Backpacking"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_backPackingLabelMouseClicked

    private void campingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campingMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Camping"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_campingMouseClicked

    private void extremeSportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extremeSportsMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Extreme Sports"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_extremeSportsMouseClicked

    private void walkingJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walkingJLabelMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Walking"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_walkingJLabelMouseClicked

    private void hikingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hikingLabelMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Hiking"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_hikingLabelMouseClicked

    private void winterSportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_winterSportsMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Winter Sports"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_winterSportsMouseClicked

    private void runningLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runningLabelMouseClicked
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CustomerSportsStoreSubCategories",new CustomerSportsStoreSubCategories(userProcessContainer, account, customerOrganization, enterprise, business,"Running"));
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_runningLabelMouseClicked

    private void removeFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCartActionPerformed
        // TODO add your handling code here:
         int selectedRows = cartTable.getSelectedRow();
        
        if(selectedRows < 0){
            JOptionPane.showMessageDialog(null, "Please select a Product","Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            CustomerItems item = (CustomerItems)cartTable.getValueAt(selectedRows,0);
            customerOrganization.getCartDir().getCartList().remove(item);
            JOptionPane.showMessageDialog(null, "Product Removed From Cart","Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
        populateProductTable();
    }//GEN-LAST:event_removeFromCartActionPerformed

    private void buyItemsInCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyItemsInCartButtonActionPerformed
        // TODO add your handling code here:
        selectRows(cartTable, 0, cartTable.getRowCount());

        //call method to return values of selected rows
        ArrayList<CustomerItems> values = getSelectedRowValues(cartTable);
        
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("SportsStoreBookingDetails",new UserInterface.CustomerRole.SportsStoreBookingDetailsJPanel(userProcessContainer, account, customerOrganization, enterprise, business,values));
        layout.next(userProcessContainer); 
        
        for(CustomerItems item : values){
            customerOrganization.getCartDir().getCartList().remove(item);
        }
        
    }//GEN-LAST:event_buyItemsInCartButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    
    
    public void displayCategory(){
    
        String campingUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/CAMPING.PNG";
        String exerciseUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/FITNESS.PNG";
        String hikingUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/HIKING.PNG";
        String cyclingUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/CYCLING.PNG";
        String winterSportsUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/WINTER SPORTS.PNG";
      // String runningUrl = "../../../assets/SportsCateogryPics/running.jpg";
        String runningUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/RUNNING.PNG";
        String backPackingUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/BACKPACKING.PNG";
        String extremeSportsUrl = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/EXTREME SPORTS.PNG";
        String walkingURL = "C:/Users/shahd/Documents/AED-bitBucket/gladiators/FinalProject/FinalProject/assets/SportsCategoryPics/WALKING.PNG";
        
        browseJPanel.revalidate();
        
        //camping Label
         ImageIcon icon= new ImageIcon(campingUrl);
        Image icon2=icon.getImage();
        camping.setSize(500,400);
        Image icon3=icon2.getScaledInstance(camping.getWidth(),camping.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon finalIcon = new ImageIcon(icon3);
        camping.setIcon(finalIcon);
        
        
//        
        //exerciseLabel
        
        icon= new ImageIcon(exerciseUrl);
        icon2=icon.getImage();
        exerciseLabel.setSize(500,400);
        icon3=icon2.getScaledInstance(exerciseLabel.getWidth(),exerciseLabel.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        exerciseLabel.setIcon(finalIcon);
//        
//         //hikingLabel
//        
        icon= new ImageIcon(hikingUrl);
        icon2=icon.getImage();
        hikingLabel.setSize(500,400);
        icon3=icon2.getScaledInstance(hikingLabel.getWidth(),hikingLabel.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        hikingLabel.setIcon(finalIcon);
//        
//        
//         //wintersportsLabel
//        
        icon= new ImageIcon(winterSportsUrl);
        icon2=icon.getImage();
        winterSports.setSize(500,400);
        icon3=icon2.getScaledInstance(winterSports.getWidth(),winterSports.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        winterSports.setIcon(finalIcon);
        
//        
//         //backpacking
//        
        icon= new ImageIcon(backPackingUrl);
        icon2=icon.getImage();
        backPackingLabel.setSize(500,400);
        icon3=icon2.getScaledInstance(backPackingLabel.getWidth(),backPackingLabel.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        backPackingLabel.setIcon(finalIcon);
//        
        
         //running
        
        icon= new ImageIcon(runningUrl);
        icon2=icon.getImage();
        runningLabel.setSize(500,400);
        icon3=icon2.getScaledInstance(runningLabel.getWidth(),runningLabel.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        runningLabel.setIcon(finalIcon);
//        
//         //cycling
//        
        icon= new ImageIcon(cyclingUrl);
        icon2=icon.getImage();
        Cycling.setSize(500,400);
        icon3=icon2.getScaledInstance(Cycling.getWidth(),Cycling.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        Cycling.setIcon(finalIcon);
        
        //extremeSports
        icon= new ImageIcon(extremeSportsUrl);
        icon2=icon.getImage();
        extremeSports.setSize(500,400);
        icon3=icon2.getScaledInstance(extremeSports.getWidth(),extremeSports.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        extremeSports.setIcon(finalIcon);
         //walking
        icon= new ImageIcon(walkingURL);
        icon2=icon.getImage();
        walkingJLabel.setSize(500,400);
        icon3=icon2.getScaledInstance(walkingJLabel.getWidth(),walkingJLabel.getHeight(),Image.SCALE_SMOOTH);
        finalIcon = new ImageIcon(icon3);
        walkingJLabel.setIcon(finalIcon);
        
    
    }
    
    
    
    private void selectRows(JTable table, int start, int end) {
        // Use this mode to demonstrate the following examples
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // Needs to be set or rows cannot be selected
        table.setRowSelectionAllowed(true);
        // Select rows from start to end if start is 0 we change to 1 or leave it (used to preserve coloums headers)
        table.setRowSelectionInterval(start, end - 1);
    }

    /**
     * Will return all selected rows values
     *
     * @param table
     * @return ArrayList<Intger> values of each selected row for all columns
     */
    private ArrayList<CustomerItems> getSelectedRowValues(JTable table) {
        ArrayList<CustomerItems> values = new ArrayList<CustomerItems>();
        int[] vals = table.getSelectedRows();
        for (int i = 0; i < vals.length; i++) {
             
                //System.out.println(table.getValueAt(i, x));
                values.add((CustomerItems)table.getValueAt(i, 0));
            
        }
        return values;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cycling;
    private javax.swing.JLabel backPackingLabel;
    private javax.swing.JPanel browseJPanel;
    private javax.swing.JButton buyItemsInCartButton;
    private javax.swing.JLabel camping;
    private javax.swing.JPanel cartJPanel;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel exerciseLabel;
    private javax.swing.JLabel extremeSports;
    private javax.swing.JLabel hikingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel myOrdersJPanel;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton removeFromCart;
    private javax.swing.JLabel runningLabel;
    private javax.swing.JLabel walkingJLabel;
    private javax.swing.JLabel winterSports;
    // End of variables declaration//GEN-END:variables
}

