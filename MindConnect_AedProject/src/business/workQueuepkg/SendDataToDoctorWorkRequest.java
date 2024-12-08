/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueuepkg;

import business.sensor.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class SendDataToDoctorWorkRequest extends WorkRequest{
    
    private String sendDataRequestId;
    private static int count = 000;
    private ArrayList<VitalSign> vitalSignList;
    private String patientName;
    private String day;
    private String timeslot;
    private String allergies;
    private String medication;
    private String pgender;

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDay() {
        return day;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getPgender() {
        return pgender;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    private String page;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    private String newMedication;
    private String reqResult;
   
    
     public SendDataToDoctorWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
        vitalSignList = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        
        return this.sendDataRequestId;       
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setNewMedication(String newMedication) {
        this.newMedication = newMedication;
    }

    public String getNewMedication() {
        return newMedication;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public String getReqResult() {
        return reqResult;
    }

   
   
     
     
}
