/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.personpkg;

/**
 *
 * @author sameersdeshpande
 */
public class Insurance extends Person{
    
    private String plan;
    private String coverage;
    private String premium;
    private String benefits;

    public Insurance(String plan, String coverage, String premium, String benefits) {
        this.plan = plan;
        this.coverage = coverage;
        this.premium = premium;
        this.benefits= benefits;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    
}
