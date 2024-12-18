/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.helpSeeker;


import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.personpkg.Tablet;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manvith
 */
public class OrderMedicinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderMedicinesJPanel
     */
        private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    public OrderMedicinesJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        //populateTabletModel();
        populateCartTable();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabletCart = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 33, 46));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicart");

        tblTabletCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tablet name", "Tablet content", "Tablet dosage", "Tablet quantity", "Price"
            }
        ));
        jScrollPane3.setViewportView(tblTabletCart);

        jButton2.setBackground(new java.awt.Color(50, 192, 160));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setText("Checkout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(17, 180, 205));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(">>Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               JOptionPane.showMessageDialog(this, "Thank you for shopping with Medicart.");
                 DefaultTableModel model = (DefaultTableModel) tblTabletCart.getModel();
        model.setRowCount(0);
        ecoSystem.getPersonDirectory().getTabletordersList().clear();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTabletCart;
    // End of variables declaration//GEN-END:variables

    
    
//     private void populateTabletModel() {
//
//        DefaultTableModel model = (DefaultTableModel) tblTabletss.getModel();
//        model.setRowCount(0);
//            ArrayList<Tablet> tablet = ecoSystem.getPersonDirectory().getTabletList();
//    
//    
//        for (Tablet t : tablet) {
//            Object row[] = new Object[4];
//            row[0] = t.getTabletName();
//            row[1] = t.getTabletContent();
//            row[2] = t.getTabletDosage();
//            row[3] = t.getPrice();
//            model.addRow(row);
//        }
//     }
        
     private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) tblTabletCart.getModel();

        model.setRowCount(0);
        ArrayList<Tablet> tablet = ecoSystem.getPersonDirectory().getTabletordersList();
        for (Tablet t : tablet) {
            Object row[] = new Object[5];
            row[0] = t.getTabletName();
            row[1] = t.getTabletContent();
            row[2] = t.getTabletDosage();
            row[3] = t.getQuantity();
            row[4] = t.getQuantity()*t.getPrice();

            model.addRow(row);
        }
    }
    
}
