/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organizationpkg;

import business.rolepkg.InsuranceAdminRole;
import business.rolepkg.DepartmentsAdminRole;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author rakshakmoorthy
 */
public class CorporateInsuranceOrganization extends Organization {
    
    public CorporateInsuranceOrganization()
    {
        super(Organization.Type.Insurance.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceAdminRole());
        return roles;
    }
}
