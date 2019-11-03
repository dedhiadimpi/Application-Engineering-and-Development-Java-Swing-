/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author dedhi
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    @Override
    public ArrayList<String> getSupportedRole() {
        return null;
        //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
