package managedBeans;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamas.dev.tarjanyi at gmail.com
 */

public class SimpleManagedRequestBean {
    private String userName="UserName";
    /** Creates a new instance of SimpleManagedRequestBean */
    public SimpleManagedRequestBean() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
