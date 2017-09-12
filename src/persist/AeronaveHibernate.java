/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import model.Aeronave;
import model.Voo;

/**
 *
 * @author DTI
 */
public class AeronaveHibernate extends AbstractRepository<Aeronave, Integer>{
    
    public AeronaveHibernate(Class<Aeronave> pPersistentClass) {
        super(pPersistentClass);
    }
    
    public void deleteAeronave(Aeronave a){
        EntityManager entM = null;
         
        try {
            entM.getTransaction().begin();
            entM.remove(entM.getReference(Aeronave.class, a.getId()));
            entM.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            entM.getTransaction().rollback();
        }
    }
}
