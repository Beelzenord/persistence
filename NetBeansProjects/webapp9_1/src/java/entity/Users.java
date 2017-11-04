/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fauzianordlund
 */
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
     private String username;
    private String pass;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } public String getUsername() {
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
    

    @Override
    public int hashCode() {
        int hash = 0;
        
        return hash;
    }


    @Override
    public String toString() {
        return "entity.Users[ id=" + id + " ]";
    }
    
}
