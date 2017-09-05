/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    @Transient
    private int id_aeronave,id_aeroporto_origem, id_aeroporto_chegada;

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
    
    public int getId_aeronave() {
        return id_aeronave;
    }

    public void setId_aeronave(int id_aeronave) {
        this.id_aeronave = id_aeronave;
    }

    public int getId_aeroporto_origem() {
        return id_aeroporto_origem;
    }

    public void setId_aeroporto_origem(int id_aeroporto_origem) {
        this.id_aeroporto_origem = id_aeroporto_origem;
    }

    public int getId_aeroporto_chegada() {
        return id_aeroporto_chegada;
    }

    public void setId_aeroporto_chegada(int id_aeroporto_chegada) {
        this.id_aeroporto_chegada = id_aeroporto_chegada;
    }
    
}
