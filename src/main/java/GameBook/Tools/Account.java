/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook.Tools;

/**
 *
 * @author Admin
 */
public class Account {
   private String username ;
   private String passwordString;

    public Account(String username, String passwordString) {
        this.username = username;
        this.passwordString = passwordString;
    }

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }
   
   
}
