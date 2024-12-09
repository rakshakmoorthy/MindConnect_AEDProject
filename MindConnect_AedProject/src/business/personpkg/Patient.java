
package business.personpkg;
import business.Network.Network;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author manvith
 */
public class Patient extends Person{
    
    private String helpSeekerId;
    private static int count = 001;
    private boolean shareVitalInfo = false;
    private boolean hasSensorDevice = false;
    private boolean hasCardiacProb = false;
    private boolean getAlerts = false;
  
    private ArrayList<String> vitalSignTrackList;
    private boolean sendDataToDoctor = false;
   
    
    
    public Patient()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("CUST");
        sb.append(count);
        helpSeekerId = sb.toString();
        count++;
        
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

   

  
    public String getHelpSeekerId() {
        return helpSeekerId;
    }
    
      
       
  
  
  
   

   
     

    public void setVitalSignTrackList(ArrayList<String> vitalSignTrackList) {
        this.vitalSignTrackList = new ArrayList<>();
        this.vitalSignTrackList = vitalSignTrackList;
    }

  public ArrayList<String> getVitalSignTrackList() {
        return vitalSignTrackList;
    }

    

    public boolean isShareVitalInfo() {
        return shareVitalInfo;
    }

    public void setShareVitalInfo(boolean shareVitalInfo) {
        this.shareVitalInfo = shareVitalInfo;
    }

    public boolean isHasSensorDevice() {
        return hasSensorDevice;
    }

    public void setHasSensorDevice(boolean hasSensorDevice) {
        this.hasSensorDevice = hasSensorDevice;
    }

    public boolean isGetAlerts() {
        return getAlerts;
    }

    public void setGetAlerts(boolean getAlerts) {
        this.getAlerts = getAlerts;
    }

    public boolean isHasCardiacProb() {
        return hasCardiacProb;
    }

    public void setHasCardiacProb(boolean hasCardiacProb) {
        this.hasCardiacProb = hasCardiacProb;
    }

    public boolean isSendDataToDoctor() {
        return sendDataToDoctor;
    }

    public void setSendDataToDoctor(boolean sendDataToDoctor) {
        this.sendDataToDoctor = sendDataToDoctor;
    }
 
}
