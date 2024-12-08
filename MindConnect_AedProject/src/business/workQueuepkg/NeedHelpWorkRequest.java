/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueuepkg;
import business.common.NeedHelp;
import business.userAccountpkg.UserAccount;
import java.util.Date;

public class NeedHelpWorkRequest extends WorkRequest {
    
    private String requestId;
    private static int count = 000;
    private String comments;
    private NeedHelp needHelp;
    private String requestResult;
    private String requestType;  // e.g., "Counseling", "Therapy", "Crisis Intervention"
    private String patientName;
    private String urgencyLevel; // "Routine", "Soon", "Urgent", "Emergency"
    private String preferredSessionType; // "In-person", "Virtual", "Group"
    private boolean isAnonymous;
    private String primaryConcern; // "Anxiety", "Depression", "PTSD", etc.
    
    public NeedHelpWorkRequest() {
        StringBuffer sb = new StringBuffer();
        sb.append("MH"); // Changed from REQ to MH for Mental Health
        sb.append(count);
        requestId = sb.toString();
        count++;
    }
    
    // Existing getters and setters
    public String getComments() {
        return comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getRequestId() {
        return requestId;
    }
    
    public void setNeedHelp(NeedHelp needHelp) {
        this.needHelp = needHelp;
    }
    
    public NeedHelp getNeedHelp() {
        return needHelp;
    }
    
    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    
    public String getRequestResult() {
        return requestResult;
    }
    
    // New getters and setters for mental health specific fields
    public String getRequestType() {
        return requestType;
    }
    
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public String getUrgencyLevel() {
        return urgencyLevel;
    }
    
    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
    
    public String getPreferredSessionType() {
        return preferredSessionType;
    }
    
    public void setPreferredSessionType(String preferredSessionType) {
        this.preferredSessionType = preferredSessionType;
    }
    
    public boolean isAnonymous() {
        return isAnonymous;
    }
    
    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }
    
    public String getPrimaryConcern() {
        return primaryConcern;
    }
    
    public void setPrimaryConcern(String primaryConcern) {
        this.primaryConcern = primaryConcern;
    }
    
    @Override
    public String toString() {
        if (isAnonymous) {
            return "Anonymous Request - " + requestType;
        }
        return needHelp != null ? getNeedHelp().getHelp() : requestType;
    }
}