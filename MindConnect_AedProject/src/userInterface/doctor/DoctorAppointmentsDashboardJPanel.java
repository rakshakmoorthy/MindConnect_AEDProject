/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.doctor;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakshakmoorthy
 */
public class DoctorAppointmentsDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAppointmentsDashboardJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private Organization organization;

    public DoctorAppointmentsDashboardJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        displayAppointments();
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
        tblAppointments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 33, 46));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Day", "Time Slot", "Symptons", "Allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAppointments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, 788, 227));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Appointments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 21, -1, 56));

        btnProcess.setBackground(new java.awt.Color(102, 102, 255));
        btnProcess.setText("Process>>");
        btnProcess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 348, 90, -1));

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 598, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblAppointments.getSelectedRow();
        if (selectedrowIndex < 0) {

            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
            return;
        }
        String patientName = tblAppointments.getValueAt(selectedrowIndex, 0).toString();
        DoctorTreatmentJPanel panel = new DoctorTreatmentJPanel(userProcessContainer, userAccount, organization, enterprise, ecoSystem);
        userProcessContainer.add("DoctorTreatmentJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAppointments;
    // End of variables declaration//GEN-END:variables

//    private void displayAppointments() {
//        DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
//        model.setRowCount(0);
//        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
//            Object[] rowData = new Object[5];
//            rowData[0] = workRequest.getMessage();
//            rowData[1] = workRequest.getMedication();
//            rowData[2] = workRequest.getStatus();
//            
//            model.addRow(rowData);
//        }
//    }
    private void displayAppointments() {
        DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if(workRequest instanceof SendDataToDoctorWorkRequest) {
                SendDataToDoctorWorkRequest sendDataRequest = (SendDataToDoctorWorkRequest) workRequest;

                Object[] row = new Object[10];
                //rowData[0] = workRequest.getMessage();
                row[0] = sendDataRequest.getPatientName();
                row[1] = sendDataRequest.getPage(); 
                row[2] = sendDataRequest.getPgender(); 
                row[3] = sendDataRequest.getDay(); 
                row[4] = sendDataRequest.getTimeslot();
                row[5] = ((SendDataToDoctorWorkRequest) workRequest).getMedication();
                row[6] = ((SendDataToDoctorWorkRequest) workRequest).getAllergies();

                model.addRow(row);
            }

        }
    }

}
