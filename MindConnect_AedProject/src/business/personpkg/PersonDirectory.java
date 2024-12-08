/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personpkg;

import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class PersonDirectory {

    private ArrayList<Volunteer> volunteerList;
    private ArrayList<Patient> patientList;
    ArrayList<Scheme> schemeList;

    public ArrayList<Insurance> getBasicInsuranceList() {
        return basicInsuranceList;
    }

    public void setBasicInsuranceList(ArrayList<Insurance> basicInsuranceList) {
        this.basicInsuranceList = basicInsuranceList;
    }

    public ArrayList<Insurance> getStandardInsuranceList() {
        return standardInsuranceList;
    }

    public void setStandardInsuranceList(ArrayList<Insurance> standardInsuranceList) {
        this.standardInsuranceList = standardInsuranceList;
    }

    public ArrayList<Insurance> getPremiumInsuranceList() {
        return premiumInsuranceList;
    }

    public void setPremiumInsuranceList(ArrayList<Insurance> premiumInsuranceList) {
        this.premiumInsuranceList = premiumInsuranceList;
    }

    public ArrayList<Scheme> getSchemeList() {
        return schemeList;
    }

    public void setSchemeList(ArrayList<Scheme> schemeList) {
        this.schemeList = schemeList;
    }
    private ArrayList<Person> personList;
    ArrayList<Tablet> tabletList;

    ArrayList<Insurance> basicInsuranceList;
    ArrayList<Insurance> standardInsuranceList;
    ArrayList<Insurance> premiumInsuranceList;

    public ArrayList<Tablet> getTabletList() {
        return tabletList;
    }

    public void setTabletList(ArrayList<Tablet> tabletList) {
        this.tabletList = tabletList;
    }

    public ArrayList<Tablet> getTabletordersList() {
        return tabletordersList;
    }

    public void setTabletordersList(ArrayList<Tablet> tabletordersList) {
        this.tabletordersList = tabletordersList;
    }
    ArrayList<Tablet> tabletordersList;

    public PersonDirectory() {
        volunteerList = new ArrayList<>();
        patientList = new ArrayList<>();
        personList = new ArrayList<>();
        tabletList = new ArrayList();
        tabletordersList = new ArrayList();
        basicInsuranceList = new ArrayList();
        standardInsuranceList = new ArrayList();
        premiumInsuranceList = new ArrayList();
        schemeList = new ArrayList();
    }

    public Volunteer addVolunteer() {
        Volunteer volunteer = new Volunteer();
        volunteerList.add(volunteer);
        return volunteer;
    }

    public void removeVolunteer(Volunteer volunteer) {
        volunteerList.remove(volunteer);
    }

    public Patient addPatient() {
        Patient customer = new Patient();
        patientList.add(customer);
        return customer;
    }

    public void removeCustomer(Patient customer) {
        patientList.remove(customer);
    }

    public ArrayList<Patient> getPaientList() {
        return patientList;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public Person addPerson() {
        Person person = new Person();
        personList.add(person);
        return person;
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Insurance newBInsurance(String plan, String coverage, String premium, String benefits) {
        Insurance I = new Insurance(plan, coverage, premium, benefits);
        basicInsuranceList.add(I);
        return I;
    }

    public Insurance newSInsurance(String plan, String coverage, String premium, String benefits) {
        Insurance I = new Insurance(plan, coverage, premium, benefits);
        standardInsuranceList.add(I);
        return I;
    }

    public Insurance newPInsurance(String plan, String coverage, String premium, String benefits) {
        Insurance I = new Insurance(plan, coverage, premium, benefits);
        premiumInsuranceList.add(I);
        return I;
    }

    public Tablet newTablet(String name, String contents, String dosage, int price) {

        Tablet t = new Tablet(name, contents, dosage, price);
        tabletList.add(t);
        return t;
    }

    public Tablet newOrderTablet(String name, String contents, String dosage, int quant, int price) {

        Tablet t = new Tablet(name, contents, dosage, quant, price);
        tabletordersList.add(t);
        return t;
    }

    public Scheme newScheme(String id, String name, String eligibility, String benefits) {

        Scheme s = new Scheme(id, name, eligibility, benefits);
        schemeList.add(s);
        return s;
    }
}
