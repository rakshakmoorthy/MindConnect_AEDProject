/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.doctor;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.personpkg.Tablet;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakshakmoorthy
 */
public class DoctorPrescribeMedicinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPrescribeMedicinesJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private Organization organization;
    public DoctorPrescribeMedicinesJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        display();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrescribe = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabletss = new javax.swing.JTable();
        spnQuantity = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrescribe.setBackground(new java.awt.Color(102, 102, 255));
        btnPrescribe.setText("Prescribe");
        btnPrescribe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeActionPerformed(evt);
            }
        });
        add(btnPrescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 320, 129, 40));

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 561, 63, -1));

        tblTabletss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tablet name", "Tablet contents", "Dosage", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblTabletss);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 102, 768, 186));

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spnQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 320, 86, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Medical Presciption");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 56));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTabletss.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the tablet");
            return;
        }
        Tablet tablet = ecoSystem.getPersonDirectory().getTabletList().get(selectedRowIndex);

        int quant = 0;

        try {
            quant = (Integer) spnQuantity.getValue();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select the price and quantity fields");
            return;
        }

            if (quant > 0) {
                ecoSystem.getPersonDirectory().newOrderTablet(
                    tablet.getTabletName(),
                    tablet.getTabletContent(),
                    tablet.getTabletDosage(), quant, tablet.getPrice()
                );
                System.out.println("Ordered Tablets: " + ecoSystem.getPersonDirectory().getTabletordersList());

            } 
            else {
                JOptionPane.showMessageDialog(this, "Quantity cannot be zero.");
                return;
            }
    }//GEN-LAST:event_btnPrescribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrescribe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblTabletss;
    // End of variables declaration//GEN-END:variables

    private void display() {
        DefaultTableModel model = (DefaultTableModel) tblTabletss.getModel();
        model.setRowCount(0);
            ArrayList<Tablet> tablet = ecoSystem.getPersonDirectory().getTabletList();
    
    
        for (Tablet t : tablet) {
            Object row[] = new Object[4];
            row[0] = t.getTabletName();
            row[1] = t.getTabletContent();
            row[2] = t.getTabletDosage();
            row[3] = t.getPrice();
            model.addRow(row);
        }
    }
}
