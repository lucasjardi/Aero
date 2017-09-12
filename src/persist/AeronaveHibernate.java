/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import model.Aeronave;
import model.Voo;
import util.EntityManagerUtil;

/**
 *
 * @author DTI
 */
public class AeronaveHibernate extends AbstractRepository<Aeronave, Integer>{
    EntityManager entM;
    
    public AeronaveHibernate() {
        super(Aeronave.class);
        entM = EntityManagerUtil.getEntityManager();
    }
    
    public void deleteAeronave(Aeronave a){
        try {
            entM.getTransaction().begin();
            entM.remove(entM.getReference(Aeronave.class, a.getId()));
            entM.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            entM.getTransaction().rollback();
        }
    }
    
    public List<Aeronave> findByNomeEmpresa(String nomeEmpresa){             
        try {
            entM.getTransaction().begin();
            
            String q = "from Aeronave st where nome_empresa = ?1";
            List<Aeronave> t = entM.createQuery(q).setParameter(1,nomeEmpresa).getResultList();
            
            entM.getTransaction().commit();
            return t;
        } catch (Exception e){
            e.printStackTrace();
            entM.getTransaction().rollback();
        }
        return null;
    }
    
    public List<Aeronave> listTipoAeronaveLike(String expression){
        try {
            entM.getTransaction().begin();
            
            String q = "from Aeronave st where tipo_aeronave like :key";
            List<Aeronave> t = entM.createQuery(q).setParameter("key","%" + expression + "%").getResultList();
            
            entM.getTransaction().commit();
            return t;
        } catch (Exception e){
            e.printStackTrace();
            entM.getTransaction().rollback();
        }
        return null;
    }
}
