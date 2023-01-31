package com.registros.registro.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_ENDERECO")
public class RegistroEntityEndereco implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column
    private String estado;
    @Column
    private String cidade;
    @Column
    private String bairro;
    @Column

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    private String logradouro;

    @Override
    public String toString() {
        return "RegistroEntityEndereco{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
