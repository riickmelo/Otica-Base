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
public class ColaboradorBean {
    
    String nome;
    String telefone;
    int nvAcesso;
    String senha;
    String login;
    
    public ColaboradorBean(){
    }

    public ColaboradorBean(String nome,String telefone, int nvAcesso, String senha, String login){
        this.nome =  nome;
        this.telefone = telefone;
        this.nvAcesso = nvAcesso;
        this.senha = senha;
        this.login = login;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNvAcesso() {
        return nvAcesso;
    }

    public void setNvAcesso(int nvAcesso) {
        this.nvAcesso = nvAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
