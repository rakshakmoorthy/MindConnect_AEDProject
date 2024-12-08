/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organizationpkg;

import business.rolepkg.PatientRole;
import business.rolepkg.Role;
import java.util.ArrayList;


/**
 *
 * @author rakshakmoorthy
 */

    public class PatientOrganization extends Organization {
    
     public PatientOrganization()
    {
        super(Organization.Type.Patient.getValue());
    }

      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
    }