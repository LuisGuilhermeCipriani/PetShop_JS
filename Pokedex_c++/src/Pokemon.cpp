#include "Pokemon.h"

Pokemon::Pokemon(){
}

Pokemon::~Pokemon(){
}

string Pokemon::getNome(){
    return nome;
}

void Pokemon::setNome(string novoNome){
    nome=novoNome;
}

int Pokemon::getId(){
    return id;
}

void Pokemon::setId(int novoId){
    id=novoId;
}

string Pokemon::getTipo(){
    return tipo;
}

void Pokemon::setTipo(string novoTipo){
    tipo=novoTipo;
}
