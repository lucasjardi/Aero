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

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Aeronave;
import util.EntityManagerUtil;

public class PersistenciaHIbernate {
    EntityManager entitymanager = null;
    
    public void insert(Aeronave st){
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
    
    public Aeronave find(int id){
        
        Aeronave x = null;        
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            x = entitymanager.find(Aeronave.class, id);
            entitymanager.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
        
        return x;
        
    }
    
    public void merge(Aeronave x){
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            entitymanager.merge(x);
            entitymanager.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
    }
    
    public void remove(Aeronave x){
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            entitymanager.remove(entitymanager.getReference(Aeronave.class, x.getId()));
            entitymanager.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
    }
    
    public List<Aeronave> list(){
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            
            String q = "from Aeronave st";
            
            //1
            
            TypedQuery<Aeronave> tp = entitymanager.createQuery(q,Aeronave.class);
            List<Aeronave> x = tp.getResultList();
            
            return x;
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
        return null;
    }
    
    
}
