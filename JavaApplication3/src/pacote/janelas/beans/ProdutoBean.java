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
public class ProdutoBean {
    int id, tipo;
    String nome, descricao;

    public ProdutoBean(){
    }
    public ProdutoBean(int id, int tipo, String nome, String descricao){
        this.id =  id;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao =  descricao;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
