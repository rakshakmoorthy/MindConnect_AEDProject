/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workQueuepkg;

import java.util.ArrayList;

/**
 *
 * @author shrivatsanaragund
 */
public class SendDataToPatientRequest extends WorkRequest {

    private String patientName;
    private String age;
    private String gender;
    private String day;
    private String timeslot;
    private String allergies;
    private String symptoms;
    private String drComments;
    private static int count = 000;
    private String sendDataRequestId;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDrComments() {
        return drComments;
    }

    public void setDrComments(String drComments) {
        this.drComments = drComments;
    }

    public SendDataToPatientRequest() {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
    }

    @Override
    public String toString() {

        return this.sendDataRequestId;
    }
}
