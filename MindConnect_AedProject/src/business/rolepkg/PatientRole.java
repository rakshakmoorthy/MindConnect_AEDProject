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
import userInterface.helpSeeker.PatientWorkAreaJPanel;


/**
 *
 * @author sameersdeshpande
 */


public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
                return new PatientWorkAreaJPanel(userProcessContainer, enterprise, account, business);

    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}