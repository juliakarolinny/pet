package com.seduc2.pet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

import java.time.LocalDate;
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String sexo;
    private String raca;
    private LocalDate dataNascimento;
    private String peso;
    private String cor;
    private boolean castrado;
    private String vacinacao;
    private String observacoes;
    private String especie;

    public Animal() {
    }

    public Animal(long id, String nome, String sexo, String raca, LocalDate dataNascimento, String peso, String cor, boolean castrado, String vacinacao, String observacoes, String especie ){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
        this.especie = especie;
    }
    public Animal(String nome, String sexo, String raca, LocalDate dataNascimento, String peso, String cor, boolean castrado, String vacinacao, String observacoes, String especie) {

        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
        this.especie = especie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
