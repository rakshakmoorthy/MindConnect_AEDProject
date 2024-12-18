/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Insurance;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.personpkg.Insurance;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.SendDataToInsurance;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manvith
 */
public class InsuranceClaimsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceClaimsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;

    public InsuranceClaimsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem, Insurance selectedInsurance) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        populateRequestTable();
        populateSelectedInsurance(selectedInsurance);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 33, 46));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insurance Claims Request");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Insurance Plan", "Insurance Coverage", "Benefit", "Premium", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnApprove.setBackground(new java.awt.Color(1, 33, 46));
        btnApprove.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {
            // Assuming that the insurance status is stored in the 5th column of the table
            jTable1.setValueAt("Approved", selectedRow, 5);

            // Notify the user
            JOptionPane.showMessageDialog(this, "Insurance Approved Successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a request to approve.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof SendDataToInsurance) {
                SendDataToInsurance sendDataRequest = (SendDataToInsurance) workRequest;

                Object[] row = new Object[10];
                //rowData[0] = workRequest.getMessage();
                row[0] = sendDataRequest.getReceiver();
                row[1] = sendDataRequest.getPlan();
                row[2] = sendDataRequest.getCoverage();
                row[3] = sendDataRequest.getBenefit();
                row[4] = sendDataRequest.getPremium();
                model.addRow(row);
            }

        }
    }

    private void populateSelectedInsurance(Insurance selectedInsurance) {

        DefaultTableModel selectedInsuranceModel = (DefaultTableModel) jTable1.getModel();
        selectedInsuranceModel.setRowCount(0);
        Object[] row = new Object[10];

        row[0] = userAccount.getPerson().getName();
        row[1] = selectedInsurance.getPlan();
        row[2] = selectedInsurance.getCoverage();
        row[3] = selectedInsurance.getPremium();
        row[4] = selectedInsurance.getBenefits();
        row[5] = "pending";
        selectedInsuranceModel.addRow(row);
    }

}
