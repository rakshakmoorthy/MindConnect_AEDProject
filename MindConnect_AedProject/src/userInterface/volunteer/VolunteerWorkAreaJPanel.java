/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.organizationpkg.DepartmentsOrganization;
import business.personpkg.Volunteer;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manvith
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;  
    private DepartmentsOrganization organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise , UserAccount userAccount, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = (DepartmentsOrganization)organization;
        this.ecoSystem = ecoSystem;
        
      
    }
    
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//        int w = getWidth();
//        int h = getHeight();
//        
//        Color c1 = new Color(153,197,85);
//        Color c2 = Color.white;
//     
//        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
//        setOpaque( false );
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, w, h);
//        setOpaque( true );
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        viewPersonalHelpRequestBtn = new javax.swing.JButton();
        manageVolunteerProfileBtn = new javax.swing.JButton();
        viewTestimonialsBtn = new javax.swing.JButton();
        viewAnonymousReqBtn = new javax.swing.JButton();
        viewVolProfileBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 33, 46));

        manageEnt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(255, 255, 255));
        manageEnt.setText("NGO Work Area");

        viewPersonalHelpRequestBtn.setBackground(new java.awt.Color(50, 192, 160));
        viewPersonalHelpRequestBtn.setText("View Personal Help Requests");
        viewPersonalHelpRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonalHelpRequestBtnActionPerformed(evt);
            }
        });

        manageVolunteerProfileBtn.setBackground(new java.awt.Color(50, 192, 160));
        manageVolunteerProfileBtn.setText("Update Profile ");
        manageVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVolunteerProfileBtnActionPerformed(evt);
            }
        });

        viewTestimonialsBtn.setBackground(new java.awt.Color(50, 192, 160));
        viewTestimonialsBtn.setText("View Testimonials");
        viewTestimonialsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTestimonialsBtnActionPerformed(evt);
            }
        });

        viewAnonymousReqBtn.setBackground(new java.awt.Color(50, 192, 160));
        viewAnonymousReqBtn.setText("View Anonymous Help Requests");
        viewAnonymousReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnonymousReqBtnActionPerformed(evt);
            }
        });

        viewVolProfileBtn.setBackground(new java.awt.Color(50, 192, 160));
        viewVolProfileBtn.setText("View Profile");
        viewVolProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVolProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPersonalHelpRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(viewTestimonialsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewAnonymousReqBtn)))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(manageEnt)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewPersonalHelpRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewAnonymousReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTestimonialsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVolunteerProfileBtnActionPerformed
//         UpdateVolunteerProfile updateVolunteerProfile = new UpdateVolunteerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
//         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//         userProcessContainer.add("UpdateVolunteerProfile", updateVolunteerProfile);
//         layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVolunteerProfileBtnActionPerformed

    private void viewPersonalHelpRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonalHelpRequestBtnActionPerformed
//        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
//        {
//        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
//        return;     
//        }
        ViewPersonalHelpRequestsJPanel viewHelpRequestsJPanel = new ViewPersonalHelpRequestsJPanel(userProcessContainer, userAccount, enterprise.getOrganizationDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewHelpRequestsJPanel", viewHelpRequestsJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPersonalHelpRequestBtnActionPerformed

    private void viewAnonymousReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnonymousReqBtnActionPerformed
        if(organization.getWorkQueue().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        } 
//         ViewAnonymousRequestJPanel viewAnonymousRequestJPanel = new ViewAnonymousRequestJPanel(userProcessContainer, userAccount,  organization, enterprise.getOrganizationDirectory());
//         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//         userProcessContainer.add("ViewAnonymousRequestJPanel", viewAnonymousRequestJPanel);
//         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAnonymousReqBtnActionPerformed

    private void viewTestimonialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTestimonialsBtnActionPerformed
        Volunteer volunteer = (Volunteer)userAccount.getPerson();
        if(volunteer.getTestimonialList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Testimonials to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
//         ViewTestimonialJPanel viewTestimonialJPanel = new ViewTestimonialJPanel(userProcessContainer, userAccount);
//         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//         userProcessContainer.add("ViewTestimonialJPanel", viewTestimonialJPanel);
//         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewTestimonialsBtnActionPerformed

    private void viewVolProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVolProfileBtnActionPerformed
//        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, userAccount);
//         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
//         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVolProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageVolunteerProfileBtn;
    private javax.swing.JButton viewAnonymousReqBtn;
    private javax.swing.JButton viewPersonalHelpRequestBtn;
    private javax.swing.JButton viewTestimonialsBtn;
    private javax.swing.JButton viewVolProfileBtn;
    // End of variables declaration//GEN-END:variables
}
