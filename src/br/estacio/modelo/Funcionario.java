package br.estacio.modelo;

import java.sql.Date;

public class Funcionario {
    
    private int matricula;
    private String nome;
    private String email;
    private Date dt_nasc;
    private String senha;

    public Funcionario(int matricula, String nome, String email, Date dt_nasc, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dt_nasc = dt_nasc;
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
