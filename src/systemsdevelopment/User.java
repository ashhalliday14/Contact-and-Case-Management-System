/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

/**
 *
 * @author ashleigh.halliday
 */
public class User {
    private int loginID;
    private String username;
    private String password;
    private String role;

    //constructor
    public User(int loginID, String username, String password, String role) {
        this.loginID = loginID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    //getters and setters
    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
