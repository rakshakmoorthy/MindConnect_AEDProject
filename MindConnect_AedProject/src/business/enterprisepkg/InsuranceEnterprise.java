/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisepkg;

import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author rakshakmoorthy
 */
public class InsuranceEnterprise extends Enterprise{

    @Override
    public ArrayList<Role> getSupportedRole() {
    return null;
    }
    
    public InsuranceEnterprise(String name)
    {
     super(name, Enterprise.EnterpriseType.Insurance);  
    }
    
    
}
