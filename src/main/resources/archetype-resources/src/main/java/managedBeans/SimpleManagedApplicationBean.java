package managedBeans;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamas.dev.tarjanyi at gmail.com
 */
public class SimpleManagedApplicationBean {
    /*
     * Do not forget to internationalize this.
     */

    private String applicationName = "Application Name";

    /** Creates a new instance of SimpleManagedApplicationBean */
    public SimpleManagedApplicationBean() {
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

}
