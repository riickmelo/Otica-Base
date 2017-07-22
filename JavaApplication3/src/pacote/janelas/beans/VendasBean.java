/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.janelas.beans;

import java.sql.Date;

/**
 *
 * @author henri
 */
public class VendasBean {
    int id, idCliente, idProduto;
    Date dtVenda;
    float valor;
    
    public VendasBean(){
    }
    public VendasBean (int id, int idCliente, int idProduto, Date dtVenda, float valor){
        this.id = id;
        this.idCliente =  idCliente;
        this.idProduto = idProduto;
        this.dtVenda = dtVenda;
        this.valor =  valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
