/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.doctor;

import business.common.Validation;
import business.personpkg.Patient;
import business.sensor.VitalSign;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.SupervisorWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejageetla
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
    
        private JPanel userProcessContainer;
        private UserAccount userAccount;
        private SendDataToDoctorWorkRequest sdtdwr;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;

        this.userAccount = userAccount;
        
        populateHelpSeekerComboBx();
        sendMedicationsPanel.setVisible(false);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populateHelpSeekerComboBx()
    {
        helpSeekerComboBx.removeAllItems();
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Patients did not choose to send data yet!","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
      HashSet<String> hsstateVal = new HashSet<>();  
     for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
        if(!request.getMessage().equalsIgnoreCase(SupervisorWorkRequest.REQUEST_APPROVAL))
        {
         String customer = (String)request.getSender().getUserName();
        hsstateVal.add(customer);
        }
        }
       for(String s1 : hsstateVal)
        {
         for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
         String userName = (String)request.getSender().getUserName();
       if(userName.equals(s1))
       {
        Patient customer = (Patient)request.getSender().getPerson();
        helpSeekerComboBx.addItem(customer);
       }
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

        getDataForPatient = new javax.swing.JButton();
        helpSeekerComboBx = new javax.swing.JComboBox();
        getAlertFromHH = new javax.swing.JLabel();
        sendMedicationsPanel = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentMedicationsTxtArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        newMedicationTxtArea = new javax.swing.JTextArea();
        medications = new javax.swing.JLabel();
        medications1 = new javax.swing.JLabel();
        sendNewMedicationsBtn = new javax.swing.JButton();
        weightTextField = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        systollicBPTextField = new javax.swing.JTextField();
        systollicBloodPressure = new javax.swing.JLabel();
        heartRateTextField = new javax.swing.JTextField();
        heartRate = new javax.swing.JLabel();
        respiratoryRateTextField = new javax.swing.JTextField();
        respiratoryRate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewDetailsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 192, 160));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getDataForPatient.setBackground(new java.awt.Color(102, 102, 255));
        getDataForPatient.setText("Get Vital Sign Data");
        getDataForPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getDataForPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataForPatientActionPerformed(evt);
            }
        });
        add(getDataForPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 69, 178, -1));

        helpSeekerComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(helpSeekerComboBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 68, 179, -1));

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("View Patient Vital Signs");
        add(getAlertFromHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 18, 298, -1));

        sendMedicationsPanel.setBackground(new java.awt.Color(0, 0, 153));
        sendMedicationsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentMedicationsTxtArea.setColumns(20);
        currentMedicationsTxtArea.setRows(5);
        jScrollPane2.setViewportView(currentMedicationsTxtArea);

        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date/Time", "Patient Vital Condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        newMedicationTxtArea.setColumns(20);
        newMedicationTxtArea.setRows(5);
        jScrollPane3.setViewportView(newMedicationTxtArea);

        medications.setText("Current Medications/Message:");

        medications1.setText("New Medications/Suggestions:");

        sendNewMedicationsBtn.setBackground(new java.awt.Color(102, 102, 255));
        sendNewMedicationsBtn.setText("Send");
        sendNewMedicationsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendNewMedicationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNewMedicationsBtnActionPerformed(evt);
            }
        });

        weightTextField.setEditable(false);

        weight.setText("Weight (Pounds):");

        systollicBPTextField.setEditable(false);

        systollicBloodPressure.setText("Systollic Blood Pressure:");

        heartRateTextField.setEditable(false);

        heartRate.setText("Heart Rate:");

        respiratoryRateTextField.setEditable(false);

        respiratoryRate.setText("Respiratory Rate:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Vital Signs");

        viewDetailsJButton.setBackground(new java.awt.Color(102, 102, 255));
        viewDetailsJButton.setText("View Details ");
        viewDetailsJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        sendMedicationsPanel.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(medications, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(medications1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(sendNewMedicationsBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(weightTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(weight, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(systollicBPTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(systollicBloodPressure, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(heartRateTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(heartRate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(respiratoryRateTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(respiratoryRate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendMedicationsPanel.setLayer(viewDetailsJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sendMedicationsPanelLayout = new javax.swing.GroupLayout(sendMedicationsPanel);
        sendMedicationsPanel.setLayout(sendMedicationsPanelLayout);
        sendMedicationsPanelLayout.setHorizontalGroup(
            sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                                .addComponent(medications1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                                .addComponent(medications)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(viewDetailsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendMedicationsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendNewMedicationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heartRate)
                            .addComponent(respiratoryRate)
                            .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(systollicBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(weight)))
                        .addGap(18, 18, 18)
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systollicBPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
        );
        sendMedicationsPanelLayout.setVerticalGroup(
            sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respiratoryRate)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(viewDetailsJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sendMedicationsPanelLayout.createSequentialGroup()
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartRate))
                        .addGap(14, 14, 14)
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(systollicBPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systollicBloodPressure))
                        .addGap(18, 18, 18)
                        .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight)
                            .addComponent(medications))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(sendMedicationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medications1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendNewMedicationsBtn)
                .addContainerGap())
        );

        add(sendMedicationsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void getDataForPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataForPatientActionPerformed
       if(helpSeekerComboBx.getSelectedIndex()<0)
       {
         JOptionPane.showMessageDialog(null, "Please Select a Patient to view Data!","warning", JOptionPane.WARNING_MESSAGE);
         return;        
       }
       Patient customer = (Patient)helpSeekerComboBx.getSelectedItem();
        populateVitalSignsJTable(customer);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
         if(!(request.getMessage().equalsIgnoreCase(SupervisorWorkRequest.REQUEST_APPROVAL)))
         {
         Patient cust = (Patient)request.getSender().getPerson();
         if(cust.equals(customer))
         {
         sdtdwr = (SendDataToDoctorWorkRequest)request;    
         currentMedicationsTxtArea.setText(sdtdwr.getMedication());
         }
         }
       }
       
       sendMedicationsPanel.setVisible(true);
       
    }//GEN-LAST:event_getDataForPatientActionPerformed

    private void sendNewMedicationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNewMedicationsBtnActionPerformed
        
        if(newMedicationTxtArea.getText().trim().isEmpty())
         {
         JOptionPane.showMessageDialog(null, "Please enter new Medications","warning", JOptionPane.WARNING_MESSAGE);
         return;    
         }
        if(newMedicationTxtArea.getText().length()>500)
         {
         JOptionPane.showMessageDialog(null, "Please enter characters less than 500 in medications Field ","warning", JOptionPane.WARNING_MESSAGE);
         return;    
         }
        try
        {
        if(sdtdwr.getStatus().equalsIgnoreCase("Completed"))
        {
       
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
      
        }
         String newMedications = newMedicationTxtArea.getText().replaceAll("\n", " ");
         sdtdwr.setNewMedication(newMedications);
         sdtdwr.setReqResult("Doctor Replied");
         sdtdwr.setStatus(SupervisorWorkRequest.REQUEST_COMPLETED);
         
         JOptionPane.showMessageDialog(null, "New Medications has been sent to patient successfully","success", JOptionPane.PLAIN_MESSAGE);
        newMedicationTxtArea.setText("");
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Unable to Send Request, Please try later","warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
    }//GEN-LAST:event_sendNewMedicationsBtnActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed

        int selectedRow = vitalSignTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            VitalSign vitalSign = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);
            respiratoryRateTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
            heartRateTextField.setText(String.valueOf(vitalSign.getHeartRate()));
            systollicBPTextField.setText(String.valueOf(vitalSign.getSystolicBloodpressure()));
            weightTextField.setText(String.valueOf(vitalSign.getWeightInPounds()));

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed
    
     public void populateVitalSignsJTable(Patient customer)
    {   
        try
        {
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel)vitalSignTable.getModel();
        defaultTableModel.setRowCount(0);
        int age = Validation.calculateAge(customer.getDob());
        
        for(VitalSign vitalSign : customer.getVitalSignList())
        {
        String patientCondition = customer.patientCondition(age, vitalSign);
        Object [] rowData = new Object[2];
        rowData[0] = vitalSign;
        rowData[1] = patientCondition;
       
        defaultTableModel.addRow(rowData);
        }
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(this, "No records for the person", "error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea currentMedicationsTxtArea;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JButton getDataForPatient;
    private javax.swing.JLabel heartRate;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JComboBox helpSeekerComboBx;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel medications;
    private javax.swing.JLabel medications1;
    private javax.swing.JTextArea newMedicationTxtArea;
    private javax.swing.JLabel respiratoryRate;
    private javax.swing.JTextField respiratoryRateTextField;
    private javax.swing.JLayeredPane sendMedicationsPanel;
    private javax.swing.JButton sendNewMedicationsBtn;
    private javax.swing.JTextField systollicBPTextField;
    private javax.swing.JLabel systollicBloodPressure;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable vitalSignTable;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
