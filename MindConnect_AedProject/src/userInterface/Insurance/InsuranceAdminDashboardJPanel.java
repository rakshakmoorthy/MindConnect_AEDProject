/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Insurance;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.personpkg.Insurance;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author manvith
 */
public class InsuranceAdminDashboardJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    Insurance selectedInsurance;

    /**
     * Creates new form InsuranceManagerWorkProfileJPanel
     */
    public InsuranceAdminDashboardJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIns = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(1, 33, 46));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAX Life Insurance");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 403, 50));

        jButton1.setText("Basic");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 100, -1, -1));

        jButton2.setText("Standard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 100, -1, -1));

        jButton3.setText("Premium");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 100, -1, -1));

        tblIns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Plan", "Coverage", "Premium", "Benefits"
            }
        ));
        jScrollPane1.setViewportView(tblIns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 128, 764, 153));

        btnBack2.setText("<Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 531, -1, -1));

        btnAdd.setBackground(new java.awt.Color(1, 33, 46));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 153));
        btnAdd.setText("Manage Insurance Plans");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 280, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblIns.getModel();
        model.setRowCount(0);
        ArrayList<Insurance> insurance = ecoSystem.getPersonDirectory().getBasicInsuranceList();
        for (Insurance i : insurance) {
            Object row[] = new Object[4];
            row[0] = i.getPlan();
            row[1] = i.getCoverage();
            row[2] = i.getPremium();
            row[3] = i.getBenefits();
            model.addRow(row);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblIns.getModel();
        model.setRowCount(0);
        ArrayList<Insurance> insurance = ecoSystem.getPersonDirectory().getStandardInsuranceList();
        for (Insurance i : insurance) {
            Object row[] = new Object[4];
            row[0] = i.getPlan();
            row[1] = i.getCoverage();
            row[2] = i.getPremium();
            row[3] = i.getBenefits();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblIns.getModel();
        model.setRowCount(0);
        ArrayList<Insurance> insurance = ecoSystem.getPersonDirectory().getPremiumInsuranceList();
        for (Insurance i : insurance) {
            Object row[] = new Object[4];
            row[0] = i.getPlan();
            row[1] = i.getCoverage();
            row[2] = i.getPremium();
            row[3] = i.getBenefits();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddNewInsuranceJPanel panel = new AddNewInsuranceJPanel(userProcessContainer, userAccount,enterprise,ecoSystem);
        userProcessContainer.add("AddNewInsuranceJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblIns;
    // End of variables declaration//GEN-END:variables

}
