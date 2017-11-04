/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Users;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author fauzianordlund
 */
public class UsersDAO {
    
    public UsersDAO() {
    }
    public void addNewUser(Users u){
        EntityManager em = Persistence.createEntityManagerFactory("UsersPU").createEntityManager();
        try {
            //em = getEntityManager();
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
