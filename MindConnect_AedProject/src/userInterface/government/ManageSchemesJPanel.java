/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.government;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.personpkg.Scheme;
import business.personpkg.Tablet;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sameersdeshpande
 */
public class ManageSchemesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSchemesJPanel
     */
         private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    public ManageSchemesJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        populate();
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
        tblsch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblsch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Scheme ID", "Scheme Name", "Eligibility", "Benefits"
            }
        ));
        jScrollPane1.setViewportView(tblsch);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 108, 728, 152));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("Governmental Schemes:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 43, -1, -1));

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 555, 76, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsch;
    // End of variables declaration//GEN-END:variables
    private void populate() {

        DefaultTableModel model = (DefaultTableModel) tblsch.getModel();
        model.setRowCount(0);
      ArrayList<Scheme> sch = ecoSystem.getPersonDirectory().getSchemeList();
        for (Scheme s : sch) {
            Object row[] = new Object[4];
            row[0] = s.getSchemeid();
            row[1] = s.getSchemeName();
            row[2] = s.getSchemeEligibility();
            row[3] = s.getSchemeBenefits();
            model.addRow(row);
        }
    }
}
