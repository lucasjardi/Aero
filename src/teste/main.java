/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.Aeronave;
import persist.AbstractRepository;

/**
 *
 * @author DTI
 */
public class main {
    public static void main(String[] args) {
        Aeronave a = new Aeronave();
        
        a.setNome_empresa("para");
        a.setTipo_aeronave("Boeing");
        
//        AbstractRepository aux = new AbstractRepository(Aeronave);
//        aux.insert(a);
        
    }
}
