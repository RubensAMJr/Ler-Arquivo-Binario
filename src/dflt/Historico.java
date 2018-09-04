/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dflt;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rubens Augusto Montibeller Jr , Artur Dallagnelo
 */
class Historico implements Serializable{
    
    private Date data;
    private double peso;
    private short altura;
    private double tempetatura;

    public Historico() {
    }

    public Historico(Date data, double peso, short altura, double tempetatura) {
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.tempetatura = tempetatura;
    }

   
    
    
    
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public short getAltura() {
        return altura;
    }

    public void setAltura(short altura) {
        this.altura = altura;
    }

    public double getTempetatura() {
        return tempetatura;
    }

    public void setTempetatura(double tempetatura) {
        this.tempetatura = tempetatura;
    }
    
    
    
}
