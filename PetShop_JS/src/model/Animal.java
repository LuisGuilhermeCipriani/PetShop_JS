/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cipri
 */
public class Animal {
    private String nome;
    private int idade;
    private int id;
    private Tipo tipo;

    public Animal() {
    }

    public Animal(String nome, int idade, int id, Tipo tipo) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Tipo getTipo(){
        return tipo;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
}
