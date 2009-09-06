package managedBeans;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamas.dev.tarjanyi at gmail.com
 */

public class SimpleManagedSessionBean {
    private String sessionId="anything random";
    /** Creates a new instance of SimpleManagedSessionBean */
    public SimpleManagedSessionBean() {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

}
