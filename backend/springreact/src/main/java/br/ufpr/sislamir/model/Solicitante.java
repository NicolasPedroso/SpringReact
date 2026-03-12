package br.ufpr.sislamir.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Solicitante")
public class Solicitante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 100)
    private String email;
    
    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @Column(name = "user_key", nullable = false, length = 100)
    private String userKey;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    @Column(name = "userlevel", nullable = false)
    private Integer userLevel = 0;

    @Column(name = "admlevel", nullable = false)
    private Integer admLevel = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getAdmLevel() {
        return admLevel;
    }

    public void setAdmLevel(Integer admLevel) {
        this.admLevel = admLevel;
    }
}
