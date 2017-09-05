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

/**
 *
 * @author DTI
 */

@Entity
public class Aeronave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AERONAVE_ID")
    private int id;
    
    private String nome_empresa;
    private String tipo_aeronave;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getTipo_aeronave() {
        return tipo_aeronave;
    }

    public void setTipo_aeronave(String tipo_aeronave) {
        this.tipo_aeronave = tipo_aeronave;
    }
    
    
    
}
