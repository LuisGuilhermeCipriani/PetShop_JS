/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AnimalDao;
import java.util.ArrayList;
import java.util.List;
import model.Animal;

/**
 *
 * @author cipri
 */
public class AnimalController {
    private Animal animal;
    private AnimalDao animalDao;

    
    public AnimalController() {
        animal = new Animal();
        animalDao = new AnimalDao();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Animal> getListaAnimais() {
        return animalDao.buscar();
    }
    
    public void cadastroAnimal(){
        animalDao.inserir(animal);
    }
    
    public Animal buscaAnima(String nome){
        nome.toLowerCase().trim();
        for(Animal animal: animalDao.buscar()){
            if(nome.equals(animal.getNome().toLowerCase().trim())){
                return animal;
            }
        }
        return null;
    }
    
    public int conversaoIdadeCachorro(){
        int idadeCachorro;
        for(Animal animal: animalDao.buscar()){
            idadeCachorro = animal.getIdade()*7;
            return idadeCachorro;
        }
        return 0;
    }
    
    public int conversaoIdadeGato(){
        int idadeGato;
        for(Animal animal: animalDao.buscar()){
            idadeGato = animal.getIdade()*7;
            return idadeGato;
        }
        return 0;
    }
}
