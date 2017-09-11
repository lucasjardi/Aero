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
public class Itinerario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITINERARIO_ID")
    private int numero_reserva;
    
    @Transient
    private int idPassageiro;
    @Transient
    private int numero_voo;
    
    private String numero_assento;
    private String qtd_bagagem;
    private String status;

    public int getNumero_reserva() {
        return numero_reserva;
    }

    public void setNumero_reserva(int numero_reserva) {
        this.numero_reserva = numero_reserva;
    }

    public String getNumero_assento() {
        return numero_assento;
    }

    public void setNumero_assento(String numero_assento) {
        this.numero_assento = numero_assento;
    }

    public String getQtd_bagagem() {
        return qtd_bagagem;
    }

    public void setQtd_bagagem(String qtd_bagagem) {
        this.qtd_bagagem = qtd_bagagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public int getNumero_voo() {
        return numero_voo;
    }

    public void setNumero_voo(int numero_voo) {
        this.numero_voo = numero_voo;
    }
    
    
}
