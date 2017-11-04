/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.UsersDAO;
import entity.Users;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fauzianordlund
 */
@ManagedBean
@SessionScoped
public class UserBean {
    private String username;
    private String pass;
    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public void addUser(){
        Users user = new Users();
     //   user.setId(2);
        user.setUsername(getUsername());
        user.setPass(getPass());
        UsersDAO udao = new UsersDAO();
        udao.addNewUser(user);
    }
}
