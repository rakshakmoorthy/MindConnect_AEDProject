package business;

import business.common.NeedHelp;
import business.enterprisepkg.Enterprise;
import business.Network.Network;
import business.organizationpkg.Organization;
import business.personpkg.Insurance;
import business.personpkg.Person;
import business.personpkg.Scheme;
import business.personpkg.Tablet;
import business.rolepkg.AdminRole;
import business.rolepkg.DepartmentsAdminRole;
import business.rolepkg.InsuranceAdminRole;
import business.rolepkg.DoctorRole;
import business.rolepkg.GovtSecRole;
import business.rolepkg.PatientRole;
import business.rolepkg.PharmacyAdminRole;
import business.rolepkg.SystemAdminRole;
import business.userAccountpkg.UserAccount;

/**
 *
 * @author manvith
 */
public class ConfigureASystem {

//    public static EcoSystem configure(){
//        
//        
//        
//        //Create a network
//        //create an enterprise
//        //initialize some organizations
//        //have some employees 
//        //create user account
//  
//        EcoSystem ecoSystem = populateEnterpriseData();
//        return ecoSystem;
//    }
    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();

        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();

        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        ua.setEnabled(true);

//        NeedHelp needHelp = system.addNeedHelp();
//        needHelp.setHelp("Snow Shovel");
//        needHelp.setHelp("Grass Cutting");
//        needHelp.setHelp("Gardening");
//        needHelp.setHelp("Grocery Shopping");
//Adding Network
        Network network = system.addNetwork();
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");

        Network network1 = system.addNetwork();
        network1.setCountry("United States");
        network1.setState("Massachusetts");
        network1.setCity("Bolyston");
        Network network2 = system.addNetwork();
        network2.setCountry("India");
        network2.setState("Karnataka");
        network2.setCity("Bengaluru");

        // Hospital
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("Tufts Medical Center", Enterprise.EnterpriseType.Hospital);
        //enterprise = network.getEnterpriseDirectory().addEnterprise("BostonHeartHelp", Enterprise.EnterpriseType.Insurance);
//        person = enterprise.getPersonDirectory().addPerson();
//        person.setLastName("Hospital");
//        person.setName();

        //Admin username and password
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("admin", "admin", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);

        //enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Departments);
        //Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Pharmacy);
        //person = organization.getPersonDirectory().addPerson();    
        // person.setFirstName("Radiology");
        // person.setLastName("Medical Store");
        // person.setName();
        // enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Patient);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Patient);
        Person person2 = organization.getPersonDirectory().addPerson();
        person2.setFirstName("Patient1");
        person2.setLastName("Mpatient");
        person2.setName();
        person2.setAge(78);

        Organization organization1 = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
      Person  person3 = organization1.getPersonDirectory().addPerson();
        person3.setFirstName("John");
        person3.setLastName("Deo");
        person3.setAge(78);
        person3.setAddress1("360 Huntington Avenue");
        person3.setGender("Male");
        person3.setCountry("United States");
        person3.setState("Massachussets");
        person3.setTown("Boston");
        person3.setZipCode("02115");
        person3.setPhoneNumber("3512308556");
        person3.setEmailId("doctor_One@gmail.com");

        person3.setName();
        // Antidepressants
        Tablet tab1 = system.getPersonDirectory().newTablet("Sertraline", "Zoloft", "50MG", 30);
        Tablet tab2 = system.getPersonDirectory().newTablet("Fluoxetine", "Prozac", "20MG", 30);
        Tablet tab3 = system.getPersonDirectory().newTablet("Escitalopram", "Lexapro", "10MG", 30);
        // Anti-anxiety medications
        Tablet tab4 = system.getPersonDirectory().newTablet("Alprazolam", "Xanax", "0.5MG", 30);
        Tablet tab5 = system.getPersonDirectory().newTablet("Lorazepam", "Ativan", "1MG", 30);
        // Antipsychotics
        Tablet tab6 = system.getPersonDirectory().newTablet("Quetiapine", "Seroquel", "25MG", 30);
        Tablet tab7 = system.getPersonDirectory().newTablet("Risperidone", "Risperdal", "2MG", 30);
        // Sleep medications
        Tablet tab8 = system.getPersonDirectory().newTablet("Zolpidem", "Ambien", "5MG", 30);


        Insurance insurance01 = system.getPersonDirectory().newBInsurance("Health Insurance - Basic Plan", "25000$", "$250 per month", "Up $25000 claim");
        Insurance insurance02 = system.getPersonDirectory().newSInsurance("Health Insurance - Standard Plan", "25000$", "$250 per month", "Up $125000 claim");
        Insurance insurance03 = system.getPersonDirectory().newSInsurance("Health Insurance - Standard Plan", "25000$", "$2500 per month", "Up $225000 claim");
        Insurance insurance04 = system.getPersonDirectory().newSInsurance("Health Insurance - Standard Plan", "25000$", "$2500 per month", "Up $215000 claim");
        Insurance insurance05 = system.getPersonDirectory().newPInsurance("Health Insurance - Premium Plan", "25000$", "$9000 per month", "Up $445000 claim");
        Insurance insurance06 = system.getPersonDirectory().newBInsurance("Health Insurance - Basic Plan", "25000$", "$250 per month", "Up $25000 claim");
        Insurance insurance07 = system.getPersonDirectory().newBInsurance("Health Insurance - Basic Plan", "25000$", "$250 per month", "Up $25000 claim");

        
           // SchemesDirectory schemeDirectory = business.getSchemedirectory();
        Scheme sch01 = system.getPersonDirectory().newScheme("MH101", "Mental Health Parity Act Coverage", "Ensures mental health benefits are covered equally with medical benefits", "80% coverage for outpatient therapy, full coverage for inpatient care");
        Scheme sch02 = system.getPersonDirectory().newScheme("MHMD", "Mental Health Medicaid Extension", "For individuals below 138% of federal poverty level needing mental health care", "100% coverage for essential mental health services");
        Scheme sch03 = system.getPersonDirectory().newScheme("CRISIS", "Crisis Intervention Coverage", "Emergency mental health services for acute mental health crises", "100% coverage for emergency interventions and initial stabilization");
        Scheme sch04 = system.getPersonDirectory().newScheme("YOUTH", "Youth Mental Health Initiative", "Comprehensive mental health coverage for individuals under 18", "90% coverage for therapy, full coverage for assessment and early intervention");
        Scheme sch05 = system.getPersonDirectory().newScheme("PTSD", "Trauma Support Program(TSP)", "Specialized coverage for trauma-related mental health services including PTSD treatment", "100% coverage for trauma-specific therapy and related medications");

        account = organization1.getUserAccountDirectory().addUserAccount("doctor", "doctor", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
//        account = enterprise.getUserAccountDirectory().addUserAccount("labrole", "labrole", person, new LabAdminRole());
//        account.setEnabled(true);
//        account.setNetwork(network);
        account = organization.getUserAccountDirectory().addUserAccount("patient", "patient", person, new PatientRole());
        account.setEnabled(true);
        account.setNetwork(network);
//        
//        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Lab);
//        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Blood);
//        person = organization.getPersonDirectory().addPerson();
//
//        person.setFirstName("Laboratory");
//        person.setLastName("Blood Bank");
//        person.setName();
//
//        account = organization.getUserAccountDirectory().addUserAccount("bsup", "bsup", person, new BloodAdminRole());
//        account.setNetwork(network);
//        account.setEnabled(true);
//
////        // Manager
////        person = organization.getPersonDirectory().addPerson();
////
////        person.setFirstName("Manager");
////        person.setLastName("Boston");
////        person.setName();
////
////        account = organization.getUserAccountDirectory().addUserAccount("bman", "bman", person, new HeartHelpManagerRole());
////        account.setNetwork(network);
////        account.setEnabled(true);
//
//        // Non Profit
        Enterprise enterprise2 = network.getEnterpriseDirectory().addEnterprise("Global Insurance Provide", Enterprise.EnterpriseType.Insurance);
        Organization organization3 = enterprise2.getOrganizationDirectory().addOrganization(Organization.Type.Insurance);
        //Organization organization4 = enterprise2.getOrganizationDirectory().addOrganization(Organization.Type.PersonalInsurance);

        person = enterprise2.getPersonDirectory().addPerson();
        person.setLastName("Insurance Manager");
        person.setName();
        account = enterprise2.getUserAccountDirectory().addUserAccount("CI", "CI", person, new InsuranceAdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
//        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
//        person = organization.getPersonDirectory().addPerson();
//
//        person.setFirstName("Donor");
//        person.setLastName("Boston");
//        person.setName();
//
//        account = organization.getUserAccountDirectory().addUserAccount("bdon", "bdon", person, new DonorAdminRole());
//        account.setNetwork(network);
//        account.setEnabled(true);

        // Insurance
        enterprise = network.getEnterpriseDirectory().addEnterprise("Insurance", Enterprise.EnterpriseType.Insurance);
        person = enterprise.getPersonDirectory().addPerson();
//        person.setLastName("Insurance Company");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("ins", "ins", person, new InsuranceAdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
//        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.CorporateInsurance);
//        person = organization.getPersonDirectory().addPerson();
//
//        person.setFirstName("Corporate");
//        person.setLastName("Insurance");
//        person.setName();
//
////        account = organization.getUserAccountDirectory().addUserAccount("bdoc", "bdoc", person, new DoctorRole());
////        account.setNetwork(network);
////        account.setEnabled(true);
//
//        // Govt
        Enterprise enterprise3 = network.getEnterpriseDirectory().addEnterprise("Govt", Enterprise.EnterpriseType.Government);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Govt Admin Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("bgt", "bgt", person, new GovtSecRole());
        account.setEnabled(true);
        account.setNetwork(network);
        Organization organization5 = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Schemes);
        person = organization.getPersonDirectory().addPerson();
        person.setFirstName("Government");
        person.setLastName("Schemes");
        person.setName();
        
        UserAccount account9 = enterprise.getUserAccountDirectory().addUserAccount("dt", "dt", person, new DepartmentsAdminRole());
        account.setEnabled(true);
        account.setNetwork(network);

//        account = organization.getUserAccountDirectory().addUserAccount("scheme", "scheme", person, new SchemesAdminRole());
//        account.setNetwork(network);
//        account.setEnabled(true);

        return system;
    }

}
