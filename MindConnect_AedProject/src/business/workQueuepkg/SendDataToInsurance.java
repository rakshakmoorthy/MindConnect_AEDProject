/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workQueuepkg;

/**
 *
 * @author shrivatsanaragund
 */
public class SendDataToInsurance extends WorkRequest {
    
    private String sendDataRequestId;
    private static int count = 000;
    private String patName;
    private String plan;
    private String benefit;
    private String premium;
    private String coverage;
   
    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    

    public SendDataToInsurance() {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
    }
    
    
    
}
