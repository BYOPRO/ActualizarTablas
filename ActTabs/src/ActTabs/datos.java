/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActTabs;

/**
 *
 * @author francisco
 */
public class datos {
    private String host;
    private String BD;
    private String User;
    private String Pass;

    public datos() {
    }

    public datos(String host, String BD, String User, String Pass) {
        this.host = host;
        this.BD = BD;
        this.User = User;
        this.Pass = Pass;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the BD
     */
    public String getBD() {
        return BD;
    }

    /**
     * @param BD the BD to set
     */
    public void setBD(String BD) {
        this.BD = BD;
    }

    /**
     * @return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * @return the Pass
     */
    public String getPass() {
        return Pass;
    }

    /**
     * @param Pass the Pass to set
     */
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
}
