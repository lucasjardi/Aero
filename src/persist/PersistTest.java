/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.util.List;
import javax.persistence.EntityManager;
import util.EntityManagerUtil;

/**
 *
 * @author DTI
 */
public class PersistTest implements IPersistMetodos{
    
    EntityManager entitymanager = null;
    
    @Override
    public <T> void insert(T objeto) {
        try{
            entitymanager = EntityManagerUtil.getEntityManager();
            entitymanager.getTransaction().begin();
            entitymanager.persist(objeto);
            entitymanager.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            entitymanager.close();
        }
    }

    @Override
    public <T> T find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void merge(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void remove(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
