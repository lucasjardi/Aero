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
        
        a.setNome_empresa("gol");
        a.setTipo_aeronave("Boeing");
        
        AeronaveHibernate ah = new AeronaveHibernate();
        ah.save(a);
        
//        ah.delete(a);
//        Aeronave busca = ah.findById(1);
//        System.out.println(busca.getNome_empresa());

//        for(Aeronave aux:ah.findByNomeEmpresa("gol"))
//            System.out.println(aux.getTipo_aeronave());
       
//        for(Aeronave aux:ah.listTipoAeronaveLike("Bo"))
//            System.out.println(aux.getTipo_aeronave());

    
        
    }
}
