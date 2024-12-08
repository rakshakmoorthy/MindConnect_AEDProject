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
import userInterface.doctor.DoctorWorkAreaJPanel;
import userInterface.government.GovtSecJPanel;

/**
 *
 * @author sameersdeshpande
 */

public class GovtSecRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new GovtSecJPanel( userProcessContainer,  account,  business,  enterprise);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 
}