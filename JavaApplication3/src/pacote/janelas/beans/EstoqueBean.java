/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.janelas.beans;

/**
 *
 * @author henri
 */
public class EstoqueBean {
    int id, qtd;
    String nmProd;
    public EstoqueBean(){}
    
    public EstoqueBean(int id, int qtd, String nmProd){
        this.id = id;
        this.qtd =  qtd;
        this.nmProd =  nmProd;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNmProd() {
        return nmProd;
    }

    public void setNmProd(String nmProd) {
        this.nmProd = nmProd;
    }
    
    
    
}
