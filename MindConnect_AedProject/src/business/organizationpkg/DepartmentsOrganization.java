/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.Role;
import business.rolepkg.DepartmentsAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rakshakmoorthy
 */
public class DepartmentsOrganization extends Organization {
    
    public DepartmentsOrganization()
    {
        super(Organization.Type.Departments.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DepartmentsAdminRole());
        return roles;
    }
}
