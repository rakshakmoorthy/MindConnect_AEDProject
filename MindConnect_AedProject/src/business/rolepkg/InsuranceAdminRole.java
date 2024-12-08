/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;
import userInterface.Insurance.InsuranceAdminDashboardJPanel;
import userInterface.doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author shrivatsanaragund
 */
public class InsuranceAdminRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceAdminDashboardJPanel(userProcessContainer, account,enterprise,business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 
}