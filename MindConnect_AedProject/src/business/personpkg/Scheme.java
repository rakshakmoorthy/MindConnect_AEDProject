/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.personpkg;

/**
 *
 * @author sameersdeshpande
 */
public class Scheme extends Person {
    private String schemeid;
      private String schemeName;

    Scheme(String id, String name, String eligibility, String benefits) {
        this.schemeid = id;
        this.schemeName = name;
        this.schemeEligibility = eligibility;
        this.schemeBenefits = benefits;
    }

    public String getSchemeid() {
        return schemeid;
    }

    public void setSchemeid(String schemeid) {
        this.schemeid = schemeid;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getSchemeEligibility() {
        return schemeEligibility;
    }

    public void setSchemeEligibility(String schemeEligibility) {
        this.schemeEligibility = schemeEligibility;
    }

    public String getSchemeBenefits() {
        return schemeBenefits;
    }

    public void setSchemeBenefits(String schemeBenefits) {
        this.schemeBenefits = schemeBenefits;
    }
    private String schemeEligibility;
    private String schemeBenefits;
}
