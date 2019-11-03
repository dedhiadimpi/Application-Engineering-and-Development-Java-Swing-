/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.UserAccount.UserAccount;
import com.sun.accessibility.internal.resources.accessibility;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        //Create admin org
        AdminOrganization adminOrganization = new AdminOrganization();
        //add created admin org into busi
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        //create a new emp
        Employee employee = new Employee();
        employee.setName("Mike");
        //Craete a new acc
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("admin");
        userAccount.setPassword("admin");
        userAccount.setRole("Admin");
        
        //assign the acc to emp
        userAccount.setEmployee(employee);
        //add the emloyy into admin org
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        //add the acc in admin org
         adminOrganization.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
         Employee employee1=new Employee();
        employee1.setName("Ben");
        
        UserAccount account1= new UserAccount();
        account1.setUsername("lab");
        account1.setPassword("lab");
        account1.setRole("Lab Assistant");
        account1.setEmployee(employee1);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        
        Employee employee2=new Employee();
        employee2.setName("Jackie");
        
        UserAccount account2= new UserAccount();
        account2.setUsername("doctor");
        account2.setPassword("doctor");
        account2.setRole("Doctor");
        account2.setEmployee(employee2);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee2);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        
        return business;
    }
    
}
