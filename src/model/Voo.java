/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author DTI
 */

@Entity
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOO_ID")
    private int numero_voo;
    
    private String data_saida;
    private String data_chegada;
    
    
    @ManyToOne
    @JoinColumn(name="id_aeronave",foreignKey = @ForeignKey(name="FK_aeronave"))
    private Aeronave aeronave;
    
    @ManyToOne
    @JoinColumn(name="id_aeroporto_origem",foreignKey = @ForeignKey(name="FK_aeroporto_origem"))
    private Aeroporto aeroporto_origem;
    
    @ManyToOne
    @JoinColumn(name="id_aeroporto_chegada",foreignKey = @ForeignKey(name="FK_aeroporto_chegada"))
    private Aeroporto aeroporto_chegada;
    
    

    public Aeroporto getAeroporto_origem() {
        return aeroporto_origem;
    }

    public void setAeroporto_origem(Aeroporto aeroporto_origem) {
        this.aeroporto_origem = aeroporto_origem;
    }

    public Aeroporto getAeroporto_chegada() {
        return aeroporto_chegada;
    }

    public void setAeroporto_chegada(Aeroporto aeroporto_chegada) {
        this.aeroporto_chegada = aeroporto_chegada;
    }
//
    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
    
    

    public int getNumero_voo() {
        return numero_voo;
    }

    public void setNumero_voo(int numero_voo) {
        this.numero_voo = numero_voo;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public String getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(String data_chegada) {
        this.data_chegada = data_chegada;
    }
    
}
