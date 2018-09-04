/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dflt;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rubens Augusto Montibeller Jr , Artur Dallagnelo
 */
public class Animal implements Serializable{
    
    private int identificacao;
    private ArrayList<Historico> historicos;

    
    public Animal(){
        this.historicos = new ArrayList<>();
    }

    public Animal(int identificacao) {
        this.identificacao = identificacao;
        this.historicos = new ArrayList<>();
    }
    
    
    

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
    
    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }

    public ArrayList<Historico> getHistoricos() {
        return historicos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.identificacao != other.identificacao) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
