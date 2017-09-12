/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.Aeronave;
import persist.AbstractRepository;
import persist.AeronaveHibernate;

/**
 *
 * @author DTI
 */
public class main {
    public static void main(String[] args) {
        Aeronave a = new Aeronave();
        
        a.setNome_empresa("para");
        a.setTipo_aeronave("Boeing");
        
        AeronaveHibernate ah = new AeronaveHibernate(Aeronave.class);
        ah.save(a);
        
//        ah.delete(a);
        Aeronave busca = ah.findById(1);
        System.out.println(busca.getNome_empresa());
        
    }
}
