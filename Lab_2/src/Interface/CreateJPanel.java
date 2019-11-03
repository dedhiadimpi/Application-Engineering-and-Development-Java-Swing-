/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSign;
import Business.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author dedhi
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private VitalSignHistory vsh;
    public CreateJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTemperatureLabel = new javax.swing.JLabel();
        jBloodPressureLabel = new javax.swing.JLabel();
        jPulseLabel = new javax.swing.JLabel();
        jDateLabel = new javax.swing.JLabel();
        jTemperatureTextField = new javax.swing.JTextField();
        jBloodPressureTextField = new javax.swing.JTextField();
        jPulseTextField = new javax.swing.JTextField();
        jDateTextField = new javax.swing.JTextField();
        jCreateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTemperatureLabel.setText("Temperature:");

        jBloodPressureLabel.setText("Blood Pressure:");

        jPulseLabel.setText("Date:");

        jDateLabel.setText("Pulse:");

        jCreateBtn.setText("Create");
        jCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create Vital Sign");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTemperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPulseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBloodPressureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTemperatureTextField)
                                    .addComponent(jBloodPressureTextField)
                                    .addComponent(jPulseTextField)
                                    .addComponent(jDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jCreateBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTemperatureLabel)
                    .addComponent(jTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBloodPressureLabel)
                    .addComponent(jBloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateLabel)
                    .addComponent(jPulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPulseLabel)
                    .addComponent(jDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jCreateBtn)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateBtnActionPerformed
        // TODO add your handling code here:
        double temperature = Double.parseDouble(jTemperatureTextField.getText());
        double bloodPressure = Double.parseDouble(jBloodPressureTextField.getText());
        int pulse = Integer.parseInt(jPulseTextField.getText());
        String date = jDateTextField.getText();
        
        VitalSign vs = vsh.addVitalSign();
        vs.setTemperature(temperature);
        vs.setBloodPressure(bloodPressure);
        vs.setPulse(pulse);
        vs.setDate(date);
        
        JOptionPane.showMessageDialog(null, "Vital Sign Added Successfully");
        
        jTemperatureTextField.setText("");
        jBloodPressureTextField.setText("");
        jPulseTextField.setText("");
        jDateTextField.setText("");
    }//GEN-LAST:event_jCreateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBloodPressureLabel;
    private javax.swing.JTextField jBloodPressureTextField;
    private javax.swing.JButton jCreateBtn;
    private javax.swing.JLabel jDateLabel;
    private javax.swing.JTextField jDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jPulseLabel;
    private javax.swing.JTextField jPulseTextField;
    private javax.swing.JLabel jTemperatureLabel;
    private javax.swing.JTextField jTemperatureTextField;
    // End of variables declaration//GEN-END:variables
}
