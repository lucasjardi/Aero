/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

/**
 *
 * @author DTI
 */

import javax.persistence.EntityManager;
import model.Aeronave;
import util.EntityManagerUtil;

public class PersistenciaHIbernate {
    
    public void insert(Aeronave st){
        EntityManager entitymanager = null;
        
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            entitymanager.persist(st);
            entitymanager.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
    }
}
